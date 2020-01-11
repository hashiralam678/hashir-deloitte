package com.deloitte;

public class Employee
{
	
	private int empid;
	private String empName;
	private float salary;
	
	public Employee() {
		
	}
	
	public Employee(int empid, String empName, float salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}

}
