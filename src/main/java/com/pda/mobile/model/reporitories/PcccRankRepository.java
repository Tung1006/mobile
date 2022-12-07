package com.pda.mobile.model.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pda.mobile.model.entities.PcccRank;

@Repository
@EnableJpaRepositories
public interface PcccRankRepository extends JpaRepository<PcccRank, Long> {
	List<PcccRank> findAll();

}