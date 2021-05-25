package com.day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class createdatabase {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	String url = "jdbc:mysql://localhost:3306/employee_payroll";
	String userName = "root";
	String password = "Ankita@1104";
	
	String query ="select * from employee";
	
	//String query = "update employee set Salary = '80000' where Name = 'Ankita'";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
}
}
