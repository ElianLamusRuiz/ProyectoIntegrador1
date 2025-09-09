package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class State {

	private int idstate;
	private String name;
	private String profilePicture;
	private Country country;
	
	public State(){}
	
	public State(int idstate, String name, String profilePicture, Country country) {
		super();
		this.idstate = idstate;
		this.name = name;
		this.profilePicture = profilePicture;
		this.country = country;
	}
	
	public int getIdstate() {
		return idstate;
	}
	public void setIdstate(int idstate) {
		this.idstate = idstate;
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
}
