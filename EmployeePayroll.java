package com.day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayroll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
		//initializing url,username and password
		String url = "jdbc:mysql://localhost:3306/employee_payroll_service";
		String userName = "root";
		String password = "Ankita@1104";
		
		int basic_pay = 70000;
		String Name = "Manish";
		String query = "update employee_payroll_service.employee_payroll set basic_pay =? where Name = ?";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,basic_pay);
		st.setString(2, Name);
		
		int count = st.executeUpdate();
				
		System.out.println(count + "rows affected");
		st.close();
		con.close();
		
	}

}


