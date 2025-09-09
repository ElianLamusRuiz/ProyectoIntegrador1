package com.AgrotechNova.AgroTeachNova;

public class CompanyType {

	private int idcompanyType;
	private String description;
	
	
	public CompanyType(int idcompanyType, String description) {
		super();
		this.idcompanyType = idcompanyType;
		this.description = description;
	}
	
	public int getIdcompanyType() {
		return idcompanyType;
	}
	public void setIdcompanyType(int idcompanyType) {
		this.idcompanyType = idcompanyType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
