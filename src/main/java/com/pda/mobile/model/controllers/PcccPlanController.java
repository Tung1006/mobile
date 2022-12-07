package com.pda.mobile.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccPcccPlanService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/PcccPlan")
@SecurityRequirement(name = "bearerAuth")
public class PcccPlanController 
{
	@Autowired
	private PcccPcccPlanService pcccPlanService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = false, defaultValue = "0") Long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(pcccPlanService.getListPlanByBuilderId(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
}
