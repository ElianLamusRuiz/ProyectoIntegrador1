package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class SysUser {

	 private int idsysuser;

	    private String userName;
	    private String userLastname;
	    private String email;
	    private String password;

	    private UserRole role;
	    


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
