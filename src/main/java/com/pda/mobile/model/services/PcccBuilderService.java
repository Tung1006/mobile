package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccBuilder;
import com.pda.mobile.model.reporitories.PcccBuilderRepository;

@Service
public class PcccBuilderService {

	@Autowired
	public PcccBuilderRepository repository;

	public Page<PcccBuilder> getPaging(int page, int size, String name) {
		Pageable pageable = PageRequest.of(page, size);
		return repository.findAll( pageable);
	}

	public ProfessionalKnowledgeDto getTotal(long builderId) {

		return repository.getTotal(builderId);
	}
	public List<PcccBuilder> getBuilderByOwnerId(String userId) {
		return repository.getBuilderByUserId(userId);
	}
	public PcccBuilder getBuilderById(long builderId)
	{
		return repository.getBuilderById(builderId);
	}
}