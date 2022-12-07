package com.pda.mobile.kafka.message;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AlarmMessageDeserializer implements Deserializer<AlarmMessage>
{
	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}
	@Override 
	public AlarmMessage deserialize (String topic, byte[] data)
	{
		ObjectMapper mapper = new ObjectMapper();
		AlarmMessage alarmMessage = new AlarmMessage();
		
		try
		{
			alarmMessage = mapper.readValue(new String(data, "UTF-8"), AlarmMessage.class);
		}
		catch( Exception ex)
		{
			ex.printStackTrace();
			log.error("Error when deserializer " + AlarmMessage.class.getName());
			//System.out.println("Error when deserializer " + CommandMessage.class.getName());
		}		
		return alarmMessage;
	}
	static Logger log = LogManager.getLogger(AlarmMessageDeserializer.class);
}
