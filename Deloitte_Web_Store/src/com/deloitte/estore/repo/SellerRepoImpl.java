package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Seller;

public class SellerRepoImpl implements SellerRepo{
	private Connection getDBConnection()throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe","system","admin");
		return con;
	}

	@Override
	public boolean addSeller(Seller seller) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into seller values(?,?)");
		ps.setInt(1,seller.getSellerId());
		ps.setString(2,seller.getSellerName());
		return ps.executeUpdate()>0;
	}

	@Override
	public boolean deleteSeller(Seller seller) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("delete from seller where seller_id=?");
		ps.setInt(1,seller.getSellerId());
		return ps.executeUpdate()>0;
	}

	@Override
	public boolean updateSeller(Seller seller) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("update product set seller_name=? where seller_id=?");
		ps.setString(1,seller.getSellerName());
		ps.setInt(2,seller.getSellerId());
		
		return ps.executeUpdate()>0;
	}

	@Override
	public Seller getSellerById(int sellerId) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement ps = con.prepareStatement("select * from seller where seller_id = ?");
		ps.setInt(1,sellerId);
		
		Seller s = new Seller();
		
		ResultSet rs = ps.executeQuery();
		
		int index = rs.findColumn("seller_id");
		int sid = rs.getInt(index);
		s.setSellerId(sid);
		
		int name = rs.findColumn("seller_name");
		String sname = rs.getString(name);
		s.setSellerName(sname);
		return s;
	}

	@Override
	public List<Seller> getAllSeller(Seller seller) throws SQLException {
		Connection con = getDBConnection();
		PreparedStatement pst = con.prepareStatement("select * from seller");
		ResultSet rs = pst.executeQuery();
		
		List<Seller> list = new ArrayList<>();  
		while(rs.next()) {
			Seller s = new Seller(rs.getInt(1),rs.getString(2));
			
		}
		return  list;
		}

	
}
