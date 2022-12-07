package com.pda.mobile.kafka.message;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommandMessageDeserializer implements Deserializer<CommandMessage>
{
	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}
	@Override
	public CommandMessage deserialize (String topic, byte[] data)
	{
		ObjectMapper mapper = new ObjectMapper();
		CommandMessage alarmMessage = new CommandMessage();
		
		try
		{
			alarmMessage = mapper.readValue(new String(data, "UTF-8"), CommandMessage.class);
		}
		catch( Exception ex)
		{
			ex.printStackTrace();
			log.error("Error when deserializer " + AlarmMessage.class.getName());
			//System.out.println("Error when deserializer " + CommandMessage.class.getName());
		}		
		return alarmMessage;		
	}
	static Logger log = LogManager.getLogger(CommandMessageDeserializer.class);
	
}
