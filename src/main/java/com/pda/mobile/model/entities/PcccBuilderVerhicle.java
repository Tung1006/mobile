package com.pda.mobile.model.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PCCC_BUILDERVEHICLE")
public class PcccBuilderVerhicle {

	@Id
	@GeneratedValue(generator = "BUILDERVEHICLE_SEQ")
	@GenericGenerator(name = "BUILDERVEHICLE_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")	
	@Column(name = "BUILDERVEHICLEID")
	private Long builderVehicleId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CODE_")
	private String code_;

	@Column(name = "UNIT")
	private String unit;

	@Column(name = "QUANTITY")
	private Long quantity;

	@Column(name = "BUILDERID")
	private Long builderId;

	@Column(name = "TYPE_")
	private String type_;
	@Column(name = "TYPEDETAIL")
	private String typeDetail;

	@Column(name = "STATE_")
	private String state_;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "NOTE")
	private String note;	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="CREATEDATE")
	private Date createDate;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="MODIFIEDDATE")
	private Date modifiedDate;	
	
	@Column(name="MFGYEAR")
	private String mfgYear;
	@Column(name="POSITITON")
	private String position;
	public String getMfgYear() {
		return mfgYear;
	}
	public String getMfgCountry() {
		return mfgCountry;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setMfgYear(String mfgYear) {
		this.mfgYear = mfgYear;
	}
	public void setMfgCountry(String mfgCountry) {
		this.mfgCountry = mfgCountry;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	@Column(name="MFGCOUNTRY")
	private String mfgCountry;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	@Column(name="APPROVEDATE")
	private Date approveDate;

	@Column(name="USERID")
	private Long userId ;

	@Column(name="USERNAME")
	private String userName;

	@Column(name="ACTIVE_")
	private Boolean active_ = true ;


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

	public Boolean getActive_() {
		return active_;
	}

	public void setActive_(Boolean active_) {
		this.active_ = active_;
	}
	
	public PcccBuilderVerhicle() {
		// TODO Auto-generated constructor stub
	}
	public Long getBuilderVehicleId() {
		return builderVehicleId;
	}
	public void setBuilderVehicleId(Long builderVehicleId) {
		this.builderVehicleId = builderVehicleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode_() {
		return code_;
	}
	public String getUnit() {
		return unit;
	}
	public Long getQuantity() {
		return quantity;
	}
	public Long getBuilderId() {
		return builderId;
	}
	public String getType_() {
		return type_;
	}
	public String getTypeDetail() {
		return typeDetail;
	}
	public String getState_() {
		return state_;
	}
	public String getStatus() {
		return status;
	}
	public String getNote() {
		return note;
	}
	public void setCode_(String code_) {
		this.code_ = code_;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}
	public void setType_(String type_) {
		this.type_ = type_;
	}
	public void setTypeDetail(String typeDetail) {
		this.typeDetail = typeDetail;
	}
	public void setState_(String state_) {
		this.state_ = state_;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
