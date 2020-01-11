package com.deloitte;

import java.io.Serializable;

public class Employee implements Serializable{
	// Example of Serialization.
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int empid;
	private String name;
	private double sal;
	
	 Employee() {
		
	}
	
	
	 Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Demo2 [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}