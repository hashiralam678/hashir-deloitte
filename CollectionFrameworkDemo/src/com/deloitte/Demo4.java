package com.deloitte;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {

	public static void main(String[] args) {
			
		Map<String,String> trainees = new HashMap<>();
		trainees.put("Hashir","Jamshedpur");
		trainees.put("Sidharth Sahoo","Odisha");
		trainees.put("Sidharth Barpanda","Delhi");
		trainees.put("Sidharth Badyal","Jammu");
		
//		System.out.println("Enter a Name : ");
//		String name = new Scanner(System.in).nextLine();
//		System.out.println("Location is :"+trainees.get(name));
		
//		for(String key:trainees.keySet()) {
//			System.out.println("Name :"+ key +"\tLocation :"+ trainees.get(key));
//		}
		
		trainees.forEach((k,v) -> System.out.println("Name :"+ k +"\tLocation :"+v));
	}

}
