package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.DbConnection;
import com.entity.RegistrationDemo;

public class RegistrationDemoDao {
	
	public int registration(RegistrationDemo rd) {
		int status=0;
		Connection con= DbConnection.openConnection();
		PreparedStatement ps=null;
		//id, name, farhername, mothername, brothername, sistername, branch, adharcard, states,pin, email, password
		String insertQuery="insert into registration_demo(id, name, farhername, mothername, brothername, sistername, branch, adharcard, states, pin, email, password)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(insertQuery);
			ps.setInt(1, rd.getId());
			ps.setString(2, rd.getName());
			ps.setString(3, rd.getFather_name());
			ps.setString(4, rd.getMother_name());
			ps.setString(5, rd.getBrother_name());
			ps.setString(6, rd.getSister_name());
			ps.setString(7, rd.getBranch());
			ps.setString(8, rd.getAdharcard());
			ps.setString(9, rd.getStates());
			ps.setString(10, rd.getPincode());
			ps.setString(11, rd.getEmail());
			ps.setString(12, rd.getPassword());
			status=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		}


}
