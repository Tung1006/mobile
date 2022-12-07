package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pda.mobile.model.entities.PcccCheckBuilder;

public interface PcccCheckBuilderRepository extends JpaRepository<PcccCheckBuilder, Long> {
//	@Query(value = "SELECT *  FROM pccc_pccccheckbuilder  where  (:builderId = 0  or BUILDERID = :builderId) and active_ = 1", nativeQuery = true)

	@Query(value = "SELECT  v.PcccCheckBuilderId as pcccCheckBuilderId,   v.groupId as groupId,  v.userId as userId,  v.userName as userName, v.createDate as createDate,  v.modifiedDate as modifiedDate,  v.statusId as statusId, " +
			" (SELECT name FROM pccc_appdomain WHERE appdomainId = v.statusId and active_ = 1 and rownum = 1) as statusName, " +
			" v.checkName as checkName,  v.checkDate as checkDate,  v.checkStartDate as checkStartDate,  v.checkEndDate as checkEndDate,  " +
			" v.checkDesc as checkDesc,   v.checkContent as checkContent,  v.checkStatusId as checkStatusId,  " +
			" (SELECT name FROM pccc_appdomain WHERE appdomainId = v.checkStatusId and active_ = 1 and rownum = 1) as checkStatusName, " +
			"v.checkCadresId as checkCadresId,  " +
			"(SELECT name FROM pccc_cadres WHERE cadresId = v.checkCadresId and active_ = 1) as checkCadresName , " +
			"(SELECT name FROM PCCC_Rank WHERE rankId in (select rankId from pccc_cadres c where c.cadresId = v.checkCadresId)) as checkCadresRank," +
			"  v.checkDecide as checkDecide,  v.checkInfomation as checkInfomation," +
			"v.checkEvaluate  as checkEvaluate," +
			"v.checkCadresEvaluate as checkCadresEvaluate,  v.checkNote as checkNote,  v.search as search,  v.rerejectReason as rerejectReason, v.properties as properties,  v.description as description,  v.checkPlanId as checkPlanId,"
			+ " v.builderId as builderId, v.rescueDepartmentId as rescueDepartmentId,  " +
			" v.provinceId as provinceId,  v.districtId as districtId,  v.communeId as communeId,  " +
			"(SELECT name FROM PCCC_Builder WHERE builderId = v.builderId and active_ = 1 and rownum = 1) as builderName ," +
			"(SELECT name FROM PCCC_PcccCheckPlan WHERE PcccCheckPlanId = v.checkPlanId and active_ = 1 and rownum = 1) as checkPlanName ,  " +
			"(SELECT name FROM PCCC_Province WHERE provinceId = v.provinceId and active_ = 1 and rownum = 1) as provinceName ,  " +
			"(SELECT name FROM PCCC_District WHERE districtId = v.districtId and active_ = 1 and rownum = 1) as districtName ,  " +
			"(SELECT name FROM PCCC_Commune WHERE communeId = v.communeId and active_ = 1 and rownum = 1) as communeName ,  " +
			"(SELECT name FROM PCCC_RescueDepartment WHERE rescueDepartmentId = v.rescueDepartmentId and active_ = 1 and rownum = 1) as rescueDepartmentName " +
//			"," +
//			"'typeId','typeName'" +
			" FROM PCCC_PcccCheckBuilder v WHERE  (:builderId = 0  or v.BUILDERID = :builderId) and active_ = 1 ", nativeQuery = true)

	List<PcccCheckBuilder> getByBuilderId(Long builderId);

}
