package com.deloitte;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	response.setHeader("Cache-Control", "no-cache no-store-must-revalidate");
    	
    	String uName="hashir";
		String password="12345";
		
		String inUName = request.getParameter("txtname");
		String inPassword = request.getParameter("txtpassword");
		
		if(uName.equals(inUName) && password.equals(inPassword)) {
			HttpSession ssn=request.getSession();
			ssn.setAttribute("user", inUName);
			response.sendRedirect("welcome.jsp");
		}
		else {
		response.sendRedirect("login.jsp");
    }
    }
}
