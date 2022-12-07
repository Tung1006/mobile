package com.pda.mobile.kafka.message;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommandMessageSerializer implements Serializer<CommandMessage>
{
	@Override
	public void configure( Map<String,?> configs, boolean iskey)
	{
		
	}
	@Override
	public byte[] serialize(String topic, CommandMessage commandMessage)
	{
        byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try 
        {
        	retVal = objectMapper.writeValueAsBytes(commandMessage);
        	//System.out.println("Data: "+ alarmMessage.toString());
        } 
        catch (Exception exception) {
        	log.error("Error in serializing object"+ commandMessage);
        	//System.out.println("Error in serializing object"+ alarmMessage);
        }
        return retVal;			
	}
	static Logger log = LogManager.getLogger(CommandMessageSerializer.class);
	
}
