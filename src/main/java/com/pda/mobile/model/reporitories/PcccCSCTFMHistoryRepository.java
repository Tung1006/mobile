package com.pda.mobile.model.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccCSCTFMHistory;

@Repository
@EnableJpaRepositories
public interface PcccCSCTFMHistoryRepository extends JpaRepository<PcccCSCTFMHistory,Long> {

}
