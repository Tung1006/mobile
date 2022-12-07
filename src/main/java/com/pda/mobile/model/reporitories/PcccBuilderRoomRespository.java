package com.pda.mobile.model.reporitories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccBuilderPcccRoom;

@Repository
@EnableJpaRepositories
public interface PcccBuilderRoomRespository extends JpaRepository<PcccBuilderPcccRoom, Long> {
	@Query(value = "SELECT *  FROM pccc_builderroom where builderId= :builderId", nativeQuery = true)
	Page<PcccBuilderPcccRoom> getPaging(@Param("builderId") Long builderId, Pageable pageable);
	
	final String strGetTotal = "SELECT "
			+ "count(*) as totalRoom "
			+ "FROM pccc_builderroom "
			+ "where pccc_builderroom.BUILDERID = :builderId ";

	@Query(value = strGetTotal, nativeQuery = true)
	ProfessionalKnowledgeDto getTotal(@Param("builderId") long builderId);

}
