package com.pda.mobile.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PCCC_CADRES")
public class PcccCadres {

	@Id
	@GeneratedValue(generator = "CADRES_SEQ")
	@GenericGenerator(name = "CADRES_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "CADRESID")
	private Long cadresId;

//	@Column(name = "userid")
//	private Long userId;
//
//	@Column( name = "username")
//	private String userName;
//
//	@Column(name = "createdate")
//	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
//	private Date createDate;
//
//	@Column(name = "modifieddate")
//	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
//	private Date modifiedDate;
//
//	@Column(name = "ACTIVE_")
//	private Boolean active;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;

	@Column(name = "dob")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date dob;

//	@Column(name = "properties")
//	private String properties;
//
//	@Column(length = 257, name = "description")
//	private String description;

//	@Column(name = "avatarurl")
//	private String avatarUrl;

	@Column(name = "IDCARD")
	private String idCard;

//	@Column(name = "stafftype")
//	private String staffType;
//
//	@Column(name = "staffcode")
//	private String staffCode;
//
//	@Column(name = "email")
//	private String email;
//
//	@Column(name = "starttime")
//	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
//	private Date startTime;
//
//	@Column(name = "accountid")
//	private Long accountId;
//
//	@Column(name = "positionid")
//	private Long positionId;
//
//	@Column(name = "rankid")
//	private Long rankId;
//
//	@Column(name = "jobtypeid")
//	private Long jobTypeId;
//
//	@Column(name = "rescueteamid")
//	private Long rescueTeamId;
//
//	@Column(name = "rescuedepartmentid")
//	private Long rescueDepartmentId;
//
//	@Column(name = "provinceid")
//	private Long provinceId;
//
//	@Column(name = "districtid")
//	private Long districtId;
//
//	@Transient
//	private String provinceName;
//
//	@Transient
//	private String districtName;
//
//	@Column(name = "communeid")
//	private Long communeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CADRESID", insertable = false, updatable = false)
	private PcccCadres builderCader;


	public PcccCadres() {
		// TODO Auto-generated constructor stub
	}

	public Long getCadresId() {
		return cadresId;
	}

	public void setCadresId(Long cadresId) {
		this.cadresId = cadresId;
	}

//	public Long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public Date getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//
//	public Date getModifiedDate() {
//		return modifiedDate;
//	}
//
//	public void setModifiedDate(Date modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}
//
//	public Boolean getActive() {
//		return active;
//	}
//
//	public void setActive(Boolean active) {
//		this.active = active;
//	}

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

//	public String getProperties() {
//		return properties;
//	}
//
//	public void setProperties(String properties) {
//		this.properties = properties;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getAvatarUrl() {
//		return avatarUrl;
//	}
//
//	public void setAvatarUrl(String avatarUrl) {
//		this.avatarUrl = avatarUrl;
//	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

//	public String getStaffType() {
//		return staffType;
//	}
//
//	public void setStaffType(String staffType) {
//		this.staffType = staffType;
//	}
//
//	public String getStaffCode() {
//		return staffCode;
//	}
//
//	public void setStaffCode(String staffCode) {
//		this.staffCode = staffCode;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Date getStartTime() {
//		return startTime;
//	}
//
//	public void setStartTime(Date startTime) {
//		this.startTime = startTime;
//	}
//
//	public Long getAccountId() {
//		return accountId;
//	}
//
//	public void setAccountId(Long accountId) {
//		this.accountId = accountId;
//	}
//
//	public Long getPositionId() {
//		return positionId;
//	}
//
//	public void setPositionId(Long positionId) {
//		this.positionId = positionId;
//	}
//
//	public Long getRankId() {
//		return rankId;
//	}
//
//	public void setRankId(Long rankId) {
//		this.rankId = rankId;
//	}
//
//	public Long getJobTypeId() {
//		return jobTypeId;
//	}
//
//	public void setJobTypeId(Long jobTypeId) {
//		this.jobTypeId = jobTypeId;
//	}
//
//	public Long getRescueTeamId() {
//		return rescueTeamId;
//	}
//
//	public void setRescueTeamId(Long rescueTeamId) {
//		this.rescueTeamId = rescueTeamId;
//	}
//
//	public Long getRescueDepartmentId() {
//		return rescueDepartmentId;
//	}
//
//	public void setRescueDepartmentId(Long rescueDepartmentId) {
//		this.rescueDepartmentId = rescueDepartmentId;
//	}
//
//	public Long getProvinceId() {
//		return provinceId;
//	}
//
//	public void setProvinceId(Long provinceId) {
//		this.provinceId = provinceId;
//	}
//
//	public Long getDistrictId() {
//		return districtId;
//	}
//
//	public void setDistrictId(Long districtId) {
//		this.districtId = districtId;
//	}
//
//	public String getProvinceName() {
//		return provinceName;
//	}
//
//	public void setProvinceName(String provinceName) {
//		this.provinceName = provinceName;
//	}
//
//	public String getDistrictName() {
//		return districtName;
//	}
//
//	public void setDistrictName(String districtName) {
//		this.districtName = districtName;
//	}
//
//	public Long getCommuneId() {
//		return communeId;
//	}
//
//	public void setCommuneId(Long communeId) {
//		this.communeId = communeId;
//	}
}
