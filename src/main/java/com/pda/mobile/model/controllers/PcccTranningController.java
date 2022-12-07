package com.pda.mobile.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccTranningService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/trainning")
@SecurityRequirement(name = "bearerAuth")
public class PcccTranningController {
	@Autowired
	public PcccTranningService service;

	@RequestMapping(value = "/eventUpcoming", method = RequestMethod.GET)
	public ResponseBean eventUpcoming(
			@RequestParam(name = "builderId", required = false, defaultValue = "0") Long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getEventUpcomingByBuilderId(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean findByBuilderId(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") Long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.findByBuilderId(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
}
