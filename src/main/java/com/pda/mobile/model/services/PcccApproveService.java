package com.pda.mobile.model.services;

import java.sql.Date;
import java.util.List;

import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccApprove;
import com.pda.mobile.model.reporitories.PcccApproveRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PcccApproveService {

	@Autowired
	public PcccApproveRepository repository;

	public List<PcccApprove> findByBuilderId(long builderId, Long type) {

		return repository.findByBuilderIdAndApproveTypeId(builderId, type);
	}

	public PcccApprove saveApprove(PcccApprove obj)
	{
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		obj.setApproveTypeId(10101L);
		return repository.save(obj);
	}

	public PcccApprove saveExamine(PcccApprove obj)
	{
		obj.setCreateDate(new Date(System.currentTimeMillis()));
		obj.setApproveTypeId(10100L);
		return repository.save(obj);
	}
	public PcccApprove updateApprove(PcccApprove obj) throws Exception
	{
		if (repository.findById(obj.getPcccApproveId()).isEmpty())
		{
			throw new Exception("Không tồn tại phương án");
		}
		else
		{
			obj.setModifiedDate(new Date(System.currentTimeMillis()));
			return repository.saveAndFlush(obj);
		}
	}

	public PcccApprove updateExamine(PcccApprove obj) throws Exception
	{
		if (repository.findById(obj.getPcccApproveId()).isEmpty())
		{
			throw new Exception("Không tồn tại phương án");
		}
		else
		{
			obj.setModifiedDate(new Date(System.currentTimeMillis()));
			return repository.saveAndFlush(obj);
		}
	}

	public PcccApprove delete(Long id) {
		PcccApprove obj = repository.findById(
				id
		).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " " + id)
		);
		obj.setActive(false);

		return repository.save(obj);
	}

}