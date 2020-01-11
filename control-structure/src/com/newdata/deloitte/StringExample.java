package com.newdata.deloitte;

public class StringExample {

	public static void main(String[] args) {
		String name[]= {"Manoj","Abdul","Rohit","Pratik","Java"};
		
		for(int i=0;i<name.length; i++)
		{
			for (int j=i+1; j<name.length;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		for(String names:name) {
			System.out.println(names);
		}

	}

}
