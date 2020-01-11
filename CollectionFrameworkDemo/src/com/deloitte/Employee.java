package com.deloitte;

public class Employee implements Comparable<Employee>{

	private int empid;
	private String empName;
	private double Sal;
	
	public Employee() {
		
	}
	public Employee(int empid, String empName, double sal) {
		super();
		this.empid = empid;
		this.empName = empName;
		Sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", Sal=" + Sal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return 0;
	}
	
	
	

}
