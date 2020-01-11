package com.deloitte;

public class EmployeeAdder 
{
	
	public void addEmployee(Employee emp) throws Exception{
	
		if(emp.getEmpid()<10000 || emp.getEmpid()>99999)
		{
			throw new InvalidEmployeeIdException("Invalid Id Entered");
		}
		if(emp.getEmpName().length()<3)
		{
			throw new InvalidEmployeeNameException("Invalid Name Entered ");
		}
		if(emp.getSalary()<30000 || emp.getSalary()>80000)
		{
			throw new InvalidEmployeeSalaryException("Wrong salary entered");
		}
		System.out.println("Added Successfully");
		System.out.println(emp);
	}

}
