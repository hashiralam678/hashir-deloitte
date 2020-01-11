package com.deloitte;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(5,2,1,3,10);
		List<String> items = Arrays.asList("Hashir","Alam","Latif","Rohan","Soumen");
//		int sum=0;
		
//		for(int num:nums) {
//			if(num%2!=0) {
//				sum+=num*num;
//			}
//		}
//		System.out.println("sum = "+sum);
		
//		int sum=nums.stream().filter((i)->i%2!=0).mapToInt((i)-> i*i).sum();
//				System.out.println("Sum = "+sum);
		
		int sum=nums.stream().filter((i)->i%2!=0).map((i)-> i*i).reduce(0,(s,c)-> s+c);
		System.out.println("Sum = "+sum);
		
		items.stream().filter(s->s.length()>4).map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
		
		
	
	}
}