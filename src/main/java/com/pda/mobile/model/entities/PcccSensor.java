package com.pda.mobile.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "pccc_sensor")
@SecondaryTable(name="pccc_appdomain", pkJoinColumns = @PrimaryKeyJoinColumn(name="APPDOMAINID"))
public class PcccSensor {

	@Id
	@Column(name = "sensorid")
	private Long sensorId;

	@Column(name = "ACTIVE_")
	private Integer active;
	@Column(name = "BATTERY")
	private Double battery;

	@Column(name = "SENSORTYPEID")
	private Integer sensorTypeId;

	@Column(name = "ISCONNECT")
	private Integer isConnect;

	@Column(name = "POSITION")
	private String position;
	
	@Column(name="IMEI")
	private String imei;

	@Column(name = "DEVICEID")
	private Long deviceId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEVICEID", insertable = false, updatable = false)
	private PcccDevice pcccdevice;
	
	@Column(name="name", table="pccc_appdomain")
	private String nameTypeOfSensor;
	
	public PcccSensor() {
		// TODO Auto-generated constructor stub
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
