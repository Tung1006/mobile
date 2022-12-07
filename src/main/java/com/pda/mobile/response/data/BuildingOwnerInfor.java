package com.pda.mobile.response.data;

import java.util.ArrayList;

public class BuildingOwnerInfor {
	
	private String userId;
	ArrayList<BuildingInfor> ownerBuildingList = new ArrayList<BuildingInfor>();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ArrayList<BuildingInfor> getOwnerBuildingList() {
		return ownerBuildingList;
	}
	public void setOwnerBuildingList(ArrayList<BuildingInfor> ownerBuildingList) {
		this.ownerBuildingList = ownerBuildingList;
	}
}
