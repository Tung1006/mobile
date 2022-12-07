package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccApprove;
import com.pda.mobile.model.reporitories.PcccApproveRepository;

@Service
public class PcccApproveService {

	@Autowired
	public PcccApproveRepository repository;

	public List<PcccApprove> findByBuilderId(long builderId, Long type) {

		return repository.findByBuilderIdAndApproveTypeId(builderId, type);
	}

}