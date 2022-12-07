package com.pda.mobile.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PCCC_CSCTFMHistory")
public class PcccCSCTFMHistory {

	@Id
	@GeneratedValue(generator = "CSCTFMHISTORY_SEQ")
	@GenericGenerator(name = "CSCTFMHISTORY_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")	
	@Column(name = "id")
	private long id;
	@Column(name="messageId")
	private long messageId;
	@Column(name="title")
	private String title;
	@Column(name="mesageData")
	private String mesageData;
	@Column(name="sentResult")
	private int sentResult;
	@Column(name="errorCode")
	private String errorCode;
	@Column(name="sentTime")
	private String sentTime;
	public long getId() {
		return id;
	}
	public long getMessageId() {
		return messageId;
	}
	public String getTitle() {
		return title;
	}
	public String getMesageData() {
		return mesageData;
	}
	public int getSentResult() {
		return sentResult;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public String getSentTime() {
		return sentTime;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setMesageData(String mesageData) {
		this.mesageData = mesageData;
	}
	public void setSentResult(int sentResult) {
		this.sentResult = sentResult;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public void setSentTime(String sentTime) {
		this.sentTime = sentTime;
	}	
}
