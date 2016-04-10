package com.registration.po;

public class Instructor extends User{
	private String degree;
	private String skill;
	public Instructor(){
		
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}