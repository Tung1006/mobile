package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PCCC_PCCCTRANINING")
public class PcccTranining {

	@Id
	@Column(name = "PCCCTRANININGID")
	private long pcccTraniningId;


	@Column(name="USERID")
	private Long userId ;

	@Column(name="USERNAME")
	private String userName;

	@Column(name="ACTIVE_")
	private Boolean active_ = true ;

//	@Column(name="Name")
//	private String name;

	@Column(name="CREATEDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date createDate;

	@Column(name="MODIFIEDDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date modifiedDate;

	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "Asia/Bangkok")
	@Column(name = "TRANININGDATE")
	private Date traniningDate;

	@Column(name = "BUILDERID")
	private Long builderId;

	@Column(name = "RESCUEUNITNUMBER")
	private Long rescueUnitNumber;

	@Column(name ="DOCUMENTCODE")
	private String documentCode;

	@Column(name ="DOCUMENTPOSITION")
	private String documentPosition;

	@Column(name ="TRANININGCERTNUMBER")
	private Long trainningCertNumber;

	@Column(name ="TRANININGCONTENT")
	private String trainningContent;

	@Column(name ="TRANININGDURATION")
	private Long trainningDuration;

	@Column(name ="LEADERNUMBER")
	private Long leaderNumber;

	@Column(name ="STAFFNUMBER")
	private Long staffNumber;

	@Column(name = "OTHEROBJECTNUMBER")
	private Long otherObjectNumber;

	@Column(name = "PROPERTIES")
	private String properties;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "BUILDERNAME") // Ko có
	private String builderName;

	@Column(name = "RESCUEDEPARTMENTNAME")// Ko có
	private String rescueDepartmentName;



	public PcccTranining() {
		super();
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

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public Boolean getActive_() {
		return active_;
	}

	public void setActive_(Boolean active_) {
		this.active_ = active_;
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

	public Date getTraniningDate() {
		return traniningDate;
	}

	public void setTraniningDate(Date traniningDate) {
		this.traniningDate = traniningDate;
	}

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	public Long getRescueUnitNumber() {
		return rescueUnitNumber;
	}

	public void setRescueUnitNumber(Long rescueUnitNumber) {
		this.rescueUnitNumber = rescueUnitNumber;
	}

	public long getPcccTraniningId() {
		return pcccTraniningId;
	}

	public void setPcccTraniningId(long pcccTraniningId) {
		this.pcccTraniningId = pcccTraniningId;
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

	public Long getTrainningCertNumber() {
		return trainningCertNumber;
	}

	public void setTrainningCertNumber(Long trainningCertNumber) {
		this.trainningCertNumber = trainningCertNumber;
	}

	public String getTrainningContent() {
		return trainningContent;
	}

	public void setTrainningContent(String trainningContent) {
		this.trainningContent = trainningContent;
	}

	public Long getTrainningDuration() {
		return trainningDuration;
	}

	public void setTrainningDuration(Long trainningDuration) {
		this.trainningDuration = trainningDuration;
	}

	public Long getLeaderNumber() {
		return leaderNumber;
	}

	public void setLeaderNumber(Long leaderNumber) {
		this.leaderNumber = leaderNumber;
	}

	public Long getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(Long staffNumber) {
		this.staffNumber = staffNumber;
	}

	public Long getOtherObjectNumber() {
		return otherObjectNumber;
	}

	public void setOtherObjectNumber(Long otherObjectNumber) {
		this.otherObjectNumber = otherObjectNumber;
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

}