package com.pda.mobile.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pda.mobile.model.entities.PcccCSCTMobileAccess;
import com.pda.mobile.model.reporitories.PcccCSCTMobileAccessRepository;

@Service
public class PcccCSCTMobileAccessService {
	
	@Autowired
	public PcccCSCTMobileAccessRepository repository;
	
	public PcccCSCTMobileAccess register(PcccCSCTMobileAccess obj)
	{
		return repository.save(obj);
	}
	public PcccCSCTMobileAccess updateRegInfor(PcccCSCTMobileAccess obj)
	{
		return repository.save(obj);
	}
	public List<PcccCSCTMobileAccess> getUserById (String userId)
	{
		return repository.getUserById(userId);
	}
	public PcccCSCTMobileAccess getUserByUUID (String uuidDevice)
	{
		return repository.getUserByUUID(uuidDevice);
	}
}
