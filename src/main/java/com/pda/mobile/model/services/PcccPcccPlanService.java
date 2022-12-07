package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccPcccPlan;
import com.pda.mobile.model.reporitories.PcccPcccPlanRespository;

@Service
public class PcccPcccPlanService {
	@Autowired
	public PcccPcccPlanRespository pcccPlanRespository;
	
	public List<PcccPcccPlan> getListPlanByBuilderId(long builderId)
	{
		return pcccPlanRespository.getByBuilderId(builderId);
	}

}
