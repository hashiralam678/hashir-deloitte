package com.deloitte;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class ShowServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("t1"));
		int n2 = Integer.parseInt(req.getParameter("t2"));
		int sum = n1+n2;
		res.getWriter().println("Sum ="+sum);
		
		//REQUEST DISPATCHER 
		RequestDispatcher rd = req.getRequestDispatcher("cube");
		req.setAttribute("sum", sum);
		
		try {
			rd.forward(req,res);
		}
		catch(ServletException e)
		{
			e.printStackTrace();
		}
		
		// SEND REDIRECT TO SEND THE URL BY PROVIDING SUM TO CUBE.
		// response.sendRedirect("cube?sum="+sum);
		
		// USING SESSION 
//		HttpSession sn=req.getSession();
//		sn.setMaxInactiveInterval(10);  // Session time-out time.
//		sn.setAttribute("sum",sum);
//		res.sendRedirect("cube");
	}

}
