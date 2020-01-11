package com.newdata.deloitte;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array: ");
		n = sc.nextInt();
		//int nums[] = new int[n];
		for(int i=0; i < n;i++)
		{
			System.out.print(i+"\t");
		}
	sc.close();		
	}

}
