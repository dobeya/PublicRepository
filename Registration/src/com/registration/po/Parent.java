package com.registration.po;

public class Parent  extends User{
	private String child;
	private String relationship;
	private String worknum;
	public Parent(){
		
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getWorknum() {
		return worknum;
	}
	public void setWorknum(String worknum) {
		this.worknum = worknum;
	}
}
