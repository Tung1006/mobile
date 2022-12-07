package com.pda.mobile.kafka.config;

public interface IKafkaConstants {
    //public static String KAFKA_BROKERS = "192.168.1.225:9093";
	public static String KAFKA_BROKERS = "10.0.1.32:9093";
  
    public static Integer MESSAGE_COUNT=1000;

    public static String CLIENT_ID="pccc_client1";

    public static String TOPIC_NAME="demo";

    public static String GROUP_ID_FIRE_ALARM_CONFIG="consumerGroup1";
    public static String GROUP_ID_DEVICE_ALARM_CONFIG="deviceGroup";
    public static String GROUP_ID_SENSOR_ALARM_CONFIG="sensorGroup";

   
    public static Integer MAX_NO_MESSAGE_FOUND_COUNT=5;

    public static String OFFSET_RESET_LATEST="latest";

    public static String OFFSET_RESET_EARLIER="earliest";

    public static Integer MAX_POLL_RECORDS=1000;
}
