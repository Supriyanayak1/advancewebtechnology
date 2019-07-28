package com.maren.project1.controller;

import java.sql.*;

public class Jdbc1 {
public static void main(String args[]) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","supriya06");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		con.close();
	}catch(Exception e) {System.out.println(e);}
}
}
