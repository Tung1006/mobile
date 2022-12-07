package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccTranining;
import com.pda.mobile.model.reporitories.PcccTraniningRepository;

@Service
public class PcccTranningService {

	@Autowired
	public PcccTraniningRepository repository;

	public List<PcccTranining> getEventUpcomingByBuilderId(Long builderId) {

		return repository.getEventUpcomingByBuilderId(builderId);
	}

	public List<PcccTranining> findByBuilderId(Long builderId) {

		return repository.findByBuilderId(builderId);
	}

}