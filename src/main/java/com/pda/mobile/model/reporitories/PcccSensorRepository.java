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
	@Query(value = "SELECT * "
			+ " FROM pccc_sensor, pccc_appdomain "
			+ " where (pccc_sensor.DEVICEID in (select DEVICEID from pccc_device where pccc_device.BUILDERID = :builderId)) and pccc_appdomain.appdomainid = pccc_sensor.SENSORTYPEID", nativeQuery = true)
	List<PcccSensor> getSensorByBuilderId(@Param("builderId") Long builderId);
	@Query(value ="SELECT * "
			+ " FROM pccc_sensor, pccc_appdomain "
			+ " where pccc_sensor.DEVICEID = :deviceId and pccc_appdomain.appdomainid = pccc_sensor.SENSORTYPEID" ,nativeQuery = true)
	List<PcccSensor> getSensorByDeviceId(@Param("deviceId") Long deviceId);
}