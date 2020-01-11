package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.deloitte.estore.model.Product;

public class ProductRepoImpl implements ProductRepo {
	
	 
	@Override
	public boolean addProduct(Product product) throws Exception {
		
		Connection con = getDbConnection();
		
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?)");
		
		ps.setInt(1,product.getProductId());
		ps.setString(2,product.getProductName());
		ps.setDouble(3,product.getPrice());
		
		if(ps.executeUpdate()>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getProductById(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getDbConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
														"system","admin");
		return con;
	}
	

}
