package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import java.sql.Statement;

public class DemoJDBC {
	
	public static final String URL = "jdbc:mysql://localhost:3306/sopra_aniket";
	public static final String USER_NAME = "root";
	
	public static String query = "select * from employee where emp_id =?";
	//here we define the particular table of the database

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sopra_aniket","root","Aniket@4950");
		//connection makes connection to the DB
		//Statement stm = con.createStatement(query); //this makes the sql statement 
		PreparedStatement pstm = con.prepareStatement(query);
		//Statement pstm = con.prepareStatement(query);
		pstm.setInt(1,9);
		ResultSet res = pstm.executeQuery(); //this executes the sql statement or the query
		
		
		while(res.next()) {
			int num = res.getInt(1);
			
			String name = res.getString(2);
			Date db = res.getTimestamp(7);//these bracket things define the column nums
			//of the particular table of the db
			System.out.println(num);
			System.out.println(name);
			System.out.println(db);
		}
		res.close();
		
		

	}

}
