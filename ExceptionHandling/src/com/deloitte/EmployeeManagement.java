package com.deloitte;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		Employee emp=new Employee(15410,"Hashir",50000);
		EmployeeAdder empAdd=new EmployeeAdder();
		
		try{
			empAdd.addEmployee(emp);
		}
		catch(Exception e) {
			System.out.println("Error = "+e.getMessage());
		}

	}

}
