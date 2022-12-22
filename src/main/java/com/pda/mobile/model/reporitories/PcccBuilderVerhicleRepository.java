package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccBuilderVerhicle;

@Repository
@EnableJpaRepositories
public interface PcccBuilderVerhicleRepository extends JpaRepository<PcccBuilderVerhicle, Long>
{
//	@Query(value = "SELECT *  FROM  PCCC_BUILDERVEHICLE,PCCC_BUILDER  where PCCC_BUILDER.BUILDERID = :builderId and PCCC_BUILDERVEHICLE.BUILDERID = PCCC_BUILDER.BUILDERID", nativeQuery = true)

	@Query(value = "SELECT  v.BuilderVehicleId as BuilderVehicleId, " +
			"v.groupId as groupId,  v.userId as userId,  v.userName as userName, " +
			"v.createDate as createDate,  v.modifiedDate as modifiedDate, " +
			" v.active_  as active_,  v.name as name,  v.code_ as code_,  v.unit as unit,  v.quantity as quantity, " +
			"v.posititon as posititon,  v.builderId as builderId,  v.type_ as type_,  v.typeDetail as typeDetail,  v.mfgYear as mfgYear,  v.mfgCountry as mfgCountry, " +
			"v.approveDate as approveDate,  v.userApproveId as userApproveId," +
			"( select username from pccc_accountmanagement where id_ = v.userApproveId and active_ = 1 and rownum = 1) as userApproveName, " +
			"v.state_ as state_,  v.status as status,  v.note as note " +
			"FROM PCCC_BuilderVehicle v WHERE  (:builderId = 0  or v.BUILDERID = :builderId) and active_ = 1", nativeQuery = true)
	List<PcccBuilderVerhicle> getByBuilderId(@Param("builderId") Long builderId);
}