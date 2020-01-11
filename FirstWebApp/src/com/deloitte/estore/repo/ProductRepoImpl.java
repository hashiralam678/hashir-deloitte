package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.deloitte.estore.model.Product;

public class ProductRepoImpl implements ProductRepo {
	private Connection getDBConnection()throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe","system","admin");
		return con;
	}
	@Override
	public boolean addProduct(Product product) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?)");
		ps.setInt(1,product.getProductId());
		ps.setString(2,product.getProductName());
		ps.setDouble(3,product.getPrice());
		return ps.executeUpdate()>0;
	
	}

	@Override
	public boolean deleteProduct(Product product) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("delete from product where product_id=?");
		ps.setInt(1,product.getProductId());
		return ps.executeUpdate()>0;
	}

	@Override
	public boolean updateProduct(Product product) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("update product set product_name=?, price=? where product_id=?");
		ps.setString(1,product.getProductName());
		ps.setDouble(2,product.getPrice());
		ps.setInt(3,product.getProductId());
		
		return ps.executeUpdate()>0;
	}

	@Override
	public Product getProductById(int productId) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("select * from product where product_id = ?");
		ps.setInt(1,productId);
		
		Product p = new Product();
		
		ResultSet rs = ps.executeQuery();
		
		int index = rs.findColumn("product_id");
		int pid = rs.getInt(index);
		p.setProductId(pid);
		
		int name = rs.findColumn("product_name");
		String pname = rs.getString(name);
		p.setProductName(pname);
		
		int pr = rs.findColumn("price");
		double prc = rs.getDouble(pr);
		p.setPrice(prc);
		return p;
		
	}

	@Override
	public List<Product> getAllProduct(Product product) throws Exception {
		Connection con = getDBConnection();
		PreparedStatement pst = con.prepareStatement("select * from product");
		ResultSet rs = pst.executeQuery();
		
		List<Product> list = new ArrayList<>();  
		while(rs.next()) {
			Product p = new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			
		}
		return  list;
	}
		}
	


