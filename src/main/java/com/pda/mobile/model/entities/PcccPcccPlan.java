package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PCCC_PCCCPLAN")
public class PcccPcccPlan {
	@Id
	@Column(name = "PCCCPLANID")
	private long pcccPlanId;
	@Column(name = "DOCUMENTCODE")
	private String documentCode;
	@Column(name = "DOCUMENTPOSITION")
	private String documentPosition;
	@Column(name = "PLANNAME")
	private String planName	;
	@JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Bangkok")
	@Column(name = "APPROVEDDATE")
	private Date approvedDate;
	@Column(name = "ISEXPIRED")
	private Integer isExpired;
	@Column(name = "PROPERTIES")
	private String properties;
	@Column(name = "DESCRIPTION")	
	private String description;
	@Column(name = "BUILDERID")	
	private long builderId;
	@Column(name = "RESCUEDEPARTMENTID")	
	private long rescueDepartmentId;
	@Column(name = "BUILDERNAME")		
	private String builderName;
	@Column(name = "RESCUEDEPARTMENTNAME")		
	private String rescueDepartmentName;

//	@Column(name = "URLFILE")
//	private String urlFile;

//	đơn vị thực thiện
//	@Column(name = "RESCUEDEPARTMENTIDD")
//	private long rescueDepartmentIdd;
//	@Column(name = "RESCUEDEPARTMENTNAMEE")
//	private String rescueDepartmentNamee;

//	@Column(name = "PLANCODE")
//	private String planCode;
//
//	@Column(name = "PLANTYPEID")
//	private Long planTypeId;
//
//	@Column(name = "PLANTYPENAME")
//	private String planTypeName;

	public long getPcccPlanId() {
		return pcccPlanId;
	}
	public void setPcccPlanId(long pcccPlanId) {
		this.pcccPlanId = pcccPlanId;
	}
	public String getDocumentCode() {
		return documentCode;
	}
	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}
	public String getDocumentPosition() {
		return documentPosition;
	}
	public void setDocumentPosition(String documentPosition) {
		this.documentPosition = documentPosition;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Date getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	public int getIsExpired() {
		return isExpired;
	}
	public void setIsExpired(int isExpired) {
		this.isExpired = isExpired;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getBuilderId() {
		return builderId;
	}
	public void setBuilderId(long builderId) {
		this.builderId = builderId;
	}
	public long getRescueDepartmentId() {
		return rescueDepartmentId;
	}
	public void setRescueDepartmentId(long rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
	}
	public String getBuilderName() {
		return builderName;
	}
	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public String getRescueDepartmentName() {
		return rescueDepartmentName;
	}
	public void setRescueDepartmentName(String rescueDepartmentName) {
		this.rescueDepartmentName = rescueDepartmentName;
	}

//	public String getUrlFile() {
//		return urlFile;
//	}
//	public void setUrlFile(String urlFile) {
//		this.urlFile = urlFile;
//	}


//	đơn vị thực hiện
//	public long getRescueDepartmentIdd() {
//		return rescueDepartmentIdd;
//	}
//	public void setRescueDepartmentIdd(long rescueDepartmentIdd) {
//		this.rescueDepartmentIdd = rescueDepartmentIdd;
//	}
//
//	public String getRescueDepartmentNamee() {
//		return rescueDepartmentNamee;
//	}
//	public void setRescueDepartmentNamee(String rescueDepartmentNamee) {
//		this.rescueDepartmentNamee = rescueDepartmentNamee;
//	}



//	public void setPlanTypeId(long planTypeId) {
//		this.planTypeId = planTypeId;
//	}
//	public String getPlanCode() {
//		return planCode;
//	}
//	public void setPlanCode(String planCode) {
//		this.planCode = planCode;
//	}

//	public String getPlanTypeName() {
//		return planTypeName;
//	}
//	public void setPlanTypeName(String planTypeName) {
//		this.planTypeName = planTypeName;
//	}

}
