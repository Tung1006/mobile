package com.pda.mobile.response.data;

import java.util.ArrayList;
import java.util.List;

import com.pda.mobile.model.entities.PcccSensor;

public class CenterDeviceInfor {
	private long id;
	private String imei;
	private String type;
	private String postion;
	private String connectStatus;
	private int totalOfSensors;
	private int totalOfIssuedSensors;
	private int isFire;
	private String power;
	private int isbatteryIssue;
	private String battery_health;
	private String signal_strength;
	private int isSignalIssue;
	
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getBattery_health() {
		return battery_health;
	}
	public void setBattery_health(String battery_health) {
		this.battery_health = battery_health;
	}
	public String getSignal_strength() {
		return signal_strength;
	}
	public void setSignal_strength(String signal_strength) {
		this.signal_strength = signal_strength;
	}
	List<PcccSensor> sensors = new ArrayList<PcccSensor>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public String getConnectStatus() {
		return connectStatus;
	}
	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}
	public int getTotalOfSensors() {
		return totalOfSensors;
	}
	public void setTotalOfSensors(int totalOfSensors) {
		this.totalOfSensors = totalOfSensors;
	}
	public int getTotalOfIssuedSensors() {
		return totalOfIssuedSensors;
	}
	public void setTotalOfIssuedSensors(int totalOfIssuedSensors) {
		this.totalOfIssuedSensors = totalOfIssuedSensors;
	}
	public List<PcccSensor> getSensors() {
		return sensors;
	}
	public void setSensors(List<PcccSensor> sensors) {
		this.sensors = sensors;
	}
	public int getIsFire() {
		return isFire;
	}
	public void setIsFire(int isFire) {
		this.isFire = isFire;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getIsbatteryIssue() {
		return isbatteryIssue;
	}
	public int getIsSignalIssue() {
		return isSignalIssue;
	}
	public void setIsbatteryIssue(int isbatteryIssue) {
		this.isbatteryIssue = isbatteryIssue;
	}
	public void setIsSignalIssue(int isSignalIssue) {
		this.isSignalIssue = isSignalIssue;
	}
}
