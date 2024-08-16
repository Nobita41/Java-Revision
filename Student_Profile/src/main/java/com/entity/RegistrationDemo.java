package com.entity;

public class RegistrationDemo {

	int id;
	String name;
	String father_name;
	String mother_name;
	String Brother_name;
	String sister_name;
	String branch;
	String adharcard;
	String States;
	String pincode;
	String email;
	String password;
	public RegistrationDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistrationDemo(String name, String father_name, String mother_name, String brother_name,
			String sister_name, String branch, String adharcard, String states, String pincode, String email,
			String password) {
		super();
		this.name = name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		Brother_name = brother_name;
		this.sister_name = sister_name;
		this.branch = branch;
		this.adharcard = adharcard;
		States = states;
		this.pincode = pincode;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getBrother_name() {
		return Brother_name;
	}
	public void setBrother_name(String brother_name) {
		Brother_name = brother_name;
	}
	public String getSister_name() {
		return sister_name;
	}
	public void setSister_name(String sister_name) {
		this.sister_name = sister_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(String adharcard) {
		this.adharcard = adharcard;
	}
	public String getStates() {
		return States;
	}
	public void setStates(String states) {
		States = states;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	
}
