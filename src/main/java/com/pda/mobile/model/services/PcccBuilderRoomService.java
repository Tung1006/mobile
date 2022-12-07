package com.pda.mobile.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccBuilderPcccRoom;
import com.pda.mobile.model.reporitories.PcccBuilderRoomRespository;

@Service
public class PcccBuilderRoomService {
	
	@Autowired 
	public PcccBuilderRoomRespository roomRerository;
	
	public Page<PcccBuilderPcccRoom> getPaging(int page, int size, long builderId) {
		Pageable pageable = PageRequest.of(page, size);
		return roomRerository.getPaging(builderId, pageable);
	}
	public ProfessionalKnowledgeDto getTotal(long builderId) {

		return roomRerository.getTotal(builderId);
	}	
}
