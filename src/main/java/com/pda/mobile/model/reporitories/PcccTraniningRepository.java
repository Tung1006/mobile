package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccTranining;

@Repository
@EnableJpaRepositories
public interface PcccTraniningRepository extends JpaRepository<PcccTranining, Long> {
	@Query(value = "SELECT PCCC_PCCCTRANINING.*,PCCC_BUILDER.name BUILDERNAME, pccc_rescuedepartment.name RESCUEDEPARTMENTNAME "
			+ " FROM PCCC_PCCCTRANINING "
			+ " LEFT JOIN PCCC_BUILDER ON PCCC_PCCCTRANINING.BUILDERID = PCCC_BUILDER.BUILDERID "
			+ " LEFT JOIN pccc_rescuedepartment ON PCCC_PCCCTRANINING.RESCUEDEPARTMENTID = pccc_rescuedepartment.RESCUEDEPARTMENTID "
			+ " where  (:builderId = 0  or PCCC_PCCCTRANINING.BUILDERID = :builderId) and SYSDATE < PCCC_PCCCTRANINING.TRANININGDATE and PCCC_PCCCTRANINING.active_ = 1", nativeQuery = true)
	List<PcccTranining> getEventUpcomingByBuilderId(@Param("builderId") Long builderId);
	
	@Query(value = "SELECT v.PcccTraniningId as PcccTraniningId, v.groupId as groupId,  v.userId as userId,  v.userName as userName, v.createDate as createDate,  v.modifiedDate as modifiedDate, " +
			"v.documentCode as documentCode, " +
//			"v.name as name\n" +
			"v.documentPosition as documentPosition, v.traniningDate as traniningDate,  v.traniningCertNumber as traniningCertNumber," +
			"v.traniningContent as traniningContent, v.traniningDuration as traniningDuration, v.rescueUnitNumber as rescueUnitNumber,v.leaderNumber as leaderNumber," +
			"v.staffNumber as staffNumber, v.otherObjectNumber as otherObjectNumber,  v.properties as properties, v.description as description," +
			"v.builderId as builderId,  v.rescueDepartmentId as rescueDepartmentId, v.provinceId as provinceId, v.districtId as districtId, " +
			"v.communeId as communeId, p.name  as provinceName ,  d.name  as districtName , c.name as communeName, b.name as BUILDERNAME, " +
			"r.name as RESCUEDEPARTMENTNAME , v.active_ as active_ " +
			"FROM PCCC_PCCCTRANINING v " +
			"LEFT JOIN PCCC_BUILDER  b ON v.BUILDERID = b.BUILDERID " +
			"LEFT JOIN pccc_rescuedepartment  r ON v.RESCUEDEPARTMENTID = r.RESCUEDEPARTMENTID " +
			"LEFT JOIN PCCC_Province  p ON v.provinceId = p.provinceId " +
			"LEFT JOIN PCCC_District  d ON v.districtId = d.districtId " +
			"LEFT JOIN PCCC_Commune  c ON v.communeId = c.communeId " +
			"where  (:builderId = 0  or v.BUILDERID = :builderId) and v.active_ = 1", nativeQuery = true)
	List<PcccTranining> findByBuilderId(Long builderId);
}