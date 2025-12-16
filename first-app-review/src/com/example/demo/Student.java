package com.example.demo;

import java.util.List;

public class Student {

	private int id;
	private String sname;
	private List<Courses> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", courses=" + courses + "]";
	}
	
}
