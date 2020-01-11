package com.newdata.deloitte;
import java.util.Scanner;

public class ControllStructure
{

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b && b==c)
		{
			System.out.println("All the nummbers are same");
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("Comparison cannot take place as two numbers are same.");
		}
		else
		{
			if(a>b && a>c)
			{
				System.out.println("A  is the largest number = "+a);
			}
			else if(b>a && b>c)
			{
				System.out.println("B is the largest number =" +b);
			}
			else
			{
				System.out.println("C ="+c);
			}
		
		
		}
		sc.close();
	}

}
