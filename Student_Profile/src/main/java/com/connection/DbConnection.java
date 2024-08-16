package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DbConnection {
	private static Connection con;
	public static Connection openConnection(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		}
		catch(SQLException|ClassNotFoundException se) {
			System.out.println(se);
		}
		return con;
		
	}
	
	}


