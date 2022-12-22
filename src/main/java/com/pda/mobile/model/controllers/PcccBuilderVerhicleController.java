package com.pda.mobile.model.controllers;

import javax.validation.Valid;

import com.pda.mobile.beans.ResponseBeanDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import com.pda.mobile.model.services.PcccBuilderVerhicleService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/pcccBuilderVerhicle")
@SecurityRequirement(name = "bearerAuth")
public class PcccBuilderVerhicleController {
	@Autowired
	public PcccBuilderVerhicleService service;

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
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseBean addVehicle(@Valid @RequestBody PcccBuilderVerhicle obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.save(obj));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());			
		}
		return res;
	}
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseBean updateVehicle(@Valid @RequestBody PcccBuilderVerhicle obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.update(obj));
		}
		catch (Exception e)
		{
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
