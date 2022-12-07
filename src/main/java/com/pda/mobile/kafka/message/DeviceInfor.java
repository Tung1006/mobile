package com.pda.mobile.kafka.message;

public class DeviceInfor {
	
	private String imeiDevice;
	private String nameOfDevice;
	private String typeOfIssue; // 1: disconnect, 2: low barttery, 3:// Low signal (gsm).
	private String builderId;
	private String Issue;
	private String position;
	private String longtitule;
	private String lasttitule;
	private long provinceId;
	private long districtId;
	private String idOwnerBuilding;
	private String builderAddress;
	private String providerName;
	public String getImeiDevice() {
		return imeiDevice;
	}
	public String getNameOfDevice() {
		return nameOfDevice;
	}
	public String getTypeOfIssue() {
		return typeOfIssue;
	}
	public String getBuilderId() {
		return builderId;
	}
	public String getIssue() {
		return Issue;
	}
	public String getPosition() {
		return position;
	}
	public String getLongtitule() {
		return longtitule;
	}
	public String getLasttitule() {
		return lasttitule;
	}
	public long getProvinceId() {
		return provinceId;
	}
	public long getDistrictId() {
		return districtId;
	}
	public String getIdOwnerBuilding() {
		return idOwnerBuilding;
	}
	public String getBuilderAddress() {
		return builderAddress;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setImeiDevice(String imeiDevice) {
		this.imeiDevice = imeiDevice;
	}
	public void setNameOfDevice(String nameOfDevice) {
		this.nameOfDevice = nameOfDevice;
	}
	public void setTypeOfIssue(String typeOfIssue) {
		this.typeOfIssue = typeOfIssue;
	}
	public void setBuilderId(String builderId) {
		this.builderId = builderId;
	}
	public void setIssue(String issue) {
		Issue = issue;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setLongtitule(String longtitule) {
		this.longtitule = longtitule;
	}
	public void setLasttitule(String lasttitule) {
		this.lasttitule = lasttitule;
	}
	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}
	public void setDistrictId(long districtId) {
		this.districtId = districtId;
	}
	public void setIdOwnerBuilding(String idOwnerBuilding) {
		this.idOwnerBuilding = idOwnerBuilding;
	}
	public void setBuilderAddress(String builderAddress) {
		this.builderAddress = builderAddress;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	
}
