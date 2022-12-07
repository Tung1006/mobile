package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccDevice;
import com.pda.mobile.model.reporitories.PcccDeviceRepository;

@Service
public class PcccDeviceService {

	@Autowired
	public PcccDeviceRepository repository;

	public List<PcccDevice> getByBuilderId(long builderId) {

		return repository.getByBuilderId(builderId);
	}
	public PcccDevice updatePosition(long deviceId, String position) throws Exception
	{
		PcccDevice device = new PcccDevice();
		if (repository.findById(deviceId).isEmpty())
		{
			throw new Exception("Device not existed");
		}
		else
		{
			device = repository.findById(deviceId).get();
			device.setPostion(position);
			repository.save(device);
		}
		return device;
	}
}