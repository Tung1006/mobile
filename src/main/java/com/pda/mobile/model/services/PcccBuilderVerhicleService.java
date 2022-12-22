package com.pda.mobile.model.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import com.pda.mobile.model.reporitories.PcccBuilderVerhicleRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccBuilderVerhicleService {
	@Autowired
	public PcccBuilderVerhicleRepository repository;

	public List<PcccBuilderVerhicle> getByBuilderId(long builderId) {

		return repository.getByBuilderId(builderId);
	}
	public PcccBuilderVerhicle save(PcccBuilderVerhicle obj)
	{
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		return repository.save(obj);
	}
	public PcccBuilderVerhicle update(PcccBuilderVerhicle obj) throws Exception
	{
		if (repository.findById(obj.getBuilderVehicleId()).isEmpty())
		{
			throw new Exception("Khong ton tai phuong tien");
		}
		else
		{
			obj.setModifiedDate(new Date(System.currentTimeMillis()));
			return repository.saveAndFlush(obj);
		}
	}

	public PcccBuilderVerhicle delete(Long id) {
		PcccBuilderVerhicle obj = repository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive_(false);

		return repository.save(obj);
		//repository.deleteById(id);
	}
}