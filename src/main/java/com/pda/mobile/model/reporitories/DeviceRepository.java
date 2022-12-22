package com.pda.mobile.model.reporitories;

import com.pda.mobile.model.entities.PcccDevice;
import com.pda.mobile.model.entities.dto.deviceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface DeviceRepository extends JpaRepository<deviceDto, Long> {
	@Query(value = "SELECT *  FROM  PCCC_DEVICE where PCCC_DEVICE.active_ = 1 and PCCC_DEVICE.BUILDERID = :builderId", nativeQuery = true)

	List<deviceDto> getByBuilderId(@Param("builderId") Long builderId);

}