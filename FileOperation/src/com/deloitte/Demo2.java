package com.deloitte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Demo2{
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		
		FileInputStream fin=null;
		ObjectInputStream ois=null;
		
		try {
			Employee emp =new Employee(101,"Hashir",50000);
			fout = new FileOutputStream("emp.txt");
			oos = new ObjectOutputStream(fout);
			
			oos.writeObject(emp);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally {
			oos.close();
			fout.close();
		}
		
		try
		{
			fin = new FileInputStream("emp.txt");
			ois = new ObjectInputStream(fin);
			Employee emp=(Employee)ois.readObject();
			System.out.println(emp);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally {
			ois.close();
			fin.close();
		}
	}
}
