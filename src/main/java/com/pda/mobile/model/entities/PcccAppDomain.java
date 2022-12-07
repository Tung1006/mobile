package com.pda.mobile.model.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table (name ="pccc_appdomain")
public class PcccAppDomain {
	@Id
	@Column(name = "APPDOMAINID")
	private Long appDomainId;
	
	@Column(name = "GROUPID")
	private Long groupId;
	
	@Column(name = "COMPANYID")
	private Long companyId;
	
	@Column(name = "USERID")
	private Long userId;
	@Column(name = "USERNAME")
	private String userName;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "CREATEDATE")
	private Date createDate;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = "MODIFIEDDATE")
	private Date modifieDate;
	
	@Column(name = "ACTIVE_")
	private Integer active;
	
	@Column(name = "CODE_")
	private String code;
	
	@Column(name = "NAME")
	private String name;
	@Column(name = "TYPE_")
	private String type;
	
	@Column(name = "PARENTID")
	private Integer parentId;
	
	@Column(name = "ICON")
	private String icon;
	@Column(name = "PROPERTIES")
	private String properties;
	@Column(name = "DESCRIPTION")
	private String description;

	public Long getAppDomainId() {
		return appDomainId;
	}

	public void setAppDomainId(Long appDomainId) {
		this.appDomainId = appDomainId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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

	public Date getModifieDate() {
		return modifieDate;
	}

	public void setModifieDate(Date modifieDate) {
		this.modifieDate = modifieDate;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
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
}
