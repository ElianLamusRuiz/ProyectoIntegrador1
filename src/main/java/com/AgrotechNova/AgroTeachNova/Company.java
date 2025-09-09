package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class Company {

	private int idcompany;
	private String companyName;
	private CompanyType companyType;
	private String description;
	private String mision;
	private String vision;
	
	
	public Company(int idcompany, String companyName, CompanyType companyType, String description, String mision,
			String vision) {
		super();
		this.idcompany = idcompany;
		this.companyName = companyName;
		this.companyType = companyType;
		this.description = description;
		this.mision = mision;
		this.vision = vision;
	}


	public int getIdcompany() {
		return idcompany;
	}


	public void setIdcompany(int idcompany) {
		this.idcompany = idcompany;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public CompanyType getCompanyType() {
		return companyType;
	}


	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getMision() {
		return mision;
	}


	public void setMision(String mision) {
		this.mision = mision;
	}


	public String getVision() {
		return vision;
	}


	public void setVision(String vision) {
		this.vision = vision;
	}
	
	
	
}
