package com.pda.mobile.model.controllers;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.response.data.BuildingOwnerInfor;
import com.pda.mobile.model.services.PcccBuilderService;
import com.pda.mobile.model.services.PcccSummaryService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/builder")
@SecurityRequirement(name = "bearerAuth")
public class PcccBuilderController {
	@Autowired
	public PcccBuilderService service;
	@Autowired
	public PcccSummaryService summaryService;	
	@Autowired
	public Environment env;
	private static final Logger log = Logger.getLogger(PcccBuilderController.class.getName());

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
			@RequestParam(name = "name", required = false) String name) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getPaging(page, size, name));

		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
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
			res.setData(service.getTotal(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value = "/getSummary", method = RequestMethod.GET)
	public ResponseBean getSummary(@RequestParam(name = "userId", required = true) String userId)
	{
		ResponseBean res = new ResponseBean();
		try 
		{
			BuildingOwnerInfor bOI = summaryService.generateOwnerInfor(userId);
			res.setData(bOI);

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setErrCode(env.getProperty("err.system"));
			res.setMessage(e.getMessage());
		}		
		return res;
	}
	@RequestMapping(value = "/getBuilderById", method = RequestMethod.GET)
	public ResponseBean getBuilderById(@RequestParam(name = "builderId", required = true) long builderId) {
		ResponseBean res = new ResponseBean();
		try 
		{
			res.setData(service.getBuilderById(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value = "/getBuilderByOwnerId", method = RequestMethod.GET)
	public ResponseBean getBuilderByOwnerId(@RequestParam(name = "userId", required = true) String userId) {
		ResponseBean res = new ResponseBean();
		try 
		{
			res.setData(service.getBuilderByOwnerId(userId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}	
}
