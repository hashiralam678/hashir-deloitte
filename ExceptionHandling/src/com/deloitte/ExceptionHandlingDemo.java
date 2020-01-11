package com.deloitte;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		
		System.out.println("Enter value for a and b");
		
		try {
			a=Integer.parseInt(in.readLine());
			b=Integer.parseInt(in.readLine());
			
			double x=a/b;
			System.out.println("Result = "+x);
			}
		
		//catch(NumberFormatException e) {
			//System.out.println("Numbers Expected in the desired fromat");
		//}
		//catch(ArithmeticException e) {
		//	System.out.println("value of b should not be zero");
		//}
		catch(IOException e){
				System.out.println("Value of b shouldn't be zero");
		}
		
		catch(Exception e){
			System.out.println("Error Ocurred " +e.getMessage());
		}
		System.out.println("Execution Done...");
	}

}
