package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.connection.DbConnection;
import com.entity.Student_registration;

public class Registration_dao {

	
	public int Student_registratiom(Student_registration rs) {
		int status=0;
		Connection con=DbConnection.openConnection();
		PreparedStatement ps=null;
		
		//student_id, name, fathername, mothername, branch, adharcard, gender, email, password
		String insertQuery="insert into registration(student_id, name, fathername, mothername, branch, adharcard, gender, email, password,userType) values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			ps= con.prepareStatement(insertQuery);
			ps.setInt(1, rs.getId());
			ps.setString(2, rs.getName());
			ps.setString(3, rs.getFather_name());
			ps.setString(4, rs.getMother_name());
			ps.setString(5,rs.getBranch());
			ps.setString(6, rs.getAdharno());
			ps.setString(7, rs.getGender());
			ps.setString(8, rs.getEmail());
			ps.setString(9, rs.getPassword());
			ps.setString(10, rs.getUserType());
			
			
			status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		return status;
		}
}
