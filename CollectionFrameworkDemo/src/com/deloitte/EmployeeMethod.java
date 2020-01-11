package com.deloitte;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMethod {

	public static void main(String[] args) {

		Employee e1 = new Employee(154,"Hashir",38000);
		Employee e2 = new Employee(205,"Sidharth",50000);
		Employee e3 = new Employee(120,"Amit",30000);
		
		List<Employee> empList = Arrays.asList(e1,e2,e3);
		
		empList.forEach(System.out::println);
		Collections.sort(empList);
		
//		List<Integer> nums= Arrays.asList(5,2,10,1,6);
//		Collections.sort(nums);
//		nums.forEach(System.out::println);
		

	}

}
