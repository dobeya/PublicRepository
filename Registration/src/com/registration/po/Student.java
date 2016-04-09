package com.registration.po;

import java.sql.Date;

public class Student {
	private String id;
	private Date birthday;
	private String gender;
	private String academySite;
	private String emergencyContact;
	private int emergencyContactNumber;
	public Student(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAcademySite() {
		return academySite;
	}
	public void setAcademySite(String academySite) {
		this.academySite = academySite;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public int getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(int emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
}