package com.pda.mobile.model.reporitories;

import com.pda.mobile.model.entities.PcccBuilder;
import com.pda.mobile.model.entities.dto.builderDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface BuilderRepository extends JpaRepository<builderDto, Long> {
	@Query(value = "SELECT *  FROM PCCC_Builder v WHERE active_ = 1  AND (:name is null or LOWER(name) like  CONCAT('%',CONCAT(LOWER(:name),'%')) ) order by  createDate desc",
			countQuery = "SELECT count(*) FROM pccc_builder where (:name is null or LOWER(name) like '%'|| LOWER(:name) ||'%') and active_ = 1 order by createDate desc" , nativeQuery = true)

	List<builderDto> getByBuilderId(@Param("name") String name);

	@Query(value = "SELECT v.*   FROM pccc_builder v, pccc_resident r where v.residentId = r.residentId "
			+ " and r.accountId = :userId and r.active_ = 1 and v.active_ = 1 order by v.createDate desc", nativeQuery = true)
	List<builderDto> getBuilderByUserId(@Param("userId") String userId);


	
}