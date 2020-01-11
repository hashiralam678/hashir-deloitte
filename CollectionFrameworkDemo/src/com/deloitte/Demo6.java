package com.deloitte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo6 {

	public static void main(String[] args) {
		
		List<String> emails=Arrays.asList("hashiralam@gmail.com","sdiharth@yahoo.com","rohanjha@outlook.com","soumendas@gmail.com","abc@gmail.com","xyz@yahoo.com","pqr@outlook.com");
		Map<String,List<String>> emailsList = new HashMap<>();
		
		for(String email:emails)
		{
			String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
			
			if(emailsList.containsKey(domain)) {
				List<String> em=emailsList.get(domain);
				List<String> ems=new ArrayList<>(em);
				ems.add(email);
				emailsList.put(domain,ems);
			}
			else
			{
				emailsList.put(domain,Arrays.asList(email));	
			}

		}
		
//		emailList.forEach((d,e) ->{
//			System.out.println
//		})
		
		
		

	}

}
