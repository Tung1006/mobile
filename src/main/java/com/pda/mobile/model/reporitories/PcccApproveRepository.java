package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccApprove;

@Repository
@EnableJpaRepositories
public interface PcccApproveRepository extends JpaRepository<PcccApprove, Long> {

	@Query(value = "SELECT" +
			"        v.PCCCAPPROVEID as PCCCAPPROVEID," +
			"        v.userId as userId," +
			"        v.userName as userName," +
			"        v.createDate as createDate, " +
			"        v.modifiedDate as modifiedDate," +
			"        v.active_ as active_," +
			"        v.documentCode as documentCode," +
			"        v.documentPosition as documentPosition," +
			"        v.approveTypeId as approveTypeId," +
			"        v.docName as docName," +
			"        v.docCode as docCode," +
			"        v.grantDate as grantDate,  " +
			"        v.rescueDepartmentId as rescueDepartmentId," +
			"        v.note as note,  " +
			"        v.properties as properties,  " +
			"        v.description as description,  " +
			"        v.builderId as builderId," +
			"        v.provinceId as provinceId,  " +
			"        v.districtId as districtId,  " +
			"        v.communeId as communeId," +
			"        'investorName'," +
			"        'designName'," +
			"        a.name as APPROVETYPENAME," +
			"        b.NAME as BUILDERNAME," +
			"        r.name as RESCUEDEPARTMENTNAME " +
			"    FROM PCCC_PCCCAPPROVE v " +
			"    LEFT JOIN PCCC_BUILDER b ON v.BUILDERID = b.BUILDERID " +
			"    LEFT JOIN pccc_rescuedepartment r ON v.RESCUEDEPARTMENTID = r.RESCUEDEPARTMENTID " +
			"    LEFT JOIN pccc_appdomain a ON v.APPROVETYPEID = a.appdomainid"
			+ "   where "
			+ "  v.BUILDERID = :builderId and "
			+ "  v.APPROVETYPEID = :approveTypeId and "
			+ "  v.ACTIVE_ = 1", nativeQuery = true)
	List<PcccApprove> findByBuilderIdAndApproveTypeId(Long builderId, Long approveTypeId);

}