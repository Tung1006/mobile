package com.pda.mobile.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name ="PCCC_RESIDENT")
public class PcccResident {

	@Id
	@GeneratedValue(generator = "RESIDENT_SEQ")
	@GenericGenerator(name = "RESIDENT_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "RESIDENTID")
	private long residentId;

//	@Column(name = "userid")
//	private Long userId;
//
//	@Column(name = "username")
//	private String userName;

	@Column(name = "createdate")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private java.util.Date createDate;

	@Column(name = "modifieddate")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private java.util.Date modifiedDate;

	@Column(name = "active_")
	private Boolean active;

	@Column(length = 129, name = "name")
	private String name;

	@Column(name = "properties")
	private String properties;

	@Column(length = 257, name = "description")
	private String description;

	@Column(length = 21, name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	@Column(length = 129, name = "search")
	private String search;

	@Column(length = 257, name = "currentaddress")
	private String currentAddress;

	@Column(length = 257, name = "address")
	private String address;

	@Column(length = 21, name = "idcard")
	private String idCard;

	@Column(name = "dob")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date dob;

	@Column(name = "sex")
	private Long sex;

	@Column(length = 129, name = "accountid")
	private String accountId;

	@Column(length = 129, name = "accountname")
	private String accountName;

	@Column(length = 257, name = "accountpassword")
	private String accountPassword;

	@Column(name = "provinceid")
	private Long provinceId;

	@Column(name = "districtid")
	private Long districtId;

	@Column(name = "communeid")
	private Long communeId;

	@Transient
	private String provinceName;

	@Transient
	private String districtName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESIDENTID", insertable = false, updatable = false)
	private PcccBuilder builder;




	public PcccResident() {
	}

	public long getResidentId() {
		return residentId;
	}

	public void setResidentId(long residentId) {
		this.residentId = residentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getSex() {
		return sex;
	}

	public void setSex(Long sex) {
		this.sex = sex;
	}
}
