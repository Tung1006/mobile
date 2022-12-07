package com.pda.mobile.kafka.message;

public class AlarmInfor {
	private String imeiDevice;
	private String nameDevice;
	private String imeiSensor;
	private String sensorName;
	private String devicePosition;
	private String sensorPosition;
	private String nameProvider;
	private String alarmType;
	private String channel;
	
	private String longtitule;
	private String lasttitule;
	
	private String description;
	private String idBuilding;
	private String nameBuilding;
	private String idPCCCUnit;
	private String namePCCCUnit;
	private String idCBPCCC;
	private String nameCBPCC;
	private String phoneNumberCBPCCC;
	private String idOwnerBuilding;
	private String nameOwnerBuilding;
	private String phoneNumberOwnerBuilding;
	private String imeiPhoneOwnerBuilding;
	private String addressOfBuilding;
	
	private String provinceId;
	private String districtId;
	//Sending to Client
	private String ipAddress;
	private boolean allowToSend;
	
	private int timeout;
	
	private String typeOfMessage;
	private String connectStatus;
	private int isbatteryIssue;
	private int isSignalIssue;
	private int batteryRemain;
	private int gsmSignalStreng;
	
	private String alarmContent;
	
	private long notifyMessageId;
	
	public String getImeiDevice() {
		return imeiDevice;
	}

	public void setImeiDevice(String imeiDevice) {
		this.imeiDevice = imeiDevice;
	}

	public String getNameDevice() {
		return nameDevice;
	}

	public void setNameDevice(String nameDevice) {
		this.nameDevice = nameDevice;
	}

	public String getImeiSensor() {
		return imeiSensor;
	}

	public void setImeiSensor(String imeiSensor) {
		this.imeiSensor = imeiSensor;
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

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getLongtitule() {
		return longtitule;
	}

	public void setLongtitule(String longtitule) {
		this.longtitule = longtitule;
	}

	public String getLasttitule() {
		return lasttitule;
	}

	public void setLasttitule(String lasttitule) {
		this.lasttitule = lasttitule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIdBuilding() {
		return idBuilding;
	}

	public void setIdBuilding(String idBuilding) {
		this.idBuilding = idBuilding;
	}

	public String getNameBuilding() {
		return nameBuilding;
	}

	public void setNameBuilding(String nameBuilding) {
		this.nameBuilding = nameBuilding;
	}

	public String getIdPCCCUnit() {
		return idPCCCUnit;
	}

	public void setIdPCCCUnit(String idPCCCUnit) {
		this.idPCCCUnit = idPCCCUnit;
	}

	public String getNamePCCCUnit() {
		return namePCCCUnit;
	}

	public void setNamePCCCUnit(String namePCCCUnit) {
		this.namePCCCUnit = namePCCCUnit;
	}

	public String getIdCBPCCC() {
		return idCBPCCC;
	}

	public void setIdCBPCCC(String idCBPCCC) {
		this.idCBPCCC = idCBPCCC;
	}

	public String getNameCBPCC() {
		return nameCBPCC;
	}

	public void setNameCBPCC(String nameCBPCC) {
		this.nameCBPCC = nameCBPCC;
	}

	public String getPhoneNumberCBPCCC() {
		return phoneNumberCBPCCC;
	}

	public void setPhoneNumberCBPCCC(String phoneNumberCBPCCC) {
		this.phoneNumberCBPCCC = phoneNumberCBPCCC;
	}

	public String getIdOwnerBuilding() {
		return idOwnerBuilding;
	}

	public void setIdOwnerBuilding(String idOwnerBuilding) {
		this.idOwnerBuilding = idOwnerBuilding;
	}

	public String getNameOwnerBuilding() {
		return nameOwnerBuilding;
	}

	public void setNameOwnerBuilding(String nameOwnerBuilding) {
		this.nameOwnerBuilding = nameOwnerBuilding;
	}

	public String getPhoneNumberOwnerBuilding() {
		return phoneNumberOwnerBuilding;
	}

	public void setPhoneNumberOwnerBuilding(String phoneNumberOwnerBuilding) {
		this.phoneNumberOwnerBuilding = phoneNumberOwnerBuilding;
	}

	public String getImeiPhoneOwnerBuilding() {
		return imeiPhoneOwnerBuilding;
	}

	public void setImeiPhoneOwnerBuilding(String imeiPhoneOwnerBuilding) {
		this.imeiPhoneOwnerBuilding = imeiPhoneOwnerBuilding;
	}

	public String getAddressOfBuilding() {
		return addressOfBuilding;
	}

	public void setAddressOfBuilding(String addressOfBuilding) {
		this.addressOfBuilding = addressOfBuilding;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public boolean isAllowToSend() {
		return allowToSend;
	}

	public void setAllowToSend(boolean allowToSend) {
		this.allowToSend = allowToSend;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getTypeOfMessage() {
		return typeOfMessage;
	}

	public String getConnectStatus() {
		return connectStatus;
	}

	public int getIsbatteryIssue() {
		return isbatteryIssue;
	}

	public int getIsSignalIssue() {
		return isSignalIssue;
	}

	public void setTypeOfMessage(String typeOfMessage) {
		this.typeOfMessage = typeOfMessage;
	}

	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}

	public void setIsbatteryIssue(int isbatteryIssue) {
		this.isbatteryIssue = isbatteryIssue;
	}

	public void setIsSignalIssue(int isSignalIssue) {
		this.isSignalIssue = isSignalIssue;
	}

	public String getSensorName() {
		return sensorName;
	}

	public String getDevicePosition() {
		return devicePosition;
	}

	public String getSensorPosition() {
		return sensorPosition;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public void setDevicePosition(String devicePosition) {
		this.devicePosition = devicePosition;
	}

	public void setSensorPosition(String sensorPosition) {
		this.sensorPosition = sensorPosition;
	}

	public String getAlarmContent() {
		return alarmContent;
	}

	public void setAlarmContent(String alarmContent) {
		this.alarmContent = alarmContent;
	}

	public int getBatteryRemain() {
		return batteryRemain;
	}

	public int getGsmSignalStreng() {
		return gsmSignalStreng;
	}

	public void setBatteryRemain(int batteryRemain) {
		this.batteryRemain = batteryRemain;
	}

	public void setGsmSignalStreng(int gsmSignalStreng) {
		this.gsmSignalStreng = gsmSignalStreng;
	}

	public long getNotifyMessageId() {
		return notifyMessageId;
	}

	public void setNotifyMessageId(long notifyMessageId) {
		this.notifyMessageId = notifyMessageId;
	}
	
}
