package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class SysUser {

	 private int idsysuser;

	    private String userName;
	    private String userLastname;
	    private String email;
	    private String password;
	    private UserStatus userStatus;
	    private Company company;
	    private UserRole role;
	   

		public SysUser(int idsysuser, String userName, String userLastname, String email, String password,
				UserStatus userStatus, Company company, UserRole role) {
			super();
			this.idsysuser = idsysuser;
			this.userName = userName;
			this.userLastname = userLastname;
			this.email = email;
			this.password = password;
			this.userStatus = userStatus;
			this.company = company;
			this.role = role;
		}

		public UserStatus getUserStatus() {
			return userStatus;
		}

		public void setUserStatus(UserStatus userStatus) {
			this.userStatus = userStatus;
		}

		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}

		public int getIdsysuser() {
			return idsysuser;
		}

		public void setIdsysuser(int idsysuser) {
			this.idsysuser = idsysuser;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserLastname() {
			return userLastname;
		}

		public void setUserLastname(String userLastname) {
			this.userLastname = userLastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public UserRole getRole() {
			return role;
		}

		public void setRole(UserRole role) {
			this.role = role;
		}


	    
	    
}
