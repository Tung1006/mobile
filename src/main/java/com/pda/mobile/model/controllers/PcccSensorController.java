package com.pda.mobile.model.controllers;

import com.pda.mobile.beans.ResponseBeanDelete;
import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import com.pda.mobile.model.entities.PcccSensor;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccSensorService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/sensor")
@SecurityRequirement(name = "bearerAuth")
public class PcccSensorController {
	@Autowired
	public PcccSensorService service;

	private static final Logger log = Logger.getLogger(PcccSensorController.class.getName());

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getSensorByBuilderId(builderId));

		} catch (Exception e) {
			log.error(e);
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value="updatePosition", method = RequestMethod.PUT)
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
			log.error(e);
			res.setStatus(500);
			res.setMessage(e.getMessage());			
		}
		return res;
		
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseBean addPcccSensor(@Valid @RequestBody PcccSensor obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.save(obj));
		}
		catch (Exception e)
		{
			log.error(e);
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseBean updatePcccSensor(@Valid @RequestBody PcccSensor obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.update(obj));
		}
		catch (Exception e)
		{
			log.error(e);
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseBeanDelete delete(@PathVariable(value = "id") Long id) {
		ResponseBeanDelete res = new ResponseBeanDelete();
		try {
			res.setData(service.delete(id));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
}
