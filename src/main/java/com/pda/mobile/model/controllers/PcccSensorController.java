package com.pda.mobile.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccSensorService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/sensor")
@SecurityRequirement(name = "bearerAuth")
public class PcccSensorController {
	@Autowired
	public PcccSensorService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getSensorByBuilderId(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value="updatePosition", method = RequestMethod.POST)
	public ResponseBean updatePosition(
			@RequestParam(name = "sensorId", required = true, defaultValue = "0") long sensorId,
			@RequestParam(name="position", required= true, defaultValue ="") String position)
	{
		ResponseBean res = new ResponseBean();
		try 
		{
			res.setData(service.updatePosition(sensorId, position));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());			
		}
		return res;
		
	}
}
