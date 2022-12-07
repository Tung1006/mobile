package com.pda.mobile.model.controllers;

import com.pda.mobile.model.entities.PcccApprove;
import com.pda.mobile.model.entities.PcccCheckBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccCheckBuilderService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.List;

@RestController
@RequestMapping("/api/checkbuilder")
@SecurityRequirement(name = "bearerAuth")
public class PcccCheckBuilderController {
	
	@Autowired
	private PcccCheckBuilderService service;

	@Autowired
	private Environment env;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = false, defaultValue = "0") Long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			List<PcccCheckBuilder> lPcccCheckBuilder = service.findByBuilderId(builderId);
			if (lPcccCheckBuilder.size() == 0) {
				res.setErrCode(env.getProperty("err.data-not-found"));
			}
			res.setData(lPcccCheckBuilder);

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
}
