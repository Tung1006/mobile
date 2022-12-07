package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PCCC_BUILDERPCCCUNIT")
public class PcccBuilderPcccUnit {

	@Id
	@GeneratedValue(generator = "BUILDERPCCCUNIT_SEQ")
	@GenericGenerator(name = "BUILDERPCCCUNIT_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "BUILDERPCCCUNITID")
	private Long builderPcccUnitId;

	@Column(name="USERID")
	private Long userId ;

	@Column(name="USERNAME")
	private String userName;

	@Column(name="ACTIVE_")
	private Boolean active_ = true ;

	@NotBlank
	@Column(name = "NAME")
	private String name;

	@Column(name = "ISLEADER")
	private Integer isLeader = 0;

	@Column(name = "INWORKINGTIME")
	private Integer inWorkingTime = 0;

	@Column(name = "STATUS")
	private Integer status;
	
	@Column(name = "HAVECERT")
	private Integer haveCert = 0;
	
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "DOB")
	private Date dob;

	@Column(name = "BUILDERID")
	private Long builderId;

	@Column(name = "PHONENUMBER")
	private String phoneNumber;

	@Column(name = "NOTE")
	private String note;

	
	@NotNull
	@Size(min =10, max=12)
	@NumberFormat
	@Column(name = "PERSIONID")
	private String indenityNumber = "";
	
	@Column(name = "ADDRESS")
	private String  permanentAddress= "";
	
	@Column(name = "DEPT")
	private String  department= "";
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "CREATEDATE")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "MODIFIEDDATE")
	private Date modifyDate;

	@Column(name = "USERAPPROVENAME")
	private String userApproveName ;

	@Column(name = "USERAPPROVEID")
	private Long userApproveId ;



	public String getUserApproveName() {
		return userApproveName;
	}

	public void setUserApproveName(String userApproveName) {
		this.userApproveName = userApproveName;
	}

	public Long getUserApproveId() {
		return userApproveId;
	}

	public void setUserApproveId(Long userApproveId) {
		this.userApproveId = userApproveId;
	}

	public PcccBuilderPcccUnit() {
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

	public Integer getHaveCert() {
		return haveCert;
	}

	public String getIndenityNumber() {
		return indenityNumber;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public String getDepartment() {
		return department;
	}

	public void setHaveCert(Integer haveCert) {
		this.haveCert = haveCert;
	}

	public void setIndenityNumber(String indenityNumber) {
		this.indenityNumber = indenityNumber;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Boolean getActive_() {
		return active_;
	}

	public void setActive_(Boolean active_) {
		this.active_ = active_;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getBuilderPcccUnitId() {
		return builderPcccUnitId;
	}

	public void setBuilderPcccUnitId(Long builderPcccUnitId) {
		this.builderPcccUnitId = builderPcccUnitId;
	}

	public Integer getIsLeader() {
		return isLeader;
	}

	public void setIsLeader(Integer isLeader) {
		this.isLeader = isLeader;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public Integer getInWorkingTime() {
		return inWorkingTime;
	}

	public void setInWorkingTime(Integer inWorkingTime) {
		this.inWorkingTime = inWorkingTime;
	}

}
