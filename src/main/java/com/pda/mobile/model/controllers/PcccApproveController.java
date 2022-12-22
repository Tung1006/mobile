package com.pda.mobile.model.controllers;

import java.util.List;

import com.pda.mobile.beans.ResponseBeanDelete;
import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.entities.PcccApprove;
import com.pda.mobile.model.services.PcccApproveService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "bearerAuth")
public class PcccApproveController {
	private static final Logger log = Logger.getLogger(PcccApproveController.class.getName());
	@Autowired
	private PcccApproveService service;
	@Autowired
	private Environment env;
//	thẩm duyệt
	@RequestMapping(value = "/approve", method = RequestMethod.GET)
	public ResponseBean getApprove(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			List<PcccApprove> lPcccApprove = service.findByBuilderId(builderId, 10101L);
			if (lPcccApprove.size() == 0) {
				res.setErrCode(env.getProperty("err.data-not-found"));
			}
			res.setData(lPcccApprove);

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setErrCode(env.getProperty("err.system"));
			res.setMessage(e.getMessage());
		}
		return res;
	}
//Nghiệm thu
	@RequestMapping(value = "/examine", method = RequestMethod.GET)
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.findByBuilderId(builderId, 10100L));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/approve/add", method = RequestMethod.POST)
	public ResponseBean addApprove(@Valid @RequestBody PcccApprove obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.saveApprove(obj));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/examine/add", method = RequestMethod.POST)
	public ResponseBean addExamine(@Valid @RequestBody PcccApprove obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.saveExamine(obj));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/approve/update", method = RequestMethod.PUT)
	public ResponseBean updateApprove(@Valid @RequestBody PcccApprove obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.updateApprove(obj));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = "/examine/update", method = RequestMethod.PUT)
	public ResponseBean updateExamine(@Valid @RequestBody PcccApprove obj)
	{
		ResponseBean res = new ResponseBean();
		try
		{
			res.setData(service.updateExamine(obj));
		}
		catch (Exception e)
		{
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}

	@DeleteMapping("/approve/delete/{id}")
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
