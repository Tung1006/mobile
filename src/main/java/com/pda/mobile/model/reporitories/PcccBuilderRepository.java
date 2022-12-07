package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.dto.ProfessionalKnowledgeDto;
import com.pda.mobile.model.entities.PcccBuilder;

@Repository
@EnableJpaRepositories
public interface PcccBuilderRepository extends JpaRepository<PcccBuilder, Long> {
//	@Query(value = "SELECT *  FROM pccc_builder where :name is null or LOWER(name) like '%'|| LOWER(:name) ||'%'", nativeQuery = true)

	@Query(value = "SELECT  v.builderId as builderId,    v.userId as userId,  v.userName as userName,  v.createDate as createDate,  v.modifiedDate as modifiedDate, " +
			"v.active_  as \\\"active\\\",  v.name as name,  v.code_ as \"code\",  v.properties as properties,  v.description as description,  v.address as address, " +
			"v.phone as phone,  v.otherPhone as otherPhone,  v.direction as direction,   v.isDisplayOnMap as isDisplayOnMap, " +
			"v.registerDate as registerDate,  v.expireDate as expireDate,  v.startUpYear as startUpYear,   v.digitalize  as digitalize," +
			"v.fireSafetyId as fireSafetyId,  (SELECT name FROM pccc_appdomain WHERE appdomainId = v.fireSafetyId and active_ = 1 and rownum = 1) as fireSafetyName , " +
			"v.sensorNumber as sensorNumber, " +
			"v.search as search,  v.ownerTypeId as ownerTypeId, " +
			"(SELECT name FROM pccc_appdomain WHERE appdomainId = v.ownerTypeId and active_ = 1 and rownum = 1) as ownerTypeName , " +
			"v.builderOwnerId as builderOwnerId,   v.fireInsuranceRequired  as fireInsuranceRequired, " +
			" v.fireInsuranceBought  as fireInsuranceBought,  v.web as web,  v.email as email, " +
			"v.avatar as avatar,  v.checkNumberPerYear as checkNumberPerYear,  v.lat_ as lat_,  v.long_ as long_,  v.adminiLevelId as adminiLevelId, " +
			"v.countryInvestmentId as countryInvestmentId,v.builderTypeId as builderTypeId, " +
			"(SELECT name FROM pccc_appdomain WHERE appdomainId = v.adminiLevelId and active_ = 1 and rownum = 1) as adminiLevelName , " +
			"(SELECT name FROM pccc_appdomain WHERE appdomainId = v.builderTypeId and active_ = 1 and rownum = 1) as builderTypeName , " +
			"(SELECT name FROM pccc_adm_country WHERE id_ = v.countryInvestmentId and active_ = 1 and rownum = 1) as countryInvestmentName , " +
			"v.economicSectors as economicSectors,  v.branchField as branchField,  v.investmentTypeId as investmentTypeId, " +
			"(SELECT name FROM pccc_appdomain WHERE appdomainId = v.investmentTypeId and active_ = 1 and rownum = 1) as investmentTypeName , " +
			"v.activityTypeId as activityTypeId, " +
			"(SELECT name FROM pccc_appdomain WHERE appdomainId = v.activityTypeId and active_ = 1 and rownum = 1) as activityTypeName , " +
			"v.residentId as residentId,  v.cadresId as cadresId,  v.rescueDepartmentId as rescueDepartmentId,  v.provinceId as provinceId, " +
			"v.districtId as districtId,  v.communeId as communeId,  (SELECT name FROM PCCC_Province WHERE provinceId = v.provinceId and active_ = 1 and rownum = 1) as provinceName , " +
			"(SELECT name FROM PCCC_District WHERE districtId = v.districtId and active_ = 1 and rownum = 1) as districtName , " +
			"(SELECT name FROM PCCC_Commune WHERE communeId = v.communeId and active_ = 1 and rownum = 1) as communeName , " +
			"(SELECT name FROM PCCC_RescueDepartment WHERE rescueDepartmentId = v.rescueDepartmentId and active_ = 1 and rownum = 1) as rescueDepartmentName , " +
			"(SELECT name FROM PCCC_Cadres WHERE cadresId = v.cadresId and active_ = 1 and rownum = 1) as cadresName , " +
			"(SELECT name FROM PCCC_Resident WHERE residentId = v.residentId and active_ = 1 and rownum = 1) as residentName FROM PCCC_Builder v WHERE active_ = 1  (:name is null or LOWER(name) like '%'|| LOWER(:name) ||'%')", nativeQuery = true)

//	@Query(value = "SELECT v.builderId as builderId,  v.userId as userId,  v.userName as userName,  v.createDate as createDate,  v.modifiedDate as modifiedDate,v.active_  as \\\"active\\\",  v.name as name,  v.code_ as code_,  v.properties as properties,v.description as description,  v.address as address,  v.phone as phone,  v.otherPhone as otherPhone,  v.direction as direction, v.isDisplayOnMap  as isDisplayOnMap,  v.registerDate as registerDate,  v.expireDate as expireDate,v.startUpYear as startUpYear,   v.digitalize  as digitalize,  v.fireSafetyId as fireSafetyId, v.sensorNumber as sensorNumber,v.search as search,  v.ownerTypeId as ownerTypeId,  v.builderOwnerId as builderOwnerId,  v.fireInsuranceRequired  as fireInsuranceRequired,v.fireInsuranceBought  as fireInsuranceBought,  v.web as web,  v.email as email,  v.avatar as avatar,v.checkNumberPerYear as checkNumberPerYear,  v.lat_ as lat_,  v.long_ as long_,  v.adminiLevelId as adminiLevelId,  v.countryInvestmentId as countryInvestmentId,v.builderTypeId as builderTypeId,  v.economicSectors as economicSectors,  v.branchField as branchField,  v.investmentTypeId as investmentTypeId, v.activityTypeId as activityTypeId, v.residentId as residentId,  v.cadresId as cadresId,  v.rescueDepartmentId as rescueDepartmentId,  v.provinceId as provinceId,  v.districtId as districtId,v.communeId as communeId, " +
//			"a.name as adminiLevelName ,  a1.name as fireSafetyName,   a2.name as ownerTypeName,  a3.name as builderTypeName,  adm.name  as countryInvestmentName,  a4.name as investmentTypeName ,a5.name  as activityTypeName , p.name as provinceName , d.name as districtName , c.name as communeName , r.name  as rescueDepartmentName , ca.name  as cadresName , re.name as residentName " +
//			"FROM pccc_builder v " +
//			"LEFT JOIN pccc_appdomain a ON  a.appdomainId = v.adminiLevelId LEFT JOIN pccc_appdomain a1 ON v.fireSafetyId = a1.appdomainId  LEFT JOIN pccc_appdomain a2 ON v.ownerTypeId = a2.appdomainId  LEFT JOIN pccc_appdomain a3 ON v.builderTypeId = a3.appdomainId  LEFT JOIN pccc_appdomain a4 ON v.investmentTypeId = a4.appdomainId  LEFT JOIN pccc_appdomain a5 ON v.activityTypeId = a5.appdomainId  LEFT JOIN pccc_adm_country adm ON v.countryInvestmentId = adm.id_  LEFT JOIN PCCC_Province p ON v.provinceId = p.provinceId   LEFT JOIN PCCC_District d ON v.districtId = d.districtId  LEFT JOIN PCCC_Commune c ON v.communeId = c.communeId  LEFT JOIN PCCC_RescueDepartment r ON v.rescueDepartmentId = r.rescueDepartmentId  LEFT JOIN PCCC_Cadres ca ON v.cadresId = ca.cadresId  LEFT JOIN PCCC_Resident re ON v.residentId = re.residentId  " +
//			"where (:name is null or LOWER(v.name) like '%'|| LOWER(:name) ||'%') and v.active_ = 1", nativeQuery = true)
	Page<PcccBuilder> getPaging(@Param("name") String name, Pageable pageable);

	final String strGetTotal = "SELECT "
			+ "count(cb.BUILDERID) as checkBuilding, count(ap.BUILDERID) as pcccApprove,  count(tr.BUILDERID) as pcccTranining, 0 as pcccPlan "
			+ "FROM PCCC_PCCCCHECKBUILDER cb " + "FULL OUTER JOIN PCCC_PCCCAPPROVE ap ON cb.BUILDERID = ap.BUILDERID "
			+ "FULL OUTER JOIN PCCC_PCCCTRANINING tr ON cb.BUILDERID = tr.BUILDERID "
			+ "where cb.BUILDERID = :builderId " + " GROUP BY cb.BUILDERID, ap.BUILDERID, tr.BUILDERID ";
	

	@Query(value = strGetTotal, nativeQuery = true)
	
	ProfessionalKnowledgeDto getTotal(@Param("builderId") long builderId);
	@Query(value = "SELECT pccc_builder.*   FROM pccc_builder, pccc_resident where pccc_builder.residentId = pccc_resident.residentId "
			+ " and pccc_resident.accountId = :userId and pccc_resident.active_ = 1", nativeQuery = true)
	List<PcccBuilder> getBuilderByUserId(@Param("userId") String userId);
	@Query(value = "SELECT *  FROM pccc_builder where lower(builderId) = :builderId and active_ = 1", nativeQuery = true)
	PcccBuilder getBuilderById(@Param("builderId") long builderId);	
	
}