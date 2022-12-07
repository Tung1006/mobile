package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccBuilderPcccUnit;
import com.pda.mobile.model.reporitories.PcccBuilderPcccUnitRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccBuilderPcccUnitService {

	@Autowired
	public PcccBuilderPcccUnitRepository repository;

	public List<PcccBuilderPcccUnit> getByBuilderId(long builderId) {

		return repository.getByBuilderId(builderId);
	}

	public PcccBuilderPcccUnit save(PcccBuilderPcccUnit obj) {

		return repository.save(obj);
	}

	public PcccBuilderPcccUnit update(PcccBuilderPcccUnit obj) throws Exception {
		if (repository.findById(obj.getBuilderPcccUnitId()).isEmpty()) {
			throw new Exception("Id cán bộ không tồn tại");

		} else {
			return repository.save(obj);
		}

	}


	public PcccBuilderPcccUnit delete(Long id) {
		PcccBuilderPcccUnit obj = repository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive_(false);

		return repository.save(obj);
		//repository.deleteById(id);
	}
}