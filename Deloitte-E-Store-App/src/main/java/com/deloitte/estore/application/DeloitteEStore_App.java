package com.deloitte.estore.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.estore.model.Customer;
import com.deloitte.estore.model.Order;
import com.deloitte.estore.model.Product;
import com.deloitte.estore.model.Seller;


public class DeloitteEStore_App {

	public static void main(String[] args) {
 		
		Seller seller = new Seller(300,"Apple",154404);
		Product product = new Product(2222,"i phone 11",100000);
		product.setSeller(seller);
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Seller.class)
				.addAnnotatedClass(Order.class)
				.buildSessionFactory();
		
		Session sn = sf.openSession();     // opening a session.
		Transaction tx = sn.beginTransaction();

		sn.save(seller);
		sn.save(product);
		
		tx.commit();
		sn.close();
	}

}
