package com.example.demo;

public class NewStudent {

	private NewCourse nc;//value to be injected

	public NewCourse getNc() {
		return nc;
	}
	public NewStudent(NewCourse nc)
	{
		this.nc=nc;
	}
	
	public void display()
	{
		System.out.println("Display from Student via Course");
		nc.show();
	}
}
