package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "pccc_pccccheckbuilder")
public class PcccCheckBuilder {
	@Id
	@Column(name="PCCCCHECKBUILDERID")
	private Long PcccCheckBuilderId;

	@Column(name="GROUPID")
	private Long groupId ;

	@Column(name="USERID")
	private Long userId ;

	@Column(name="USERNAME")
	private String userName;

	@Column(name="CREATEDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date createDate;

	@Column(name="MODIFIEDDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date modifiedDate;


	@Column(name="STATUSID")
	private Long statusId ;

	@Column(name="STATUSNAME")
	private String STATUSNAME;

	@Column(name="CHECKNAME")
	private String checkName;


	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="CHECKDATE")
	private Date checkDate;


	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="CHECKSTARTDATE")
	private Date checkStartDate;


	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="CHECKENDDATE")
	private Date checkEndDate;

	@Column(name="CHECKDESC")
	private String checkDesc;

	@Column(name="CHECKCONTENT")
	private String checkContent;

	@Column(name="CHECKSTATUSID")
	private Long checkStatusId ;

	@Column(name="CHECKSTATUSNAME")
	private String checkStatusName;

	@Column(name="CHECKCADRESID")
	private Long checkCadresId ;

	@Column(name="CHECKCADRESNAME")
	private String checkCadresName;

	@Column(name="CHECKCADRESRANK")
	private String checkCadresRank;


	@Column(name="CHECKDECIDE")
//	@Length(max = 64, message = "checkDecide,value-is-out-of-length, 64")
	private String checkDecide;

	@Column(name="CHECKINFOMATION")
	private String checkInfomation;

	@Column(name="CHECKEVALUATE")
	private Boolean checkEvaluate ;

	@Column(name="CHECKCADRESEVALUATE")
	private String checkCadresEvaluate;

	@Column(name="CHECKNOTE")
//	@Length(max = 256, message = "checkNote,value-is-out-of-length, 256")
	private String checkNote;

	@Column(name="SEARCH")
//	@Length(max = 128, message = "search,value-is-out-of-length, 128")
	private String search;

	@Column(name="REREJECTREASON")
	private String rerejectReason;

	@Column(name="PROPERTIES")
	private String properties;

	@Column(name="DESCRIPTION")
//	@Length(max = 256, message = "description,value-is-out-of-length, 256")
	private String description;

	@Column(name="CHECKPLANID")
	private Long checkPlanId ;

	@Column(name="BUILDERID")
	private Long builderId ;

	@Column(name="RESCUEDEPARTMENTID")
	private Long rescueDepartmentId ;

	@Column(name="PROVINCEID")
	private Long provinceId ;

	@Column(name="DISTRICTID")
	private Long districtId ;

	@Column(name="COMMUNEID")
	private Long communeId ;

	@Column(name="BUILDERNAME")
	private String builderName;

	@Column(name="CHECKPLANNAME")
	private String checkPlanName;

	@Column(name="PROVINCENAME")
	private String provinceName;

	@Column(name="DISTRICTNAME")
	private String districtName;


	@Column(name="COMMUNENAME")
	private String communeName;

	@Column(name="RESCUEDEPARTMENTNAME")
	private String rescueDepartmentName;


	//	@Column(name="URLFILE")
	//	private String urlFile;

//	@Column(name="TYPEID")
//	private Long typeId;
//
//	@Column(name="TYPENAME")
//	private String typeName;

	public PcccCheckBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Long getPcccCheckBuilderId() {
		return PcccCheckBuilderId;
	}

	public void setPcccCheckBuilderId(Long pcccCheckBuilderId) {
		PcccCheckBuilderId = pcccCheckBuilderId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}



	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getSTATUSNAME() {
		return STATUSNAME;
	}

	public void setSTATUSNAME(String sTATUSNAME) {
		STATUSNAME = sTATUSNAME;
	}

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Date getCheckStartDate() {
		return checkStartDate;
	}

	public void setCheckStartDate(Date checkStartDate) {
		this.checkStartDate = checkStartDate;
	}

	public Date getCheckEndDate() {
		return checkEndDate;
	}

	public void setCheckEndDate(Date checkEndDate) {
		this.checkEndDate = checkEndDate;
	}

	public String getCheckDesc() {
		return checkDesc;
	}

	public void setCheckDesc(String checkDesc) {
		this.checkDesc = checkDesc;
	}

	public String getCheckContent() {
		return checkContent;
	}

	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
	}

	public Long getCheckStatusId() {
		return checkStatusId;
	}

	public void setCheckStatusId(Long checkStatusId) {
		this.checkStatusId = checkStatusId;
	}

	public String getCheckStatusName() {
		return checkStatusName;
	}

	public void setCheckStatusName(String checkStatusName) {
		this.checkStatusName = checkStatusName;
	}

	public Long getCheckCadresId() {
		return checkCadresId;
	}

	public void setCheckCadresId(Long checkCadresId) {
		this.checkCadresId = checkCadresId;
	}

	public String getCheckCadresName() {
		return checkCadresName;
	}

	public void setCheckCadresName(String checkCadresName) {
		this.checkCadresName = checkCadresName;
	}

	public String getCheckCadresRank() {
		return checkCadresRank;
	}

	public void setCheckCadresRank(String checkCadresRank) {
		this.checkCadresRank = checkCadresRank;
	}

	public String getCheckDecide() {
		return checkDecide;
	}

	public void setCheckDecide(String checkDecide) {
		this.checkDecide = checkDecide;
	}

	public String getCheckInfomation() {
		return checkInfomation;
	}

	public void setCheckInfomation(String checkInfomation) {
		this.checkInfomation = checkInfomation;
	}

	public Boolean getCheckEvaluate() {
		return checkEvaluate;
	}

	public void setCheckEvaluate(Boolean checkEvaluate) {
		this.checkEvaluate = checkEvaluate;
	}

	public String getCheckCadresEvaluate() {
		return checkCadresEvaluate;
	}

	public void setCheckCadresEvaluate(String checkCadresEvaluate) {
		this.checkCadresEvaluate = checkCadresEvaluate;
	}

	public String getCheckNote() {
		return checkNote;
	}

	public void setCheckNote(String checkNote) {
		this.checkNote = checkNote;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getRerejectReason() {
		return rerejectReason;
	}

	public void setRerejectReason(String rerejectReason) {
		this.rerejectReason = rerejectReason;
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

	public Long getCheckPlanId() {
		return checkPlanId;
	}

	public void setCheckPlanId(Long checkPlanId) {
		this.checkPlanId = checkPlanId;
	}

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	public Long getRescueDepartmentId() {
		return rescueDepartmentId;
	}

	public void setRescueDepartmentId(Long rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getCommuneId() {
		return communeId;
	}

	public void setCommuneId(Long communeId) {
		this.communeId = communeId;
	}

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public String getCheckPlanName() {
		return checkPlanName;
	}

	public void setCheckPlanName(String checkPlanName) {
		this.checkPlanName = checkPlanName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getCommuneName() {
		return communeName;
	}

	public void setCommuneName(String communeName) {
		this.communeName = communeName;
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
//
//	public void setUrlFile(String urlFile) {
//		this.urlFile = urlFile;
//	}


//	public Long getTypeId() {
//		return typeId;
//	}
//
//	public void setTypeId(Long typeId) {
//		this.typeId = typeId;
//	}
//
//	public String getTypeName() {
//		return typeName;
//	}
//
//	public void setTypeName(String typeName) {
//		this.typeName = typeName;
//	}
}

