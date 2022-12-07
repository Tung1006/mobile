package com.pda.mobile.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PCCC_RANK")
public class PcccRank {

	@Id
	@Column(name = "RANKID")
	private Long rankId;

	@Column(name = "name")
	private String name;

	public PcccRank() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRankId() {
		return rankId;
	}

	public void setRankId(Long rankId) {
		this.rankId = rankId;
	}

}
