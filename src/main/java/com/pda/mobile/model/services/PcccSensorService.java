package com.pda.mobile.model.services;

import java.sql.Date;
import java.util.List;

import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccSensor;
import com.pda.mobile.model.reporitories.PcccSensorRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccSensorService {

	@Autowired
	public PcccSensorRepository repository;

	public List<PcccSensor> getSensorByBuilderId(long builderId) {

		return repository.getSensorByBuilderId(builderId);
	}
	
	public PcccSensor updatePosition (long sensorId, String position) throws Exception
	{
		PcccSensor sensor = new PcccSensor();
		if (repository.findById(sensorId).isEmpty())
		{
			throw new Exception("Sensor not existed");
		}
		else
		{
			sensor = repository.findById(sensorId).get();
			sensor.setPosition(position);
			repository.save(sensor);
		}
		return sensor;
	}

	public PcccSensor save(PcccSensor obj)
	{
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		return repository.save(obj);
	}
	public PcccSensor update(PcccSensor obj) throws Exception
	{
		if (repository.findById(obj.getSensorId()).isEmpty())
		{
			throw new Exception("Không tồn tại thiết bị !");
		}
		else
		{
			obj.setModifiedDate(new Date(System.currentTimeMillis()));
			return repository.saveAndFlush(obj);
		}
	}

	public PcccSensor delete(Long id) {
		PcccSensor obj = repository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive(0);

		return repository.save(obj);
		//repository.deleteById(id);
	}
}