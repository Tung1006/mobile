package com.pda.mobile.model.reporitories;

import com.pda.mobile.model.entities.PcccResident;
import com.pda.mobile.model.entities.dto.deviceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ResidentRepository extends JpaRepository<PcccResident, Long> {
	@Query(value = "SELECT *  FROM  PCCC_Resident v where v.active_ = 1 AND ( :id IS NULL  OR ResidentId = to_number(:id) )", nativeQuery = true)

	List<PcccResident> getByBuilderId(@Param("id") Long id);

}