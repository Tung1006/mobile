package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccPosition;

@Repository
@EnableJpaRepositories
public interface PcccPositionRepository extends JpaRepository<PcccPosition, Long> {
	List<PcccPosition> findAll();

}