package com.entity;

public class Student_registration {

	private int id;

	private String adharno;

	private String name, father_name, mother_name, branch, Gender, email, password;
	
	private String userType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Student_registration(String adharnumber, String name, String father_name, String mother_name, String branch,
			String gender, String email, String password, String userType) {
		super();
		this.adharno = adharnumber;
		this.name = name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.branch = branch;
		Gender = gender;
		this.email = email;
		this.password = password;
		this.userType=userType;
	}

	public Student_registration() {
		super();
		// TODO Auto-generated constructor stub
	}

}
