package com.pda.mobile.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccDeviceService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/device")
@SecurityRequirement(name = "bearerAuth")
public class PcccDeviceController {
	@Autowired
	public PcccDeviceService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getByBuilderId(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value="updatePosition", method = RequestMethod.PUT)
	public ResponseBean updatePosition(
			@RequestParam(name = "deviceId", required = true, defaultValue = "0") long deviceId,
			@RequestParam(name="position", required= true, defaultValue ="") String position)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.updatePosition(deviceId, position));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());			
		}
		return res;
	}
}
