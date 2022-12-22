package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccSensor;

@Repository
@EnableJpaRepositories
public interface PcccSensorRepository extends JpaRepository<PcccSensor, Long> {
//	@Query(value = "SELECT * "
//			+ " FROM pccc_sensor, pccc_appdomain "
//			+ " where (pccc_sensor.DEVICEID in (select DEVICEID from pccc_device where pccc_device.BUILDERID = :builderId)) and pccc_appdomain.appdomainid = pccc_sensor.SENSORTYPEID and pccc_sensor.active_ = 1 order by pccc_sensor.createDate desc", nativeQuery = true)
//	List<PcccSensor> getSensorByBuilderId(@Param("builderId") Long builderId);

	@Query(value = "SELECT  v.sensorId as sensorId,  v.userId as userId,  v.userName as userName,  v.createDate as createDate,  v.modifiedDate as modifiedDate, v.active_ as active_,  v.status as status," +
			" (SELECT name FROM pccc_appdomain a WHERE a.appdomainId = v.status and active_ = 1 and rownum = 1) as STATUSNAME " +
			", v.battery as battery,   v.isConnect  as isConnect,  v.code_ as code_, v.imei as imei,  v.lat_ as lat_,  v.long_ as long_,  v.properties as properties,  v.description as description, v.startupDate as startupDate,  v.expireDate as expireDate,  v.position as position,  v.time_ as time, v.statusDes as statusDes,   v.isSold  as isSold,  v.sensorTypeId as sensorTypeId,  v.deviceId as deviceId,  v.builderId as builderId,  v.provinceId as provinceId,  v.districtId as districtId , " +
//			"(SELECT name FROM PCCC_Province p  WHERE p.provinceId = v.provinceId and active_ = 1 and rownum = 1) as provinceName , \" +\n" +
//			"//\t\t\"(SELECT name FROM PCCC_District d WHERE d.districtId = v.districtId and active_ = 1 and rownum = 1) as districtName ,\" +\n" +
			"(SELECT name FROM pccc_appdomain a WHERE a.appdomainId = v.sensorTypeId and active_ = 1 and rownum = 1) as sensorTypeName " +
			" FROM PCCC_Sensor v  WHERE v.active_ = 1 AND (:builderId is null or v.builderId = TO_NUMBER(:builderId) ) order by  v.createDate desc", nativeQuery = true)
	List<PcccSensor> getSensorByBuilderId(@Param("builderId") Long builderId);
	@Query(value ="SELECT * "
			+ " FROM pccc_sensor, pccc_appdomain "
			+ " where pccc_sensor.DEVICEID = :deviceId and pccc_appdomain.appdomainid = pccc_sensor.SENSORTYPEID and pccc_sensor.active_ = 1 order by pccc_sensor.createDate desc" ,nativeQuery = true)


	List<PcccSensor> getSensorByDeviceId(@Param("deviceId") Long deviceId);

}