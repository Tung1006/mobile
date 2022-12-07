package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccSensor;
import com.pda.mobile.model.reporitories.PcccSensorRepository;

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
}