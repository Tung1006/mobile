package com.pda.mobile.model.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccNotifyMessage;
import com.pda.mobile.model.reporitories.PcccNotifyMessageRepository;

@Service
public class PcccNotifyMessageService 
{
	@Autowired
	private PcccNotifyMessageRepository pcccNMRepo;
	public Page<PcccNotifyMessage> getPaging(int page, int size, long builderId, String userId, String sort) 
	{
		Pageable pageable = PageRequest.of(page, size, Sort.unsorted());

		if (sort.equalsIgnoreCase("des")) {
			pageable = PageRequest.of(page, size, Sort.by(Direction.DESC, "CREATEDATE"));
		}
		else
		{
			pageable = PageRequest.of(page, size, Sort.by(Direction.ASC, "CREATEDATE"));

		}
		return pcccNMRepo.getPage(builderId, userId, pageable);
	}

	public ProfessionalKnowledgeDto getTotal(long builderId, String userId) {

		return pcccNMRepo.getTotal(builderId, userId);
	}	
	public PcccNotifyMessage udpate( PcccNotifyMessage obj) throws Exception
	{
		Optional<PcccNotifyMessage> temp = pcccNMRepo.findById(obj.getMessageId());
		if(temp.isEmpty())
		{
			throw new Exception("Notify does not exist");			
		}
		else
		{
			PcccNotifyMessage updateObject =  temp.get();
			if (obj.getConfirmDate() != null ) updateObject.setConfirmDate(obj.getConfirmDate());
			if (obj.getCreateDate() != null) updateObject.setCreateDate(obj.getCreateDate());
			if (obj.getMessage() != null && !"".equals(obj.getMessage())) updateObject.setMessage(obj.getMessage());
			if (obj.getConfirmStatus() != null ) updateObject.setConfirmStatus(obj.getConfirmStatus());
			if (obj.getExpirationTime() != null) updateObject.setExpirationTime(obj.getExpirationTime());
			if (obj.getImei() != null) updateObject.setImei(obj.getImei());
			if (obj.getNameDevice() != null) updateObject.setNameDevice(obj.getNameDevice());
			if (obj.getRelatedUserIds() != null) updateObject.setRelatedUserIds(obj.getRelatedUserIds());
			if (obj.getSiteAddress() != null) updateObject.setSiteAddress(obj.getSiteAddress());
			if (obj.getSiteId() != null) updateObject.setSiteId(obj.getSiteId());
			if (obj.getSiteOwnerId() != null) updateObject.setSiteOwnerId(obj.getSiteOwnerId());
			if (obj.getTypeOfMessage() != null) updateObject.setTypeOfMessage(obj.getTypeOfMessage());
			if (obj.getUserConfirmId() != null) updateObject.setUserConfirmId(obj.getUserConfirmId());
			return pcccNMRepo.save(updateObject);
		}
	}
}
