package com.pda.mobile.model.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Table(name = "pccc_builder")
public class PcccBuilder {

	@Id
	@GeneratedValue(generator = "BUILDER_SEQ")
	@GenericGenerator(name = "BUILDER_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "builderid")
	private Long builderId;

	@Column(name = "name")
	private String name;

	@Column(name = "ACTIVE_")
	private Boolean active ;

	@Column(name = "address")
	private String address;

	@Column(name = "lat_")
	private String lat_;
	@Column(name = "long_")
	private String long_;

	@Column(name = "INVESTMENTTYPEID")
	private Long investmentTypeId;

	@Column(name = "INVESTMENTTYPENAME")
	private String investmentTypeName;

	@Column(name = " USERID")
	private Long userId ;
	@Column(name = " USERNAME")
	private String userName;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = " CREATEDATE")
	private Date createDate;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = " MODIFIEDDATE")
	private Date modifiedDate;
	@Column(name = " CODE_")
	private String code_;
	@Column(name = " PROPERTIES")
	private String properties;
	@Column(name = " DESCRIPTION")
	private String description;
	@Column(name = " PHONE")
	private String phone;
	@Column(name = "OTHERPHONE")
	private String otherPhone;
	@Column(name = " DIRECTION")
	private String direction;
	@Column(name = " ISDISPLAYONMAP")
	private Boolean isDisplayOnMap = false;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = " REGISTERDATE")
	private Date registerDate;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	@Column(name = " EXPIREDATE")
	private Date expireDate;
//	@Column(name = " STARTUPYEAR")
//	private String startUpYear;
	@Column(name = " DIGITALIZE")
	private Boolean digitalize = false;
//	@Column(name = "fireSafetyId")
//	private Long fireSafetyId ;
//	@Column(name = " fireSafetyName ")
//	private String fireSafetyName ;

	@Column(name = " search ")
	private String search;
//	@Column(name = " ownerTypeId ")
//	private Long ownerTypeId ;
//	@Column(name = " builderOwnerId ")
//	private String builderOwnerId;
//	@Column(name = " ownerTypeName ")
//	private String ownerTypeName ;
//	@Column(name = " builderOwnerName ")
//	private String builderOwnerName;
//	@Column(name = " fireInsuranceRequired ")
//	private Boolean fireInsuranceRequired = false;
//	@Column(name = " fireInsuranceBought ")
//	private Boolean fireInsuranceBought = false;

	@Column(name = " web ")
	private String web;

	@Column(name = " email ")
	private String email;
	@Column(name = " avatar ")
	private String avatar;
//	@Column(name = " checkNumberPerYear ")
//	private Long checkNumberPerYear ;
//	@Column(name = " adminiLevelId ")
//	private Long adminiLevelId ;
//	@Column(name = " countryInvestmentId ")
//	private Long countryInvestmentId ;
//	@Column(name = " builderTypeId ")
//	private Long builderTypeId ;
//	@Column(name = " adminiLevelName ")
//	private String adminiLevelName ;
//	@Column(name = " countryInvestmentName ")
//	private String countryInvestmentName ;
//	@Column(name = " builderTypeName ")
//	private String builderTypeName ;
//	@Column(name = " economicSectors ")
//	private String economicSectors;
//	@Column(name = " branchField ")
//	private String branchField;
//	@Column(name = " activityTypeId ")
//	private Long activityTypeId ;
////	@Column(name = " residentId ")
////	private Long residentId ;
//	@Column(name = " cadresId ")
//	private Long cadresId ;
//	@Column(name = " branchFieName ")
//	private String branchFieName;
//	@Column(name = " activityTypeName ")
//	private String activityTypeName ;
//	@Column(name = "residentName")
//	private String residentName ;
//	@Column(name = " cadresName ")
//	private String cadresName ;
//	@Column(name = " rescueDepartmentId ")
//	private Long rescueDepartmentId ;
//	@Column(name = " provinceId ")
//	private Long provinceId ;
//	@Column(name = " districtId ")
//	private Long districtId ;
//	@Column(name = " communeId ")
//	private Long communeId ;
//	@Column(name = " rescueDepartmentName ")
//	private String rescueDepartmentName ;
//	@Column(name = " provinceName ")
//	private String provinceName ;
//	@Column(name = "DISTRICTNAME")
//	private String districtName ;
//	@Column(name = "COMMUNENAME")
//	private String communeName ;



	public PcccBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Long getInvestmentTypeId() {
		return investmentTypeId;
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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCode_() {
		return code_;
	}

	public void setCode_(String code_) {
		this.code_ = code_;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Boolean getDisplayOnMap() {
		return isDisplayOnMap;
	}

	public void setDisplayOnMap(Boolean displayOnMap) {
		isDisplayOnMap = displayOnMap;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

//	public String getStartUpYear() {
//		return startUpYear;
//	}
//
//	public void setStartUpYear(String startUpYear) {
//		this.startUpYear = startUpYear;
//	}

	public Boolean getDigitalize() {
		return digitalize;
	}

	public void setDigitalize(Boolean digitalize) {
		this.digitalize = digitalize;
	}

//	public Long getFireSafetyId() {
//		return fireSafetyId;
//	}
//
//	public void setFireSafetyId(Long fireSafetyId) {
//		this.fireSafetyId = fireSafetyId;
//	}
//
//	public String getFireSafetyName() {
//		return fireSafetyName;
//	}
//
//	public void setFireSafetyName(String fireSafetyName) {
//		this.fireSafetyName = fireSafetyName;
//	}


	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

//	public Long getOwnerTypeId() {
//		return ownerTypeId;
//	}
//
//	public void setOwnerTypeId(Long ownerTypeId) {
//		this.ownerTypeId = ownerTypeId;
//	}
//
//	public String getBuilderOwnerId() {
//		return builderOwnerId;
//	}
//
//	public void setBuilderOwnerId(String builderOwnerId) {
//		this.builderOwnerId = builderOwnerId;
//	}
//
//	public String getOwnerTypeName() {
//		return ownerTypeName;
//	}
//
//	public void setOwnerTypeName(String ownerTypeName) {
//		this.ownerTypeName = ownerTypeName;
//	}
//
//	public String getBuilderOwnerName() {
//		return builderOwnerName;
//	}
//
//	public void setBuilderOwnerName(String builderOwnerName) {
//		this.builderOwnerName = builderOwnerName;
//	}

//	public Boolean getFireInsuranceRequired() {
//		return fireInsuranceRequired;
//	}
//
//	public void setFireInsuranceRequired(Boolean fireInsuranceRequired) {
//		this.fireInsuranceRequired = fireInsuranceRequired;
//	}
//
//	public Boolean getFireInsuranceBought() {
//		return fireInsuranceBought;
//	}
//
//	public void setFireInsuranceBought(Boolean fireInsuranceBought) {
//		this.fireInsuranceBought = fireInsuranceBought;
//	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

//	public Long getCheckNumberPerYear() {
//		return checkNumberPerYear;
//	}
//
//	public void setCheckNumberPerYear(Long checkNumberPerYear) {
//		this.checkNumberPerYear = checkNumberPerYear;
//	}

//	public Long getAdminiLevelId() {
//		return adminiLevelId;
//	}
//
//	public void setAdminiLevelId(Long adminiLevelId) {
//		this.adminiLevelId = adminiLevelId;
//	}
//
//	public Long getCountryInvestmentId() {
//		return countryInvestmentId;
//	}
//
//	public void setCountryInvestmentId(Long countryInvestmentId) {
//		this.countryInvestmentId = countryInvestmentId;
//	}
//
//	public Long getBuilderTypeId() {
//		return builderTypeId;
//	}
//
//	public void setBuilderTypeId(Long builderTypeId) {
//		this.builderTypeId = builderTypeId;
//	}
//
//	public String getAdminiLevelName() {
//		return adminiLevelName;
//	}
//
//	public void setAdminiLevelName(String adminiLevelName) {
//		this.adminiLevelName = adminiLevelName;
//	}
//
//	public String getCountryInvestmentName() {
//		return countryInvestmentName;
//	}
//
//	public void setCountryInvestmentName(String countryInvestmentName) {
//		this.countryInvestmentName = countryInvestmentName;
//	}
//
//	public String getBuilderTypeName() {
//		return builderTypeName;
//	}
//
//	public void setBuilderTypeName(String builderTypeName) {
//		this.builderTypeName = builderTypeName;
//	}

//	public String getEconomicSectors() {
//		return economicSectors;
//	}
//
//	public void setEconomicSectors(String economicSectors) {
//		this.economicSectors = economicSectors;
//	}

//	public String getBranchField() {
//		return branchField;
//	}
//
//	public void setBranchField(String branchField) {
//		this.branchField = branchField;
//	}
//
//	public Long getActivityTypeId() {
//		return activityTypeId;
//	}
//
//	public void setActivityTypeId(Long activityTypeId) {
//		this.activityTypeId = activityTypeId;
//	}

//	public Long getResidentId() {
//		return residentId;
//	}
//
//	public void setResidentId(Long residentId) {
//		this.residentId = residentId;
//	}

//	public Long getCadresId() {
//		return cadresId;
//	}
//
//	public void setCadresId(Long cadresId) {
//		this.cadresId = cadresId;
//	}
//
//	public String getBranchFieName() {
//		return branchFieName;
//	}
//
//	public void setBranchFieName(String branchFieName) {
//		this.branchFieName = branchFieName;
//	}
//
//	public String getActivityTypeName() {
//		return activityTypeName;
//	}
//
//	public void setActivityTypeName(String activityTypeName) {
//		this.activityTypeName = activityTypeName;
//	}

//	public String getResidentName() {
//		return residentName;
//	}
//
//	public void setResidentName(String residentName) {
//		this.residentName = residentName;
//	}

//	public String getCadresName() {
//		return cadresName;
//	}
//
//	public void setCadresName(String cadresName) {
//		this.cadresName = cadresName;
//	}

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
//	public Long getCommuneId() {
//		return communeId;
//	}
//
//	public void setCommuneId(Long communeId) {
//		this.communeId = communeId;
//	}

//	public String getRescueDepartmentName() {
//		return rescueDepartmentName;
//	}
//
//	public void setRescueDepartmentName(String rescueDepartmentName) {
//		this.rescueDepartmentName = rescueDepartmentName;
//	}

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
//	public String getCommuneName() {
//		return communeName;
//	}
//
//	public void setCommuneName(String communeName) {
//		this.communeName = communeName;
//	}

	public void setInvestmentTypeId(Long investmentTypeId) {
		this.investmentTypeId = investmentTypeId;
	}

	public String getInvestmentTypeName() {
		return investmentTypeName;
	}

	public void setInvestmentTypeName(String investmentTypeName) {
		this.investmentTypeName = investmentTypeName;
	}

	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
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

	public String getLat_() {
		return lat_;
	}

	public void setLat_(String lat_) {
		this.lat_ = lat_;
	}

	public String getLong_() {
		return long_;
	}

	public void setLong_(String long_) {
		this.long_ = long_;
	}

}
