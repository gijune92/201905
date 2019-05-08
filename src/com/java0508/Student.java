package com.java0508;

public class Student {

	// Java Beans!!!
	
	// 생성자
	public Student(String name, String gender, String id, String password) {
		setName(name);
		setGender(gender);
		setId(id);
		setPassword(password);
	}
	// Field
	private String name;
	private String gender;
	private String id;
	private String password;
	
	// Get, Set
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", id=" + id + ", password=" + password + "]";
	}
	
}
