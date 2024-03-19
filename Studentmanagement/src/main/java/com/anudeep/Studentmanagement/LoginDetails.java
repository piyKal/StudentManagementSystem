package com.anudeep.Studentmanagement;

public class LoginDetails {
	
	private String name="Rajiv";
	private String pass="123";
	
	public String getName() {
		return name;
	}
	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginDetails(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}	

}
