package com.pda.mobile.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pccc_sensor")
//@SecondaryTable(name="pccc_appdomain", pkJoinColumns = @PrimaryKeyJoinColumn(name="APPDOMAINID"))
public class PcccSensor {

	@Id
	@GeneratedValue(generator = "SENSOR_SEQ")
	@GenericGenerator(name = "SENSOR_SEQ", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
	@Column(name = "sensorid")
	private Long sensorId;

//	@Column(name="name", table="pccc_appdomain")
//	private String nameTypeOfSensor;

	@Column(name="SENSORTYPENAME")
	private String nameTypeOfSensor;

	@Column(length = 65, name = "CODE_")
	private String code;

	@Column(name="IMEI")
	private String imei;

	@Column(name = "STATUS")
	private Long status;
	@Column(name = "userid")
	private Long userId;

	@Column(name = "username")
	private String userName;

	@Column(name = "createdate")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date createDate;

	@Column(name = "modifieddate")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date modifiedDate;

	@Column(name = "ACTIVE_")
	private Integer active = 1;
	@Column(name = "BATTERY")
	private Double battery;

	@Column(name = "SENSORTYPEID")
	private Integer sensorTypeId;

	@Column(name = "DEVICEID")
	private Long deviceId;

	@Column(name = "BUILDERID")
	private Long builderId;

	@Column(name = "ISCONNECT")
	private Integer isConnect;

	@Column(name = "POSITION")
	private String position;


	@Column(name = "startupdate")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date startupDate;

	@Column(name = "expiredate")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING, timezone = "Asia/Bangkok")
	private Date expireDate;

	@Column(length = 21, name = "lat_")
	private String lat_;

	@Column(length = 21, name = "long_")
	private String long_;

	@Column(name="STATUSNAME")
	private String statusName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEVICEID", insertable = false, updatable = false)
	private PcccDevice pcccdevice;
	
	public PcccSensor() {
		// TODO Auto-generated constructor stub
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}


	public Long getBuilderId() {
		return builderId;
	}

	public void setBuilderId(Long builderId) {
		this.builderId = builderId;
	}

	public Long getSensorId() {
		return sensorId;
	}

	public void setSensorId(Long sensorId) {
		this.sensorId = sensorId;
	}
	public Integer getActive() {
		return active;
	}

	public Integer getSensorTypeId() {
		return sensorTypeId;
	}

//	public PcccDevice getPcccdevice() {
//		return pcccdevice;
//	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public void setSensorTypeId(Integer sensorTypeId) {
		this.sensorTypeId = sensorTypeId;
	}

//	public void setPcccdevice(PcccDevice pcccdevice) {
//		this.pcccdevice = pcccdevice;
//	}


	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Double getBattery() {
		return battery;
	}

	public void setBattery(Double battery) {
		this.battery = battery;
	}

	public Integer getIsConnect() {
		return isConnect;
	}

	public void setIsConnect(Integer isConnect) {
		this.isConnect = isConnect;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getNameTypeOfSensor() {
		return nameTypeOfSensor;
	}

	public void setNameTypeOfSensor(String nameTypeOfSensor) {
		this.nameTypeOfSensor = nameTypeOfSensor;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
}
