package com.selenium.alltopics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC 
{
	static Connection conn;
	
	public static void main(String args[]) throws Exception
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"," system", "zaq1ZAQ!");
		 System.out.println(conn);
		 
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from student");
		 System.out.println("Statement created");
		 System.out.println("Query executed");
		 while(rs.next())
		 {
			 System.out.println("  sname is:  "+rs.getString("sname")+" Phone:"+rs.getInt("phone")+" Location:"+rs.getString("location"));
		 }
		}
		
		
		 catch(Exception se)
			 {
				 System.out.println("sql Exception "+se);
			 }
			 finally
			 {
				 try
				 {
					 if(conn !=null)
						 conn.close();
				 }
				 catch(SQLException e)
				 {
					 e.printStackTrace();
				 }
			 }
		 
	}
	
}
	

