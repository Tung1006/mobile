package com.pda.mobile.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.services.PcccBuilderRoomService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/builderRoom")
@SecurityRequirement(name = "bearerAuth")
public class PcccBuilderRoomController {
	@Autowired
	public Environment env;
	@Autowired
	public PcccBuilderRoomService roomService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
			@RequestParam(name = "builderId", required = false) long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(roomService.getPaging(page, size, builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value = "/getTotal", method = RequestMethod.GET)
	public ResponseBean getTotal(@RequestParam(name = "builderId", required = true) long builderId) {
		ResponseBean res = new ResponseBean();
		try 
		{
			res.setData(roomService.getTotal(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
}
