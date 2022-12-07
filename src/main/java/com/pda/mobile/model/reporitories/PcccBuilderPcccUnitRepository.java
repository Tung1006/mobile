package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccBuilderPcccUnit;

@Repository
@EnableJpaRepositories
public interface PcccBuilderPcccUnitRepository extends JpaRepository<PcccBuilderPcccUnit, Long> {
	//@Query(value = "SELECT *  FROM  PCCC_CADRES, PCCC_BUILDER, PCCC_RESCUEDEPARTMENT  where  PCCC_BUILDER.BUILDERID = :builderId and PCCC_RESCUEDEPARTMENT.RESCUEDEPARTMENTID = PCCC_CADRES.RESCUEDEPARTMENTID   and PCCC_BUILDER.DISTRICTID = PCCC_RESCUEDEPARTMENT.DISTRICTID", nativeQuery = true)
//	@Query(value = "SELECT *  FROM  PCCC_BUILDERPCCCUNIT  where  PCCC_BUILDERPCCCUNIT.BUILDERID = :builderId", nativeQuery = true)
	@Query(value = "SELECT v.BuilderPcccUnitId as BuilderPcccUnitId, v.groupId as groupId,  v.userId as userId,  v.userName as userName, v.createDate as createDate, v.active_ as active_,  v.modifiedDate as modifiedDate, v.name as name,  v.builderId as builderId,  v.dob as dob,  v.dept as dept,  v.phoneNumber as phoneNumber, v.inWorkingTime as inWorkingTime, v.haveCert  as haveCert,  v.persionId as persionId,  v.position as position, v.note as note,  v.address as address,  v.isLeader  as isLeader, v.status as status,  v.userApproveId as userApproveId, a.username as userApproveName FROM  PCCC_BUILDERPCCCUNIT  v LEFT JOIN pccc_accountmanagement  a ON a.id_ = v.userApproveId where (:builderId = 0  or v.BUILDERID = :builderId) and v.active_ = 1", nativeQuery = true)


	List<PcccBuilderPcccUnit> getByBuilderId(@Param("builderId") Long builderId);
}

