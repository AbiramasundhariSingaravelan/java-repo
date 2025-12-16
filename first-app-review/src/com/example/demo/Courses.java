package com.example.demo;

public class Courses {

	private int cId;
	private String cName;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Courses [cId=" + cId + ", cName=" + cName + "]";
	}
	
}
