package com.deloitte;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeCrudOperations {

	public static void main(String[] args) throws Exception{
		
		/*
		 * 
		 * Create Connection
		 * 
		 * 
		 * Create Statement
		 * 
		 * 
		 * Execute Query
		 * 
		 * 
		 * Process ResultSet
		 * 
		 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
														"system","admin");
		if(con!=null) {
			System.out.println("Connection Successful");
		}

//		Statement smt=con.createStatement();
		
		PreparedStatement psmt = con.prepareStatement("insert into dept1 values(?,?,?)") ;
		System.out.println("enter the department no:");
		int no=Integer.parseInt(in.readLine());
		System.out.println("enter the department name:");
		String dept = in.readLine();
		System.out.println("enter the location:");
		String loc = in.readLine();
		
		psmt.setInt(1, no);
		psmt.setString(2, dept);
		psmt.setString(3, loc);
		
//		int r=smt.executeUpdate("Insert into dept1 values ("+no+",'"+dept+"','"+loc+"')");  // For Statement.
		
		int r=psmt.executeUpdate();
		if(r>0) {
			System.out.println(r+"Data Inserted");
		}
//		String job;
//		ResultSet rs = smt.executeQuery("select * from employee where job='"+job+"'");
//		System.out.println("Emp IDs    Emp-Names ");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"       "+rs.getString(2));
//		}
	}

}
