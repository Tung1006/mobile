package com.pda.mobile.response.data;

import java.util.ArrayList;
import java.util.List;

import com.pda.mobile.model.entities.PcccInfringeHandle;

public class BuildingInfor {
	private long siteId;
	private String name;
	private String address;
	private String longitude;
	private String latitude;
	private int numberOfCenterDevices;
	ArrayList<CenterDeviceInfor> centerDevices = new ArrayList<CenterDeviceInfor>();
	private int numberOfInfringes;
	List<PcccInfringeHandle> violations = new ArrayList<PcccInfringeHandle>();
	public long getSiteId() {
		return siteId;
	}
	public void setSiteId(long siteId) {
		this.siteId = siteId;
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
	public int getNumberOfCenterDevices() {
		return numberOfCenterDevices;
	}
	public void setNumberOfCenterDevices(int numberOfCenterDevices) {
		this.numberOfCenterDevices = numberOfCenterDevices;
	}
	public ArrayList<CenterDeviceInfor> getCenterDevices() {
		return centerDevices;
	}
	public void setCenterDevices(ArrayList<CenterDeviceInfor> centerDevices) {
		this.centerDevices = centerDevices;
	}
	public int getNumberOfInfringes() {
		return numberOfInfringes;
	}
	public void setNumberOfInfringes(int numberOfInfringes) {
		this.numberOfInfringes = numberOfInfringes;
	}
	public List<PcccInfringeHandle> getViolations() {
		return violations;
	}
	public void setViolations(List<PcccInfringeHandle> violations) {
		this.violations = violations;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
}
