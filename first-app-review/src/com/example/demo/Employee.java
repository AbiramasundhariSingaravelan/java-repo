package com.example.demo;

public class Employee {

	private int eid;
	private String ename;
	private String design;
	private int salary;
	private Address addr;
	public Employee(int eid, String ename, String design, int salary,Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.design = design;
		this.salary = salary;
		this.addr=addr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename +", address=" +addr+", design=" + design + ", salary=" + salary + "]";
	}
	
}
