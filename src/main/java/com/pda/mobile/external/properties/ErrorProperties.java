package com.pda.mobile.external.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:ErrorDictionary.properties")
public class ErrorProperties {

	public ErrorProperties()
	{
		super();
	}
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
		
	}
}
