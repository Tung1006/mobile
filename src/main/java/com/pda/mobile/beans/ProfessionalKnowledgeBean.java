package com.pda.mobile.beans;

public class ProfessionalKnowledgeBean {

	private Integer pcccPlan = 0;
	private Integer checkBuilding = 0;
	private Integer pcccApprove;
	private Integer pcccTranining = 0;

	public ProfessionalKnowledgeBean() {
		// TODO Auto-generated constructor stub
	}

	public ProfessionalKnowledgeBean(Integer checkBuilding, Integer pcccApprove, Integer pcccTranining) {
		super();

		this.checkBuilding = checkBuilding;
		this.pcccApprove = pcccApprove;
		this.pcccTranining = pcccTranining;
	}

	public Integer getPcccPlan() {
		return pcccPlan;
	}

	public void setPcccPlan(Integer pcccPlan) {
		this.pcccPlan = pcccPlan;
	}

	public Integer getCheckBuilding() {
		return checkBuilding;
	}

	public void setCheckBuilding(Integer checkBuilding) {
		this.checkBuilding = checkBuilding;
	}

	public Integer getPcccApprove() {
		return pcccApprove;
	}

	public void setPcccApprove(Integer pcccApprove) {
		this.pcccApprove = pcccApprove;
	}

	public Integer getPcccTranining() {
		return pcccTranining;
	}

	public void setPcccTranining(Integer pcccTranining) {
		this.pcccTranining = pcccTranining;
	}

}
