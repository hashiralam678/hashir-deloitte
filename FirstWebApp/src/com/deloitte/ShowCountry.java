package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hashir")
public class ShowCountry extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String name=req.getParameter("textname");
		String gender=req.getParameter("gender");
		List<String>langs=Arrays.asList(req.getParameterValues("cblang"));
		String country=req.getParameter("country");
		
		PrintWriter out=res.getWriter();
		out.println("Name : "+name);
		out.println("Gender : "+gender);
		out.println("Languages : ");
		langs.forEach((l)->out.println(l));
		out.println("<br>Country : "+country+"<br>");
		
	}
	

}
