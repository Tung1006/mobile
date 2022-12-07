package com.pda.mobile.model.services;



import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pda.mobile.kafka.config.IKafkaConstants;
import com.pda.mobile.kafka.message.AlarmInfor;
import com.pda.mobile.kafka.message.CommandMessage;
import com.pda.mobile.kafka.message.FBMessage;
import com.pda.mobile.logs.LogTools;


@Service
public class PcccEventPublisherService {
	private static final Logger log = Logger.getLogger(PcccEventPublisherService.class.getName());
    private final ApplicationEventPublisher eventPublisher;
//    private final Properties props = new Properties();
//    private static Consumer<Long, CommandMessage> consumer = null;
    
    public PcccEventPublisherService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;

//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, IKafkaConstants.GROUP_ID_CONFIG);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class.getName());
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, CommandMessageDeserializer.class.getName());
//        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, IKafkaConstants.MAX_POLL_RECORDS);
//        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
//        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, IKafkaConstants.OFFSET_RESET_EARLIER);	
//		consumer = new KafkaConsumer<>(props);
//        consumer.subscribe(Collections.singletonList("testfirealarm"));        
    }
    @KafkaListener(topics={"testfirealarm","testdevicealarm","testsensoralarm"}, groupId = IKafkaConstants.GROUP_ID_FIRE_ALARM_CONFIG, containerFactory = "fireAlarmKafkaListenerContainerFactory")
    public void listenerAlarm(CommandMessage alarmMessage)
    {
		AlarmInfor alarm = new AlarmInfor();
		log.info("Receive Data: " + LogTools.convertObjectToString(alarmMessage));
		alarm.setImeiDevice(alarmMessage.getImeiDevice());
		alarm.setNameDevice(alarmMessage.getNameDevice());
		alarm.setImeiSensor(alarmMessage.getImeiSensor());
		alarm.setNameProvider(alarmMessage.getNameProvider());
		alarm.setAlarmType(alarmMessage.getAlarmType());
		alarm.setChannel(alarmMessage.getChannel());
		alarm.setLongtitule(alarmMessage.getLongtitule());
		alarm.setLasttitule(alarmMessage.getLasttitule());
		alarm.setDescription(alarmMessage.getDescription());
		alarm.setIdBuilding(alarmMessage.getIdBuilding());
		alarm.setNameBuilding(alarmMessage.getNameBuilding());
		alarm.setIdPCCCUnit(alarmMessage.getIdPCCCUnit());
		alarm.setNamePCCCUnit(alarmMessage.getNamePCCCUnit());
		alarm.setIdCBPCCC(alarmMessage.getIdCBPCCC());
		alarm.setNameCBPCC(alarmMessage.getNameCBPCC());
		alarm.setPhoneNumberCBPCCC(alarmMessage.getPhoneNumberCBPCCC());
		alarm.setIdOwnerBuilding(alarmMessage.getIdOwnerBuilding());
		alarm.setNameOwnerBuilding(alarmMessage.getNameOwnerBuilding());
		alarm.setPhoneNumberOwnerBuilding(alarmMessage.getPhoneNumberOwnerBuilding());
		alarm.setImeiPhoneOwnerBuilding(alarmMessage.getImeiPhoneOwnerBuilding());
		alarm.setAddressOfBuilding(alarmMessage.getAddressOfBuilding());
		alarm.setProvinceId(alarmMessage.getProvinceId());
		alarm.setDistrictId(alarmMessage.getDistrictId());
		alarm.setTypeOfMessage(alarmMessage.getTypeOfMessage());
		alarm.setConnectStatus(alarmMessage.getConnectStatus());
		alarm.setIsbatteryIssue(alarmMessage.getIsbatteryIssue());
		alarm.setIsSignalIssue(alarmMessage.getIsSignalIssue());
		alarm.setAllowToSend(true);
		alarm.setDevicePosition(alarmMessage.getDevicePosition());
		alarm.setSensorPosition(alarmMessage.getSensorPosition());
		alarm.setSensorName(alarmMessage.getNameOfSensor());
		alarm.setAlarmContent(alarmMessage.getMessageContent());
		alarm.setBatteryRemain(alarmMessage.getBatteryRemain());
		alarm.setGsmSignalStreng(alarmMessage.getGsmSignalStreng());
		alarm.setNotifyMessageId(alarmMessage.getNotifyMessageId());
		//this.eventPublisher.publishEvent(alarm);
		ObjectMapper oMapper = new ObjectMapper();
		
		FBMessage fbMessage = new FBMessage();
		Map<String,String> temp = oMapper.convertValue(alarmMessage, Map.class);
		for (String key : temp.keySet()) 
		{
			if (temp.get(key) == null) temp.put(key, "");
			if (!(temp.get(key) instanceof String))
			{
				temp.put(key, String.valueOf(temp.get(key)));
			}
		}
		fbMessage.setData(temp);
		fbMessage.setTitle(alarm.getAlarmContent());
		fbMessage.setUserId(alarmMessage.getIdOwnerBuilding());
		this.eventPublisher.publishEvent(fbMessage);
    }

//	@Scheduled(fixedRateString = "3000")
//	public void keepAlive() {
//
//		MemoryInfo memInfor = new MemoryInfo("Alive", "Keep alive", "cfe4dbfb-c5d6-49c5-a499-b9350770c603");
//		System.out.println("Send:" + LogTools.convertObjectToString(memInfor));
//		this.eventPublisher.publishEvent(memInfor);
//	}
}
