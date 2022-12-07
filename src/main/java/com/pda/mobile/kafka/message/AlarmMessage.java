package com.pda.mobile.kafka.message;

public class AlarmMessage extends BaseMessage
{
	private static final long serialVersionUID = 1L;
	private String imeiCenterDevice;
	private String imeiSensor;
	private String nameCenterDevice;
	private String nameSenser;
	private String nameProvider;
	private String alarmType;
	public String getImeiCenterDevice() {
		return imeiCenterDevice;
	}
	public void setImeiCenterDevice(String imeiCenterDevice) {
		this.imeiCenterDevice = imeiCenterDevice;
	}
	public String getImeiSensor() {
		return imeiSensor;
	}
	public void setImeiSensor(String imeiSensor) {
		this.imeiSensor = imeiSensor;
	}
	public String getNameCenterDevice() {
		return nameCenterDevice;
	}
	public void setNameCenterDevice(String nameCenterDevice) {
		this.nameCenterDevice = nameCenterDevice;
	}
	public String getNameSenser() {
		return nameSenser;
	}
	public void setNameSenser(String nameSenser) {
		this.nameSenser = nameSenser;
	}
	public String getNameProvider() {
		return nameProvider;
	}
	public void setNameProvider(String nameProvider) {
		this.nameProvider = nameProvider;
	}
	public String getAlarmType() {
		return alarmType;
	}
	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}
	

}
