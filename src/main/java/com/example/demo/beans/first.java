package com.example.demo.beans;

public class first {
	 int id;
	 String firstName;
	 String firstSchool;
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstSchool() {
		return firstSchool;
	}
	public void setFirstSchool(String firstSchool) {
		this.firstSchool = firstSchool;
	}
//	constructors
	public first(int id, String firstName, String firstSchool) {
		this.id = id;
		this.firstName = firstName;
		this.firstSchool = firstSchool;
	}
}
