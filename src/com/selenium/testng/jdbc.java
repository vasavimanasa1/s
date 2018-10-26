package com.selenium.testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
	static Connection conn;
	public static void main(String[] args) throws Exception 
	{
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "zaq1ZAQ!");
	//conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"," system", "zaq1ZAQ!");
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("select * from student");
	while(rs.next())
	{
		System.out.println("sname::  "+rs.getString("sname")+"  phone::  "+rs.getLong("phone")+"   location is::  "+rs.getString("location"));
	}
	
conn.close();
	}

}
