package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class City {

	private int idcity;
	private String name;
	private String profilePicture;
	private State state;
	
	
	
	public City(int idcity, String name, String profilePicture, State state) {
		super();
		this.idcity = idcity;
		this.name = name;
		this.profilePicture = profilePicture;
		this.state = state;
	}
	public int getIdcity() {
		return idcity;
	}
	public void setIdcity(int idcity) {
		this.idcity = idcity;
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
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
