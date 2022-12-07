package com.pda.mobile.kafka.message;


import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 * @author DuyMB
 * 
 */
public class CommandMessage extends BaseMessage
{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	private String messageId;
	private String requestDate;
	private String responseDate;
	
	private String imeiDevice;
	private String nameDevice;
	private String imeiSensor;
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
	
	private String zone;
	private String zoneDetail;
	
	private String typeOfMessage;
	private String messageContent;
	
	private String connectStatus;
	private int isbatteryIssue;
	private int isSignalIssue;
	private int batteryRemain;
	private int gsmSignalStreng;
	private Long expirationNotifyInTime;
	
	private String nameOfSensor;
	//Sending to Client
	private String ipAddress;
	private boolean allowToSend;
	
	private long notifyMessageId;
	
	private int timeout;
	private int deviceTestMode = 0;
	

	public void copyTo(CommandMessage destination)
	{
		if (destination == null)
		{
			return;
		}
		destination.setMessageId(messageId);
		destination.setRequestDate(requestDate);
		destination.setResponseDate(responseDate);
		destination.setImeiDevice(imeiDevice);
		destination.setNameDevice(nameDevice);
		destination.setAlarmType(alarmType);
		destination.setChannel(channel);
		destination.setLongtitule(longtitule);
		destination.setLasttitule(lasttitule);
		destination.setDescription(description);
		destination.setIdBuilding(idBuilding);
		destination.setNameBuilding(nameBuilding);
		destination.setIdPCCCUnit(idPCCCUnit);
		destination.setNamePCCCUnit(namePCCCUnit);
		destination.setIdCBPCCC(idCBPCCC);
		destination.setNameCBPCC(nameCBPCC);
		destination.setPhoneNumberCBPCCC(phoneNumberCBPCCC);
		destination.setIdOwnerBuilding(idOwnerBuilding);
		destination.setNameOwnerBuilding(nameOwnerBuilding);
		destination.setImeiPhoneOwnerBuilding(imeiPhoneOwnerBuilding);
		
		destination.setIpAddress(ipAddress);
		destination.setAllowToSend(allowToSend);
		destination.setAddressOfBuilding(addressOfBuilding);
		destination.setProvinceId(provinceId);
		destination.setDistrictId(districtId);
		destination.setZone(zone);
	}

	public CommandMessage clone()
	{
		CommandMessage result = new CommandMessage();

		copyTo(result);

		return result;
	}

	public String toString()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		StringBuilder result = new StringBuilder();

		result.append("MessageId = ");
		result.append(messageId);

		result.append(" | requestDate = ");
		result.append(requestDate);

		result.append(" | responseDate = ");
		result.append(responseDate);
		result.append(" | imeiDevice = ");
		result.append(imeiDevice);

		result.append(" | nameDevice = ");
		result.append(nameDevice);
		result.append(" | alarmType = ");
		result.append(alarmType);
		result.append(" | channel = ");
		result.append(channel);

		result.append(" | longtitule = ");
		result.append(longtitule);
		result.append(" | lasttitule = ");
		result.append(lasttitule);
		result.append(" | idBuilding = ");
		result.append(idBuilding);

		result.append(" | nameBuilding = ");
		result.append(nameBuilding);
		result.append(" | idPCCCUnit = ");
		result.append(idPCCCUnit);

		result.append(" | namePCCCUnit = ");
		result.append(namePCCCUnit);
		result.append(" | idCBPCCC = ");
		result.append(idCBPCCC);
		result.append(" | nameCBPCC = ");
		result.append(nameCBPCC);
		result.append(" | phoneNumberCBPCCC = ");
		result.append(phoneNumberCBPCCC);
		result.append(" | idOwnerBuilding = ");
		result.append(idOwnerBuilding);

		result.append(" | nameOwnerBuilding = ");
		result.append(nameOwnerBuilding);
		result.append(" | imeiPhoneOwnerBuilding = ");
		result.append(imeiPhoneOwnerBuilding);
		result.append(" | ipAddress = ");
		result.append(ipAddress);
		result.append(" | allowToSend = ");
		result.append(allowToSend);
		result.append(" | description = ");
		result.append(description);
		result.append(" | address = ");
		result.append(addressOfBuilding);
		result.append(" | provinceID = ");
		result.append(provinceId);
		result.append(" | districtID = ");
		result.append(districtId);
		result.append(" | zone = ");
		result.append(zone);
		result.append(" | notifyMessageId = ");
		result.append(notifyMessageId);
		result.append(" | batteryRemain = ");
		result.append(batteryRemain);
		result.append(" | isbatteryIssue = ");
		result.append(isbatteryIssue);
		result.append(" | isSignalIssue = ");
		result.append(isSignalIssue);
		result.append(" | connectStatus = ");
		result.append(connectStatus);
		result.append(" | nameOfSensor = ");
		result.append(nameOfSensor);
		result.append(" | gsmSignalStreng = ");	
		result.append(gsmSignalStreng);
		result.append(" | typeOfMessage = ");
		result.append(typeOfMessage);

		return result.toString();
	}

	public String toLogString()
	{
		StringBuilder result = new StringBuilder();


		return result.toString();

	}

	public String toShortString()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");

		StringBuilder result = new StringBuilder();


		return result.toString();
	}

	public String toOrderString()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		StringBuilder result = new StringBuilder();


		return result.toString();

	}

	public String toFeedBackLog()
	{
		DateFormat df = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss");
		StringBuilder result = new StringBuilder();
		return result.toString();
	}

	public String toSubscriptionLog()
	{
		StringBuilder result = new StringBuilder();
		
		return result.toString();
	}

	public String getChannel()
	{
		return channel;
	}

	public void setChannel(String channel)
	{
		this.channel = channel;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

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

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
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

	public String getImeiSensor() {
		return imeiSensor;
	}

	public void setImeiSensor(String imeiSensor) {
		this.imeiSensor = imeiSensor;
	}

	public String getAddressOfBuilding() {
		return addressOfBuilding;
	}

	public void setAddressOfBuilding(String addressOfBuilding) {
		this.addressOfBuilding = addressOfBuilding;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZoneDetail() {
		return zoneDetail;
	}

	public void setZoneDetail(String zoneDetail) {
		this.zoneDetail = zoneDetail;
	}

	public String getTypeOfMessage() {
		return typeOfMessage;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setTypeOfMessage(String typeOfMessage) {
		this.typeOfMessage = typeOfMessage;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public Long getExpirationNotifyInTime() {
		return expirationNotifyInTime;
	}

	public void setExpirationNotifyInTime(Long expirationNotifyInTime) {
		this.expirationNotifyInTime = expirationNotifyInTime;
	}


	public String getDevicePosition() {
		return devicePosition;
	}

	public String getSensorPosition() {
		return sensorPosition;
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

	public void setDevicePosition(String devicePosition) {
		this.devicePosition = devicePosition;
	}

	public void setSensorPosition(String sensorPosition) {
		this.sensorPosition = sensorPosition;
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

	public String getNameOfSensor() {
		return nameOfSensor;
	}

	public void setNameOfSensor(String nameOfSensor) {
		this.nameOfSensor = nameOfSensor;
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

	public int getDeviceTestMode() {
		return deviceTestMode;
	}

	public void setDeviceTestMode(int deviceTestMode) {
		this.deviceTestMode = deviceTestMode;
	}	
}
