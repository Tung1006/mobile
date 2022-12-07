package com.pda.mobile.model.entities;

import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "NOTIFYMESSAGE")
public class PcccNotifyMessage {
	@Id
	@Column(name = "MESSAGEID")
	private Long messageId;
	@Column(name ="TYPEOFMESSAGE")
	private String typeOfMessage;
	@Column(name ="SITEID")
	private Long siteId;
	@Column(name ="MESSAGE")
	private String message;	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name ="CREATEDATE")
	private Date createDate;	
	@Column(name ="CONFIRMSTATUS")
	private String confirmStatus;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")	
	@Column(name ="CONFIRMDATE")
	private Date confirmDate;	
	@Column(name ="EXPIRATIONTIME")
	private Integer expirationTime;	
	@Column(name ="USERCONFIRMID")
	private String userConfirmId;	
	@Column(name = "SITEOWNERID")
	private String siteOwnerId;
	@Column(name ="IMEI")
	private String imei;
	@Column(name ="NAMEDEVICE")
	private String nameDevice;
	@Column(name ="SITEADDRESS")
	private String siteAddress;
	@Column(name ="RELATEDUSERIDS")
	private String relatedUserIds;
	
	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	public String getTypeOfMessage() {
		return typeOfMessage;
	}
	public void setTypeOfMessage(String typeOfMessage) {
		this.typeOfMessage = typeOfMessage;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getConfirmStatus() {
		return confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}
	public Date getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}
	public Integer getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Integer expirationTime) {
		this.expirationTime = expirationTime;
	}
	public String getUserConfirmId() {
		return userConfirmId;
	}
	public void setUserConfirmId(String userConfirmId) {
		this.userConfirmId = userConfirmId;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getNameDevice() {
		return nameDevice;
	}
	public void setNameDevice(String nameDevice) {
		this.nameDevice = nameDevice;
	}
	public String getSiteAddress() {
		return siteAddress;
	}
	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}
	public String getRelatedUserIds() {
		return relatedUserIds;
	}
	public void setRelatedUserIds(String relatedUserIds) {
		this.relatedUserIds = relatedUserIds;
	}
	public String getSiteOwnerId() {
		return siteOwnerId;
	}
	public void setSiteOwnerId(String siteOwnerId) {
		this.siteOwnerId = siteOwnerId;
	}
	
}

