package com.pda.mobile.logs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LogTools {

	public LogTools()
	{
		
	}
	
	public static String convertObjectToString(Object object)
	{
		ObjectMapper mapper = new ObjectMapper();
		String jSonData = "";
		try 
		{
			jSonData = mapper.writeValueAsString(object);
		} 
		catch (JsonProcessingException e) 
		{
		   e.printStackTrace();
		}
		return jSonData;
	}
}
