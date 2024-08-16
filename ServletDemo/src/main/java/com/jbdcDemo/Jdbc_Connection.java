package com.jbdcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Step-1load the driver into specific RDBMS
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//Step-2 Create connection
			Connection con=    DriverManager.getConnection("jdbc:mysql://localhost:3306/register",
					"root", "root");
			//Step-3 Create communication channel to communicate with the Database object
			PreparedStatement ps= con.prepareStatement("insert into new_table values('Raj','Sharma')");
			// step-4 fetch the data/ process the data 
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Insert successfully");
				
			}
			else {
				System.out.println("Insertion failed");
				
			}
			con.close();
			ps.close();
			
		} catch (SQLException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
