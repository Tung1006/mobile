package com.pda.mobile.model.reporitories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccNotifyMessage;

@Repository
@EnableJpaRepositories
public interface  PcccNotifyMessageRepository extends JpaRepository<PcccNotifyMessage, Long>
{
	@Query(value = "SELECT *  FROM NotifyMessage where (:siteId = 0 and siteOwnerId= :userId)  or (siteId = :siteId and siteOwnerId= :userId)", nativeQuery = true)
	Page<PcccNotifyMessage> getPage(@Param("siteId") long siteId,@Param("userId") String userId, Pageable pageable);
	
	final String strGetTotal = "SELECT count(messageId) as notifyMsg  FROM NotifyMessage where (:siteId = 0 and siteOwnerId= :userId) or (siteId = :siteId and siteOwnerId= :userId) ";
	@Query(value = strGetTotal, nativeQuery = true)
	ProfessionalKnowledgeDto getTotal(@Param("siteId") long siteId, @Param("userId") String userId);
}  
