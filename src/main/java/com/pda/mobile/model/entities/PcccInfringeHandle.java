package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PCCC_INFRINGEHANDLE")
public class PcccInfringeHandle {

	@Id
	@GeneratedValue(generator = "INFRINGEHANDLE_SEQ")
	@GenericGenerator(name = "INFRINGEHANDLE_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "INFRINGEHANDLEID")
	private Long infringeHandleId;

	@Column(name = "BUILDERID")
	private Long builderId;

	@Column(name="USERID")
	private Long userId ;

	@Column(name="INFRINGEGROUPID")
	private Long infringeGroupId ;

	@Column(name="RESCUEDEPARTMENTID")
	private Long rescueDepartmentId ;

	@Column(name="PROVINCEID")
	private Long provinceId ;

	@Column(name="DISTRICTID")
	private Long districtId ;

	@Column(name="COMMUNEID")
	private Long communeId ;

	@Column(name="USERNAME")
	private String userName;

	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "Asia/Bangkok")
	@Column(name = "INFRINGEDATE")
	private Date infringeDate;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "CREATEDATE")
	private Date createDate;

	@Column(name="BUILDERNAME")
	private String builderName;


	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="MODIFIEDDATE")
	private Date modifiedDate;

	@Column(name = "INFRINGEAMOUNT")
	private Double infringeAmount;

	@Column(name = "INFRINGECONTENT")
	private String infringeContent;

	@Column(name ="ACTIVE_")
	private Boolean active_ = true;

	@Column(name= "ISWARNING")
	private Integer isWarning;

	@Column(name ="ISSUSPENDED")
	private Integer isSuspended;

	@Column(name ="ISTEMPSUSPENDED")
	private Integer isTempSuspended;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name ="TEMPSUSPENDEDDATE")
	private String tempSuspendedDate;

	@Column(name="DOCCODE")
	private String docCode;
	@Column(name="OTHERCONTENT")
	private String otherContent;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="TEMPSUSPENDEDREACTIVEDATE")
	private Date tempSuspendedReactiveDate;
	@Column(name="CHECKEDID")
	private Long checkId;
	@Column(name="RESCUEDEPARTMENTNAME")
	private String rescueDepartmentName;

	@Column(name = " INFRINGEOBJECT")
	private String infringeObject;

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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}
	
	public PcccInfringeHandle() {
		// TODO Auto-generated constructor stub
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





//	@Column(name = " FILEURL")
//	private String fileUrl;

	public String getInfringeObject() {
		return infringeObject;
	}

	public void setInfringeObject(String infringeObject) {
		this.infringeObject = infringeObject;
	}

	public Long getInfringeGroupId() {
		return infringeGroupId;
	}

	public void setInfringeGroupId(Long infringeGroupId) {
		this.infringeGroupId = infringeGroupId;
	}

//	public String getFileUrl() {
//		return fileUrl;
//	}
//
//	public void setFileUrl(String fileUrl) {
//		this.fileUrl = fileUrl;
//	}

	public Long getInfringeHandleId() {
		return infringeHandleId;
	}

	public void setInfringeHandleId(Long infringeHandleId) {
		this.infringeHandleId = infringeHandleId;
	}

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	public Date getInfringeDate() {
		return infringeDate;
	}

	public void setInfringeDate(Date infringeDate) {
		this.infringeDate = infringeDate;
	}

	public Double getInfringeAmount() {
		return infringeAmount;
	}

	public void setInfringeAmount(Double infringeAmount) {
		this.infringeAmount = infringeAmount;
	}

	public String getInfringeContent() {
		return infringeContent;
	}

	public void setInfringeContent(String infringeContent) {
		this.infringeContent = infringeContent;
	}

	public Boolean getActive_() {
		return active_;
	}

	public void setActive_(Boolean active_) {
		this.active_ = active_;
	}

	public Integer getIsWarning() {
		return isWarning;
	}

	public void setIsWarning(Integer isWarning) {
		this.isWarning = isWarning;
	}

	public Integer getIsSuspended() {
		return isSuspended;
	}

	public void setIsSuspended(Integer isSuspended) {
		this.isSuspended = isSuspended;
	}

	public Integer getIsTempSuspended() {
		return isTempSuspended;
	}

	public void setIsTempSuspended(Integer isTempSuspended) {
		this.isTempSuspended = isTempSuspended;
	}

	public String getTempSuspendedDate() {
		return tempSuspendedDate;
	}

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getOtherContent() {
		return otherContent;
	}

	public void setOtherContent(String otherContent) {
		this.otherContent = otherContent;
	}

	public Date getTempSuspendedReactiveDate() {
		return tempSuspendedReactiveDate;
	}

	public void setTempSuspendedReactiveDate(Date tempSuspendedReactiveDate) {
		this.tempSuspendedReactiveDate = tempSuspendedReactiveDate;
	}

	public Long getCheckId() {
		return checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}

	public String getRescueDepartmentName() {
		return rescueDepartmentName;
	}

	public void setRescueDepartmentName(String rescueDepartmentName) {
		this.rescueDepartmentName = rescueDepartmentName;
	}

	public void setTempSuspendedDate(String tempSuspendedDate) {
		this.tempSuspendedDate = tempSuspendedDate;
	}
	
}
