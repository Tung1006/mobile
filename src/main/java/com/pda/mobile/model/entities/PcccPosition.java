package com.pda.mobile.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PCCC_POSITION")
public class PcccPosition {

	@Id
	@Column(name = "POSITIONID")
	private Long positionId;

	@Column(name = "name")
	private String name;

	public PcccPosition() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPositionId() {
		return positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

}
