package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.estore.model.Customer;

public class CustomerRepoImpl implements CustomerRepo{
	private Connection getDBConnection()throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe","system","admin");
		return con;
	}
	@Override
	public boolean addCustomer(Customer customer) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into customer values (?,?,?)");
		ps.setInt(1, customer.getCustomerId());
		ps.setString(2, customer.getCustomerName());
		ps.setString(3, customer.getLocation());
		
		int r = ps.executeUpdate();
		return (r>0);
	}
	@Override
	public boolean deleteCustomer(Customer customer) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("delete from customer where customer_id=?");
		ps.setInt(1,customer.getCustomerId());
		int r = ps.executeUpdate();
		return (r>0);
	}
	@Override
	public boolean updateCustomer(Customer customer) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("update customer set customer_name= ?, customer_location= ? where customer_id=? ");
		ps.setInt(1,customer.getCustomerId());
		ps.setString(2,customer.getCustomerName());
		ps.setString(3,customer.getLocation());
		int r = ps.executeUpdate();
		return (r>0);
	}
	@Override
	public Customer getCustomerById(int customerId) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("select * from customer where customer_id = ?");
		ps.setInt(1,customerId);
		
		Customer c = new Customer();
		ResultSet rs= ps.executeQuery();
		
		int index = rs.findColumn("customer_id");
		int cid = rs.getInt(index);
		c.setCustomerId(cid);
		
		int cnm = rs.findColumn("customer_name");
		String cname=rs.getString(cnm);
		c.setCustomerName(cname);
		
		int li=rs.findColumn("customer_location");
		String loc = rs.getString(li);
		c.setLocation(loc);
		
		
		return c;
	}
	@Override
	public List<Customer> getAllProduct(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
