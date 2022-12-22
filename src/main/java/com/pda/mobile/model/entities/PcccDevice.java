package com.pda.mobile.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PCCC_DEVICE")
public class PcccDevice {

	@Id
	@Column(name = "DEVICEID")
	private Long deviceId;

	@Column(name = "USERID")
	private Long userId;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "CREATEDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date createDate;

	@Column(name = "MODIFIEDDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date modifiedDate;

	@Column(name = "ACTIVE_")
	private Boolean active_;

	@Column(name = "STATE_")
	private String state_;

	@Column(name = "ACTIVITYSTATE")
	private String activityState;

	@Column(name = "USERCREATEID")
	private Long userCreateId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CODE_")
	private String code_;

	@Column(name = "IMEI")
	private String imei;

	@Column(name = "LAT_")
	private String lat_;

	@Column(name = "LONG_")
	private String long_;

	@Column(name = "SEARCH")
	private String search;

	@Column(name = "PROPERTIES")
	private String properties;

	@Column(name = "NOTE")
	private String note;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "STARTUPDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date startupDate;

	@Column(name = "EXPIREDATE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date expireDate;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "ISONLINE")
	private Integer isonline;

	@Column(name = "BATTERY")
	private String battery;

	@Column(name = "LASTONLINE")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date lastOnline;

	@Column(name = "PACK")
	private Long pack;

	@Column(name = "SIGNALSTRENGTH")
	private Integer signalStrength;

	@Column(name = "POSITION")
	private String postion;

	@Column(name = "ISVERIFICATION")
	private Boolean isVerification;

	@Column(name = "ISFILTER")
	private Boolean isFilter;

	@Column(name = "TESTMODE")
	private Boolean testMode;

	@Column(name = "SHOPID")
	private Long shopId;

	@Column(name = "DEVDEPARTMENT")
	private String devDepartment;

	@Column(name = "PHONENUMBER")
	private String phoneNumber;

	@Column(name = "SERIAL")
	private String serial;

	@Column(name = "DEVICETYPEID")
	private Integer deviceTypeId;

	@Column(name = "BUILDERID")
	private Long builderId;

	@Column(name = "PROVINCEID")
	private Long provinceId;

	@Column(name = "DISTRICTID")
	private Long districtId;

	@Column(name = " Provincename")
	private String provinceName;

	@Column(name = " DISTRICTNAME ")
	private String districtName;

	@Column(name = "SHOPNAME")
	private String shopName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pcccdevice")
	@Column(insertable = false, updatable = false)
	private List<PcccSensor> pcccSensor;


	@Column(name="DEVICETYPENAME")
	private String nameOfDeviceType;

	public PcccDevice() {
		// TODO Auto-generated constructor stub
	}



	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}


	public List<PcccSensor> getPcccSensor() {
		return pcccSensor;
	}

	public void setPcccSensor(List<PcccSensor> pcccSensor) {
		this.pcccSensor = pcccSensor;
	}

	public String getNameOfDeviceType() {
		return nameOfDeviceType;
	}

	public void setNameOfDeviceType(String nameOfDeviceType) {
		this.nameOfDeviceType = nameOfDeviceType;
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

	public Date getStartupDate() {
		return startupDate;
	}

	public void setStartupDate(Date startupDate) {
		this.startupDate = startupDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Integer getIsonline() {
		return isonline;
	}

	public void setIsonline(Integer isonline) {
		this.isonline = isonline;
	}

	public Date getLastOnline() {
		return lastOnline;
	}

	public void setLastOnline(Date lastOnline) {
		this.lastOnline = lastOnline;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public Boolean getActive_() {
		return active_;
	}



	public void setActive_(Boolean active_) {
		this.active_ = active_;
	}



	public String getState_() {
		return state_;
	}



	public void setState_(String state_) {
		this.state_ = state_;
	}



	public String getActivityState() {
		return activityState;
	}



	public void setActivityState(String activityState) {
		this.activityState = activityState;
	}



	public Long getUserCreateId() {
		return userCreateId;
	}



	public void setUserCreateId(Long userCreateId) {
		this.userCreateId = userCreateId;
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



	public void setCode_(String code_) {
		this.code_ = code_;
	}



	public String getImei() {
		return imei;
	}



	public void setImei(String imei) {
		this.imei = imei;
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



	public String getSearch() {
		return search;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	public String getProperties() {
		return properties;
	}



	public void setProperties(String properties) {
		this.properties = properties;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}




	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}







	public String getBattery() {
		return battery;
	}



	public void setBattery(String battery) {
		this.battery = battery;
	}





	public Long getPack() {
		return pack;
	}



	public void setPack(Long pack) {
		this.pack = pack;
	}



	public Integer getSignalStrength() {
		return signalStrength;
	}



	public void setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}





	public Boolean getIsVerification() {
		return isVerification;
	}



	public void setIsVerification(Boolean isVerification) {
		this.isVerification = isVerification;
	}



	public Boolean getIsFilter() {
		return isFilter;
	}



	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}



	public Boolean getTestMode() {
		return testMode;
	}



	public void setTestMode(Boolean testMode) {
		this.testMode = testMode;
	}



	public Long getShopId() {
		return shopId;
	}



	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}



	public String getDevDepartment() {
		return devDepartment;
	}



	public void setDevDepartment(String devDepartment) {
		this.devDepartment = devDepartment;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getSerial() {
		return serial;
	}



	public void setSerial(String serial) {
		this.serial = serial;
	}



	public Integer getDeviceTypeId() {
		return deviceTypeId;
	}



	public void setDeviceTypeId(Integer deviceTypeId) {
		this.deviceTypeId = deviceTypeId;
	}



	public Long getBuilderId() {
		return builderId;
	}



	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}



	public Long getProvinceId() {
		return provinceId;
	}



	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}



	public Long getDistrictId() {
		return districtId;
	}



	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}



	public String getProvinceName() {
		return provinceName;
	}



	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}



	public String getDistrictName() {
		return districtName;
	}



	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}



	public String getShopName() {
		return shopName;
	}



	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
