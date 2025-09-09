package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class Company_has_city {

	private Company company;
	private City city;
	
	
	
	public Company_has_city(Company company, City city) {
		super();
		this.company = company;
		this.city = city;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
