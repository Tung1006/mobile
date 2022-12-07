package com.pda.mobile.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.pda.mobile.kafka.message.CommandMessage;
import com.pda.mobile.kafka.message.CommandMessageDeserializer;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
	
	@Bean 
	public ConsumerFactory<Long, CommandMessage> consumerFactory() 
	{
		Map<String, Object> props = new HashMap<>();
		
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, IKafkaConstants.GROUP_ID_FIRE_ALARM_CONFIG);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,LongDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, CommandMessageDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(props);
	}
	@Bean
	public ConcurrentKafkaListenerContainerFactory<Long, CommandMessage> fireAlarmKafkaListenerContainerFactory()
	{
		ConcurrentKafkaListenerContainerFactory <Long, CommandMessage> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}

//	@Bean 
//	public ConsumerFactory<Long, CommandMessage> deviceConsumerFactory() 
//	{
//		Map<String, Object> props = new HashMap<>();
//		
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, IKafkaConstants.GROUP_ID_DEVICE_ALARM_CONFIG);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,LongDeserializer.class.getName());
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, CommandMessageDeserializer.class);
//        return new DefaultKafkaConsumerFactory<>(props);
//	}
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<Long, CommandMessage> deviceAlarmKafkaListenerContainerFactory()
//	{
//		ConcurrentKafkaListenerContainerFactory <Long, CommandMessage> deviceFactory = new ConcurrentKafkaListenerContainerFactory<>();
//		deviceFactory.setConsumerFactory(deviceConsumerFactory());
//		return deviceFactory;
//	}
//	@Bean 
//	public ConsumerFactory<Long, CommandMessage> sensorConsumerFactory() 
//	{
//		Map<String, Object> props = new HashMap<>();
//		
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, IKafkaConstants.KAFKA_BROKERS);
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, IKafkaConstants.GROUP_ID_SENSOR_ALARM_CONFIG);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,LongDeserializer.class.getName());
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, CommandMessageDeserializer.class);
//        return new DefaultKafkaConsumerFactory<>(props);
//	}
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<Long, CommandMessage> sensorAlarmKafkaListenerContainerFactory()
//	{
//		ConcurrentKafkaListenerContainerFactory <Long, CommandMessage> deviceFactory = new ConcurrentKafkaListenerContainerFactory<>();
//		deviceFactory.setConsumerFactory(sensorConsumerFactory());
//		return deviceFactory;
//	}	
}
