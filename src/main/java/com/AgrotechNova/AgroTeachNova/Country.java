package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class Country {
	
	private int idcountry;
	private String name;
	private String profilePicture;
	
	public Country(){}
	
	public Country(int idcountry, String name, String profilePicture) {
		super();
		this.idcountry = idcountry;
		this.name = name;
		this.profilePicture = profilePicture;
	}
	
	
	public int getIdcountry() {
		return idcountry;
	}
	public void setIdcountry(int idcountry) {
		this.idcountry = idcountry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	
	
}
