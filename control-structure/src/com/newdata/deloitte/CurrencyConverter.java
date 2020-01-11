package com.newdata.deloitte;
import java.util.Scanner;

public class CurrencyConverter 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int option;
		double inr , usd , cur=71.0f;
		System.out.println("Enter your choice:");
		System.out.println("1 : INR -> USD ");
		System.out.println("2 : USD -> INR");
		option=sc.nextInt();
		/*if(option == 1)
		{
			System.out.println("Enter the amount of Rupees You want to convert :");
			inr = sc.nextDouble();
			usd = inr/cur;
			System.out.println("COnverted Amount in Dollar is " +usd+"$");
		}
		else if (option == 2)
		{
			System.out.println("Enter the amount of Dollar You want to convert :");
			usd = sc.nextDouble();
			inr = usd*cur;
			System.out.println("Converted Amount in Rupees is " +inr);
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		*/
		switch(option)
		{
		case 1:
			System.out.println("Enter the amount of Rupees You want to convert :");
			inr = sc.nextDouble();
			usd = inr/cur;
			System.out.println("COnverted Amount in Dollar is " +usd+"$");
			break;
		case 2:
			System.out.println("Enter the amount of Dollar You want to convert :");
			usd = sc.nextDouble();
			inr = usd*cur;
			System.out.println("Converted Amount in Rupees is " +inr);
			break;
		default:
				System.out.println("Invalid Option.");
			break;
		
		}	
	sc.close();
	}
		
		
}


