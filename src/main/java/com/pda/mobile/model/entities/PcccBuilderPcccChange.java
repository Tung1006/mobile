package com.pda.mobile.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "PCCC_BUILDERPCCCCHANGE")
public class PcccBuilderPcccChange {

	@Id
	@Column(name = "BUILDERPCCCCHANGEID")
	private Long builderPcccChangeId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CONTENT")
	private String content;

	@Column(name = "STATUS")
	private String status;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDATE")
	private Date createDate;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIEDDATE")
	private Date modifyDate;

	public PcccBuilderPcccChange() {
		// TODO Auto-generated constructor stub
	}

	public Long getBuilderPcccChangeId() {
		return builderPcccChangeId;
	}

	public void setBuilderPcccChangeId(Long builderPcccChangeId) {
		this.builderPcccChangeId = builderPcccChangeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
