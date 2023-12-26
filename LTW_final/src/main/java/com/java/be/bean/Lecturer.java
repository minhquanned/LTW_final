package com.java.be.bean;

public class Lecturer {
	String lecturerID;
	String position;
	String firstName;
	String lastName;
	String birthday;
	String gender;
	String email;
	String phoneNumber;
	public String getLecturerID() {
		return lecturerID;
	}
	public void setLecturerID(String lecturerID) {
		this.lecturerID = lecturerID;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Lecturer(String lecturerID, String position, String firstName, String lastName, String birthday,
			String gender, String email, String phoneNumber) {
		super();
		this.lecturerID = lecturerID;
		this.position = position;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Lecturer() {
		super();
	}
}
