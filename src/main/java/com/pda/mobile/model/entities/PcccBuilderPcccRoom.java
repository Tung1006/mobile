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
@Table(name="pccc_builderroom")
public class PcccBuilderPcccRoom 
{
	@Id
	@Column(name="BUILDERROOMID")
	private Long builderRoomId;
	@Column(name="GROUPID")
	private Long groudId;
	@Column(name="USERID")
	private Long userId;
	@Column(name="USERNAME")
	private String userName;
	
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="CREATEDATE")
	private Date createDate;
	
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name="MODIFIEDDATE")
	private Date modifiedDate;
	
	@Column(name="ACTIVE_")
	private int active;
	
	@Column(name="ROOMNAME")
	private String roomName;
	@Column(name="BUILDERID")
	private Long builderId;
	
	@Column(name="RESCUEDEPARTMENTID")
	private Long rescueDepartmentId;
	@Column(name="PROVINCEID")
	private Long provinceId;
	
	@Column(name="DISTRICTID")
	private Long districtId;
	@Column(name="COMMUNEID")
	private Long communeId;
	
	public Long getBuilderRoomId() {
		return builderRoomId;
	}
	public Long getGroudId() {
		return groudId;
	}
	public Long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public int getActive() {
		return active;
	}
	public String getRoomName() {
		return roomName;
	}
	public Long getBuilderId() {
		return builderId;
	}
	public Long getRescueDepartmentId() {
		return rescueDepartmentId;
	}
	public Long getProvinceId() {
		return provinceId;
	}
	public Long getDistrictId() {
		return districtId;
	}
	public Long getCommuneId() {
		return communeId;
	}
	public void setBuilderRoomId(Long builderRoomId) {
		this.builderRoomId = builderRoomId;
	}
	public void setGroudId(Long groudId) {
		this.groudId = groudId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}
	public void setRescueDepartmentId(Long rescueDepartmentId) {
		this.rescueDepartmentId = rescueDepartmentId;
	}
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}
	public void setCommuneId(Long communeId) {
		this.communeId = communeId;
	}	
}
