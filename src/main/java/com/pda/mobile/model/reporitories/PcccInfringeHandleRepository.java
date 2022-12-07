package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccInfringeHandle;

@Repository
@EnableJpaRepositories
public interface PcccInfringeHandleRepository extends JpaRepository<PcccInfringeHandle, Long> {
//	@Query(value = "SELECT PCCC_INFRINGEHANDLE.*, pccc_rescuedepartment.name RESCUEDEPARTMENTNAME "
//			+ " FROM PCCC_INFRINGEHANDLE "
//			+ " LEFT JOIN pccc_rescuedepartment ON PCCC_INFRINGEHANDLE.RESCUEDEPARTMENTID = pccc_rescuedepartment.RESCUEDEPARTMENTID "
//			+ " where  :builderId = 0  or PCCC_INFRINGEHANDLE.BUILDERID = :builderId and PCCC_INFRINGEHANDLE.active_ = 1", nativeQuery = true)

	@Query(value = "SELECT v.infringeHandleId as infringeHandleId,  v.userId as userId,  v.userName as userName,  v.createDate as createDate, v.modifiedDate as modifiedDate,  v.active_  as active_,  v.infringeGroupId as infringeGroupId, v.docCode as docCode,  v.infringeDate as infringeDate,  v.infringeContent as infringeContent,  v.infringeObject as infringeObject, v.isWarning  as isWarning,  v.infringeAmount as infringeAmount, v.isSuspended  as isSuspended,  v.isTempSuspended as isTempSuspended,  v.tempSuspendedDate as tempSuspendedDate,  v.tempSuspendedReactiveDate as tempSuspendedReactiveDate, v.otherContent as otherContent,  v.checkedId as checkedId,  v.properties as properties,  v.description as description, v.builderId as builderId,  v.rescueDepartmentId as rescueDepartmentId,  v.provinceId as provinceId,  v.districtId as districtId, v.communeId as communeId, a.name as infringeGroupName, p.name as provinceName, d.name as districtName, b.name as builderName, c.name as communeName, pc.checkName as checkName, pc.checkplanid, pcl.name as checkPlanName, r.name as RESCUEDEPARTMENTNAME  FROM PCCC_INFRINGEHANDLE v " +
			"LEFT JOIN pccc_rescuedepartment r ON v.RESCUEDEPARTMENTID = r.RESCUEDEPARTMENTID " +
			"LEFT JOIN pccc_appdomain a ON v.infringeGroupId = a.appdomainId " +
			"LEFT JOIN PCCC_Province p ON v.provinceId = p.provinceId " +
			"LEFT JOIN PCCC_District d ON v.districtId = d.districtId " +
			"LEFT JOIN PCCC_Commune c ON v.communeId = c.communeId " +
			"LEFT JOIN PCCC_Builder b ON v.builderId = b.builderId " +
			"LEFT JOIN PCCC_PcccCheckBuilder pc ON v.checkedId = pc.PcccCheckBuilderId " +
			"LEFT JOIN PCCC_Pccccheckplan pcl ON pc.checkplanid = pcl.pccccheckplanid " +
			"where  (:builderId = 0  or v.BUILDERID = :builderId) and v.active_ = 1", nativeQuery = true)
	List<PcccInfringeHandle> getByBuilderId(@Param("builderId") Long builderId);
}


