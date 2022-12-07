package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccCheckBuilder;
import com.pda.mobile.model.reporitories.PcccCheckBuilderRepository;

@Service
public class PcccCheckBuilderService {
	
	@Autowired 
	private PcccCheckBuilderRepository checkBuilderRepository;
	public List<PcccCheckBuilder> findByBuilderId(long builderId) {

		return checkBuilderRepository.getByBuilderId(builderId);
	}	
}
