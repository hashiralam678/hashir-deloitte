package com.deloitte.estore.controller;


import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.repo.ProductRepo;
import com.deloitte.estore.repo.ProductRepoImpl;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/addproduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
		int productId=Integer.parseInt(request.getParameter("txtpid"));
		String productName = request.getParameter("txtpname");
		float price = Float.parseFloat(request.getParameter("txtprice"));
		
		Product product = new Product(productId,productName,price);
		
		ProductService ps = new ProductServiceImpl();
		System.out.println("product added successfully in controller");
		
			if(ps.addProduct(product)) {
				System.out.println("product sent from controller to success. ");
				response.sendRedirect("success.jsp");
				}
			}
			catch(Exception e) {
				try {
					e.printStackTrace();
					response.sendRedirect("error.jsp");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}


