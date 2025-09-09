package com.AgrotechNova.AgroTeachNova;

public class UserStatus {

	private int iduserStatus;
	private String description;
	public int getIduserStatus() {
		return iduserStatus;
	}
	
	
	
	public UserStatus(int iduserStatus, String description) {
		super();
		this.iduserStatus = iduserStatus;
		this.description = description;
	}


	public void setIduserStatus(int iduserStatus) {
		this.iduserStatus = iduserStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
