package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PCCC_CSCTMOBILEACCESS")
public class PcccCSCTMobileAccess {

	@Id
	@GeneratedValue(generator = "CSCTMOBILEACCESS_SEQ")
	@GenericGenerator(name = "CSCTMOBILEACCESS_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")	
	@Column(name = "id")
	private long id;
	@Column(name="bundleID")
	private String bundleId;
	@Column(name="username")
	private String username;
	@Column(name="userId")
	private String userId;	
	@Column(name="accessToken")
	private String accessToken;
	@Column(name="tokenID")
	private String tokenId;
	@Column(name="deviceToken")
	private String deviceToken;
	@Column(name="os")
	private String osName;
	@Column(name="modelName")
	private String modelName;
	@Column(name="brandName")
	private String brandName;
	@Column(name="requestTime")
	private String requestTime;
	@Column(name="status")
	private int status;
	
	@Column(name ="UUID_DEVICE")
	private String uuidDevice;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name ="REGISTER_DATE")
	private Date registerDate;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name ="REFRESH_DATE")
	private Date refreshDate;	
	public long getId() {
		return id;
	}
	public String getBundleId() {
		return bundleId;
	}
	public String getUsername() {
		return username;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public String getTokenId() {
		return tokenId;
	}
	public String getDeviceToken() {
		return deviceToken;
	}
	public String getOsName() {
		return osName;
	}
	public String getModelName() {
		return modelName;
	}
	public String getBrandName() {
		return brandName;
	}
	public String getRequestTime() {
		return requestTime;
	}
	public int getStatus() {
		return status;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUuidDevice() {
		return uuidDevice;
	}
	public void setUuidDevice(String uuidDevice) {
		this.uuidDevice = uuidDevice;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public Date getRefreshDate() {
		return refreshDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public void setRefreshDate(Date refreshDate) {
		this.refreshDate = refreshDate;
	}
	
}
