package com.deloitte;

import java.util.Arrays;
import java.util.List;

public class LeapYear {
	
	public static boolean isLeap(int x)
	{
//		if (x % 400==0 || (x%4==0 && x%100!=0)) {
//			return true;
//		}
//		else 
//			return false;
//		
		return(x % 400==0 || (x%4==0 && x%100!=0));
	}

	public static void main(String[] args) {
		
		List<Integer> years= Arrays.asList(2000,1996,1975,1900,2004,2008);
		years.stream().filter(LeapYear::isLeap).forEach(x -> System.out.println(x));
//		years.stream().filter(x->(x % 400==0 || (x%4==0 && x%100!=0))).forEach(x -> System.out.println(x));  without using leap year method.
	}

}
