package com.pda.mobile.model.controllers;

import javax.validation.Valid;

import com.pda.mobile.beans.ResponseBeanDelete;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.entities.PcccBuilderPcccUnit;
import com.pda.mobile.model.services.PcccBuilderPcccUnitService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/builderPcccUnit")
@SecurityRequirement(name = "bearerAuth")
public class PcccBuilderPcccUnitController {
	@Autowired
	public PcccBuilderPcccUnitService service;
	private static final Logger log = Logger.getLogger(PcccBuilderPcccUnitController.class.getName());

	@GetMapping("")
	public ResponseBean getPaging(
			@RequestParam(name = "builderId", required = true, defaultValue = "0") long builderId) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.getByBuilderId(builderId));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
			log.error(e);
		}
		return res;
	}

	@PostMapping("/save")
	public ResponseBean save(@Valid @RequestBody PcccBuilderPcccUnit obj ) {
		ResponseBean res = new ResponseBean();
		try 
		{
			
			res.setData(service.save(obj));
		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
			log.error("Error:" + e.getStackTrace());
		}
		return res;
	}

	@PostMapping("/update")
	public ResponseBean update(@RequestBody PcccBuilderPcccUnit obj) {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(service.update(obj));

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
			log.error(e);
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
			log.error(e);
		}
		return res;
	}






}

