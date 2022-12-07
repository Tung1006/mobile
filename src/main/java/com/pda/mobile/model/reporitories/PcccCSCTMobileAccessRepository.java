package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccCSCTMobileAccess;

@Repository
@EnableJpaRepositories
public interface PcccCSCTMobileAccessRepository extends JpaRepository<PcccCSCTMobileAccess,Long> {
	
	@Query(value = "SELECT *  FROM PCCC_CSCTMOBILEACCESS where USER_ID = :userId ", nativeQuery = true)
	List<PcccCSCTMobileAccess> getUserById(@Param("userId") String userId);
	@Query(value = "SELECT *  FROM PCCC_CSCTMOBILEACCESS where uuid_device = :uuidDevice ", nativeQuery = true)
	PcccCSCTMobileAccess getUserByUUID(@Param("uuidDevice") String uuidDevice);	
}

