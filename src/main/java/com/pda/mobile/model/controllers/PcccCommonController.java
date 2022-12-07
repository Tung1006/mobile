package com.pda.mobile.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.reporitories.PcccPositionRepository;
import com.pda.mobile.model.reporitories.PcccRankRepository;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/common")
@SecurityRequirement(name = "bearerAuth")
public class PcccCommonController {
	@Autowired
	public PcccPositionRepository positionRepo;
	@Autowired
	public PcccRankRepository rankRepo;

	@RequestMapping(value = "/position", method = RequestMethod.GET)
	public ResponseBean getPosition() {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(positionRepo.findAll());

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
	
	@RequestMapping(value = "/rank", method = RequestMethod.GET)
	public ResponseBean getRank() {
		ResponseBean res = new ResponseBean();
		try {
			res.setData(rankRepo.findAll());

		} catch (Exception e) {
			// TODO: handle exception
			res.setStatus(500);
			res.setMessage(e.getMessage());
		}
		return res;
	}
}
