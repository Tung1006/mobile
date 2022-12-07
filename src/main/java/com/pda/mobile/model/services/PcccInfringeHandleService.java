package com.pda.mobile.model.services;

import java.sql.Date;
import java.util.List;

import com.pda.mobile.model.entities.PcccBuilderPcccUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccInfringeHandle;
import com.pda.mobile.model.reporitories.PcccInfringeHandleRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccInfringeHandleService {

	@Autowired
	public PcccInfringeHandleRepository repository;

	public List<PcccInfringeHandle> getByBuilderId(Long builderId) {

		return repository.getByBuilderId(builderId);
	}


	public PcccInfringeHandle save(PcccInfringeHandle obj) {
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		return repository.save(obj);
	}

	public PcccInfringeHandle updatePcccInfringeHandle(PcccInfringeHandle obj) throws Exception {
		if (repository.findById(obj.getInfringeHandleId())
				.isEmpty()) {
			throw new Exception("Id cán bộ không tồn tại");

		} else {
			return repository.save(obj);
		}

	}


	public PcccInfringeHandle delete(Long id) {
		PcccInfringeHandle obj = repository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive_(false);

		return repository.save(obj);
		//repository.deleteById(id);
	}
}