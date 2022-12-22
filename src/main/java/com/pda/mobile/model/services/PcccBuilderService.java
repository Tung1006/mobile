package com.pda.mobile.model.services;

import java.sql.Date;
import java.util.List;

import com.pda.mobile.model.entities.dto.builderDto;
import com.pda.mobile.model.reporitories.BuilderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccBuilder;
import com.pda.mobile.model.reporitories.PcccBuilderRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccBuilderService {

	@Autowired
	public PcccBuilderRepository repository;

	@Autowired
	public BuilderRepository builderRepository;

	public Page<PcccBuilder> getPaging(int page, int size, String name, Long id) {
		Pageable pageable = PageRequest.of(page, size);
		return repository.getPaging(name, id,  pageable);
	}

	public ProfessionalKnowledgeDto getTotal(long builderId) {

		return repository.getTotal(builderId);
	}
	public List<builderDto> getBuilderByOwnerId(String userId) {
		return builderRepository.getBuilderByUserId(userId);
	}
	public PcccBuilder getBuilderById(long id)
	{
		return repository.getBuilderById(id);
	}

	public builderDto save(builderDto obj)
	{
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		return builderRepository.save(obj);
	}

	public builderDto update(builderDto obj) throws Exception {
		if (builderRepository.findById(obj.getBuilderId()).isEmpty()) {
			throw new Exception("Cơ sở công trình không tồn tại");

		} else {
			obj.setModifiedDate(new Date(System.currentTimeMillis()));
			return builderRepository.save(obj);
		}

	}
	public builderDto delete(Long id) {
		builderDto obj = builderRepository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive(false);
		obj.setModifiedDate(new Date(System.currentTimeMillis()));
		return builderRepository.save(obj);
		//repository.deleteById(id);
	}
}