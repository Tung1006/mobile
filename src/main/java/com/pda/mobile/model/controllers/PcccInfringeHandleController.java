package com.pda.mobile.model.controllers;

import com.pda.mobile.beans.ResponseBeanDelete;
import com.pda.mobile.model.entities.PcccBuilderPcccUnit;
import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import com.pda.mobile.model.entities.PcccInfringeHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccInfringeHandleService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/PcccInfringeHandle")
@SecurityRequirement(name = "bearerAuth")
public class PcccInfringeHandleController {
	@Autowired
	public PcccInfringeHandleService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = false, defaultValue = "0") Long builderId) {
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
	public ResponseBean addInfringeHandle(@Valid @RequestBody PcccInfringeHandle obj)
	 {
		ResponseBean res = new ResponseBean();
		try
		{

			res.setData(service.save(obj));
		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseBean updatePcccInfringeHandle(@RequestBody PcccInfringeHandle obj) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.updatePcccInfringeHandle(obj));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}


	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
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
