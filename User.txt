package com.api.restapi.entity;

public class User {
	
	private Long ID;
	private String first_name;
	private String last_name;
	private String city;
	private double cgpa;
	private String gender;
	private String dept;
	

	public User(Long iD, String first_name, String last_name, String city, double d, String gender, String dept) {
		super();
		ID = iD;
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.cgpa = d;
		this.gender = gender;
		this.dept = dept;
	}


	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", first_name=" + first_name + ", last_name=" + last_name + ", city=" + city
				+ ", cgpa=" + cgpa + ", gender=" + gender + ", dept=" + dept + "]";
	}
	

	
	

}
