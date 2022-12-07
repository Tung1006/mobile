package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccDevice;

@Repository
@EnableJpaRepositories
public interface PcccDeviceRepository extends JpaRepository<PcccDevice, Long> {
//	@Query(value = "SELECT *  FROM  PCCC_DEVICE where PCCC_DEVICE.active_ = 1 and PCCC_DEVICE.BUILDERID = :builderId", nativeQuery = true)

	@Query(value = "SELECT v.deviceId as deviceId,  v.groupId as groupId,  v.userId as userId,  v.userName as userName," +
			"v.createDate as createDate,  v.modifiedDate as modifiedDate,  v.active_  as active_,  v.state_ as state_, " +
			"v.activityState as activityState,  v.userCreateId as userCreateId,  v.name as name,  v.code_ as code_,  v.imei as imei,  v.lat_ as lat_,  v.long_ as long_, " +
			"v.search as search,  v.properties as properties,  v.note as note,  v.description as description,  v.startupDate as startupDate,  v.expireDate as expireDate, " +
			"v.address as address, v.isOnline  as isOnline,  v.battery as battery,  v.lastOnline as lastOnline,  v.pack as pack, " +
			"v.signalStrength as signalStrength,  v.position as position, v.isVerification as isVerification, v.isFilter as isFilter, v.testMode as testMode, " +
			"v.shopId as shopId,  v.devDepartment as devDepartment,  v.phoneNumber as phoneNumber, " +
			"v.serial as serial,  v.deviceTypeId as deviceTypeId,  v.builderId as builderId,  v.provinceId as provinceId,  v.districtId as districtId, " +
			"(SELECT name FROM PCCC_Province WHERE provinceId = v.provinceId and active_ = 1 and rownum = 1) as provinceName , " +
			"(SELECT name FROM PCCC_District WHERE districtId = v.districtId and active_ = 1 and rownum = 1) as districtName , " +
			"(SELECT name FROM PCCC_Builder WHERE builderId = v.builderId and active_ = 1 and rownum = 1) as builderName , " +
			"(SELECT name FROM pccc_appdomain WHERE appdomainId = v.deviceTypeId and active_ = 1 and rownum = 1) as deviceTypeName , " +
			"v.shopName as shopName from PCCC_DEVICE v where active_ = 1 and (:builderId = 0  or v.BUILDERID = :builderId)", nativeQuery = true)

	List<PcccDevice> getByBuilderId(@Param("builderId") Long builderId);

}