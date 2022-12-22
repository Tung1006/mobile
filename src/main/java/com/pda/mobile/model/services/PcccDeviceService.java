package com.pda.mobile.model.services;

import java.sql.Date;
import java.util.List;

import com.pda.mobile.model.entities.PcccSensor;
import com.pda.mobile.model.entities.dto.deviceDto;
import com.pda.mobile.model.reporitories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccDevice;
import com.pda.mobile.model.reporitories.PcccDeviceRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccDeviceService {

	@Autowired
	public PcccDeviceRepository repository;

	@Autowired
	public DeviceRepository deviceRepository;



	public List<PcccDevice> getByBuilderId(long builderId) {

		return repository.getByBuilderId(builderId);
	}
	public deviceDto updatePosition(long deviceId, String position) throws Exception
	{
		deviceDto device = new deviceDto();
		if (deviceRepository.findById(deviceId).isEmpty())
		{
			throw new Exception("Thiết bị trung tâm không có sẵn");
		}
		else
		{
			device = deviceRepository.findById(deviceId).get();
			device.setPostion(position);
			deviceRepository.save(device);
		}
		return device;
	}

	public deviceDto save(deviceDto obj)
	{
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		return deviceRepository.save(obj);
	}
	public deviceDto update(deviceDto obj) throws Exception
	{
		if (deviceRepository.findById(obj.getDeviceId()).isEmpty())
		{
			throw new Exception("Không tồn tại thiết bị !");
		}
		else
		{
			obj.setModifiedDate(new Date(System.currentTimeMillis()));
			return deviceRepository.saveAndFlush(obj);
		}
	}

	public deviceDto delete(Long id) {
		deviceDto obj = deviceRepository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive(false);

		return deviceRepository.save(obj);
	}
}