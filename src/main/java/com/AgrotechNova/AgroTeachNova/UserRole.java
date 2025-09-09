package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class UserRole {

	private int iduserRol;
	private String description;
	public int getIduserRol() {
		return iduserRol;
	}
	public void setIduserRol(int iduserRol) {
		this.iduserRol = iduserRol;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
