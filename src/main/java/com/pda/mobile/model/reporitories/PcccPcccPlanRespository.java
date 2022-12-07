package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pda.mobile.model.entities.PcccPcccPlan;

public interface PcccPcccPlanRespository extends JpaRepository<PcccPcccPlan,Long>
{
//	@Query(value = "SELECT " +
//			"pccc_pcccplan.*," +
//			" PCCC_BUILDER.name BUILDERNAME, pccc_rescuedepartment.name RESCUEDEPARTMENTNAME "
//			+ " FROM pccc_pcccplan "
//			+ " LEFT JOIN PCCC_BUILDER ON pccc_pcccplan.BUILDERID = PCCC_BUILDER.BUILDERID "
//			+ " LEFT JOIN pccc_rescuedepartment ON pccc_pcccplan.RESCUEDEPARTMENTID = pccc_rescuedepartment.RESCUEDEPARTMENTID "
//			+ " where  (:builderId = 0  or pccc_pcccplan.BUILDERID = :builderId) and pccc_pcccplan.active_ = 1", nativeQuery = true)

	@Query(value = "SELECT  v.PcccPlanId as PcccPlanId, v.groupId as groupId,  v.userId as userId, v.userName as userName,  v.createDate as createDate," +
			"v.modifiedDate as modifiedDate, v.documentCode as documentCode,  v.documentPosition as documentPosition," +
			"v.planName as planName,  v.approvedDate as approvedDate, v.isExpired  as isExpired, v.properties as properties," +
			"v.description as description,  v.builderId as builderId,  v.rescueDepartmentId as rescueDepartmentId," +
			"v.provinceId as provinceId,  v.districtId as districtId,  v.communeId as communeId, " +
			"b.name  as BUILDERNAME," +
			"r.name as RESCUEDEPARTMENTNAME ,'planCode','planTypeId','planTypeName' " +
			"FROM pccc_pcccplan v " +
			"LEFT JOIN PCCC_BUILDER b ON v.BUILDERID = b.BUILDERID " +
			"LEFT JOIN pccc_rescuedepartment r ON v.RESCUEDEPARTMENTID = r.RESCUEDEPARTMENTID " +
			"where (:builderId = 0 or v.builderId = :builderId) and v.active_ = 1", nativeQuery = true)
	List<PcccPcccPlan> getByBuilderId(long builderId);
}
