package com.newdata.deloitte;
import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int limit = sc.nextInt();
		int i,j;
		
		for(i=1;i<=limit;i++)
		{
			for(j=1;j<=i;j++)
			{
				//System.out.print((i+j-1)%2+" " );
				System.out.print((i+j+1)&1);
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
