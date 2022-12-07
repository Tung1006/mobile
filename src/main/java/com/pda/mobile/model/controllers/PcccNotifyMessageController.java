package com.pda.mobile.model.controllers;

import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.entities.PcccNotifyMessage;
import com.pda.mobile.logs.LogTools;
import com.pda.mobile.model.services.MessageProducerService;
import com.pda.mobile.model.services.PcccNotifyMessageService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/NotifyMessage")
@SecurityRequirement(name = "bearerAuth")
public class PcccNotifyMessageController {
	@Autowired
	private PcccNotifyMessageService service;
	@Autowired
	private MessageProducerService messageProducerService;	
	private static final Logger log = Logger.getLogger(PcccNotifyMessageController.class.getName());

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseBean getPaging(@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
			@RequestParam(name = "builderId", required = false) long siteId,
			@RequestParam(name = "userId", required = true) String userId,
			@RequestParam(name = "sort", required = false) String sort) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getPaging(page, size, siteId, userId, sort));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value = "/getTotal", method = RequestMethod.GET)
	public ResponseBean getTotal(@RequestParam(name = "builderId", required = true) long builderId,
			@RequestParam(name = "userId", required = true) String userId) {
		ResponseBean res = new ResponseBean();
		try 
		{
			res.setData(service.getTotal(builderId, userId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	@RequestMapping(value = "/fireAlarmConfirm", method = RequestMethod.POST)
	public ResponseBean fireAlarmConfirm(@Valid @RequestBody PcccNotifyMessage obj) {
		ResponseBean res = new ResponseBean();
		try 
		{
			res.setData(service.udpate(obj));
			ObjectMapper objectMapper = new ObjectMapper();
			messageProducerService.sendMessage("confirmAlarmQueue",objectMapper.writeValueAsString(obj));
			log.info("Send confirm to system. data = " + LogTools.convertObjectToString(obj));
		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}	
}
