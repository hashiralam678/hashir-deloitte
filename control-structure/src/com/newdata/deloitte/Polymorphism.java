package com.newdata.deloitte;

import java.util.Scanner;

public class Polymorphism {
	
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a ,float b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a , b;
		//float  c,d;
		Scanner sc = new Scanner(System.in);
		/*System.out.println("enter the values");
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=sc.nextFloat();
		d=sc.nextFloat();
		*/
		Polymorphism p = new Polymorphism();
		System.out.println("Integer method call:"+p.add(5, 6));
		System.out.println("Float method call:"+ p.add(13.5f, 14.6f));
		sc.close();
	}

}
