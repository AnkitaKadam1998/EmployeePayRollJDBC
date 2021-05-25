package com.day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeePayroll {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	String url = "jdbc:mysql://localhost:3306/employee_payroll_service";
	String userName = "root";
	String password = "Ankita@1104";
	
	String query = "update employee_payroll set basic_pay = '50000' where Name = 'Ankita'";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	//ResultSet rs = st.executeQuery(query);
	int rs = st.executeUpdate(query); 
	System.out.println("Number of rows affected"+rs);
	
	/* String employeeData = "";
	while(rs.next()) {
		employeeData = rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4)+"-"+rs.getString(5);
				
		System.out.println(employeeData);
	} */

}


