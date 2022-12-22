package com.pda.mobile.model.services;

import java.util.ArrayList;
import java.util.List;

import com.pda.mobile.model.entities.dto.builderDto;
import com.pda.mobile.model.reporitories.*;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccBuilder;
import com.pda.mobile.model.entities.PcccDevice;
import com.pda.mobile.response.data.BuildingInfor;
import com.pda.mobile.response.data.BuildingOwnerInfor;
import com.pda.mobile.response.data.CenterDeviceInfor;

@Service
public class PcccSummaryService {

	@Autowired
	public PcccBuilderRepository pcccBuilderRepository;

	@Autowired
	public BuilderRepository builderRepository;
	@Autowired
	public PcccDeviceRepository pcccDeviceRepository;
	@Autowired	
	public PcccSensorRepository pcccSensorRepository;
	@Autowired
	public PcccInfringeHandleRepository pcccInfringeHandleRepository;
	@Autowired
	public Environment env;
	private static final Logger log = Logger.getLogger(PcccSummaryService.class.getName());

	public BuildingOwnerInfor generateOwnerInfor(String userId)
	{
		BuildingOwnerInfor bOf = new BuildingOwnerInfor();
		bOf.setUserId(userId);
		bOf.setOwnerBuildingList(generateData(userId));
		return bOf;
	}
	private ArrayList<BuildingInfor> generateData(String userId)
	{
		
		ArrayList<BuildingInfor> buildingInfor = new ArrayList<BuildingInfor>();
		List<builderDto> lPcccBuilder = builderRepository.getBuilderByUserId(userId);
		if (lPcccBuilder.size() > 0)
		{
			for (int i =0; i < lPcccBuilder.size();i++)
			{
				BuildingInfor temp = new BuildingInfor();
				temp.setSiteId(lPcccBuilder.get(i).getBuilderId());
				temp.setAddress(lPcccBuilder.get(i).getAddress());
				temp.setName(lPcccBuilder.get(i).getName());
				temp.setLongitude(lPcccBuilder.get(i).getLong_());
				temp.setLatitude(lPcccBuilder.get(i).getLat_());
				// Add Device
				temp.setCenterDevices(generateDeviceInfor(temp));
				
				// Add issue value
				temp.setNumberOfCenterDevices(temp.getCenterDevices().size());
				temp.setViolations(pcccInfringeHandleRepository.getByBuilderId(lPcccBuilder.get(i).getBuilderId()));
				temp.setNumberOfInfringes(temp.getViolations().size());
				buildingInfor.add(temp);
			}
		}
		
		return buildingInfor;
	}
	private ArrayList<CenterDeviceInfor> generateDeviceInfor( BuildingInfor buildingInfor)
	{
		ArrayList<CenterDeviceInfor> lCDI = new ArrayList<CenterDeviceInfor>();
		List<PcccDevice> lPcccDevice = pcccDeviceRepository.getByBuilderId(buildingInfor.getSiteId());
		if (lPcccDevice.size() > 0)
		{
			for (int i =0; i < lPcccDevice.size(); i++)
			{
				CenterDeviceInfor tempDevice = new CenterDeviceInfor();
				tempDevice.setId(lPcccDevice.get(i).getDeviceId());
				tempDevice.setImei(lPcccDevice.get(i).getImei());
				tempDevice.setBattery_health(lPcccDevice.get(i).getBattery());
				tempDevice.setPostion(lPcccDevice.get(i).getPostion());
				tempDevice.setType(lPcccDevice.get(i).getNameOfDeviceType());
				tempDevice.setConnectStatus(String.valueOf(lPcccDevice.get(i).getIsonline()));
				tempDevice.setSignal_strength(String.valueOf(lPcccDevice.get(i).getSignalStrength()));
				
				try
				{
					if (Integer.valueOf(lPcccDevice.get(i).getBattery()) < Integer.valueOf(env.getProperty("battery.limit").trim()))
					{
						tempDevice.setIsbatteryIssue(1);
					}
					if (Integer.valueOf(lPcccDevice.get(i).getSignalStrength()) < Integer.valueOf(env.getProperty("signal.limit").trim()))
					{
						tempDevice.setIsSignalIssue(1);
					}
				}
				catch( NumberFormatException e)
				{
					log.error("NumberFormatException when parse Baterry and Signal");
				}
				// Add Sensor Data
				//tempDevice.setSensors(pcccSensorRepository.getSensorByBuilderId(buildingInfor.getSiteId()));
				tempDevice.setSensors(pcccSensorRepository.getSensorByDeviceId(tempDevice.getId()));
				tempDevice.setTotalOfSensors(tempDevice.getSensors().size());
				int totalIssueSensors = 0;
				for (int j =0; j < tempDevice.getSensors().size();j++)
				{
					if (tempDevice.getSensors().get(j).getIsConnect() != Integer.valueOf(env.getProperty("online.status").trim()) || 
						tempDevice.getSensors().get(j).getBattery() < Double.valueOf(env.getProperty("battery.limit").trim()))
					{
						totalIssueSensors++;
					}
				}
				tempDevice.setTotalOfIssuedSensors(totalIssueSensors);
				lCDI.add(tempDevice);
			}
		}
		return lCDI;
	}
}
