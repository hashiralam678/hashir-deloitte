package com.deloitte;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/cube")
public class ServletCube extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException {
		//REQUEST DISPATCHER 
		int sum = (int)req.getAttribute("sum");
		int cube  = sum*sum*sum;
		res.getWriter().println("Sum: "+sum);
		res.getWriter().println("Cube: "+cube);
		
		// SEND REDIRECT FOR GETTING SUM AND CREATING CUBE WITH URL REDIRECTION.
//		int sum = Integer.parseInt(req.getParameter("sum"));
//		int cube  = sum*sum*sum;
//		res.getWriter().println("Sum: "+sum);
//		res.getWriter().println("Cube: "+cube);
		
		// COOKIE 
//		int sum=0;
//		Cookie []cookies =req.getCookies();
//		 for(Cookie ck:cookies) 
//		 {
//			 if(ck.getName().equals("deloitte.sum"))
//			 {
//				 sum=Integer.parseInt(ck.getValue());
//				 break;
//			 }
//		 }
		 
		// SESSION FOR COOKIE
//		HttpSession sn = req.getSession();
		
		
		
		//SESSION CALLING.
//		HttpSession sn = req.getSession();
//		int sum = (int)(sn.getAttribute("sum"));
		
	}
	}


