//java package(supriya140)
package com.maren.project1.dao;

import java.sql.Connection;//importing all the classes from the packages(supriya140)
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.project1.model.Profile;
//class profiledao (supriya140)
public class ProfileDao {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");//database oracle connection(supriya140)
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","supriya06");
	}
	//save is the method for class profile(supriya140) 
	public int save(Profile profile) {
		//connection and statement has been kept null(supriya140)
		Connection con = null;
		Statement st = null;
		int res = 0;
		//exception handling(supriya140)
		try {
			//getting connection with database(supriya140)
			con = getConnection();
			//creating statement(supriya140)
			st = con.createStatement();
			//executing queries(supriya140)
			res = st.executeUpdate("INSERT INTO emp2 (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack trace for this throwable obj on the standard error output stream(supriya140)
			e.printStackTrace();
		}finally {
			try {
				st.close();//closing the statement above(supriya140)
				con.close();//closing the connection above(supriya140)
			} catch (SQLException e) {
				//this method prints a stack trace for this throwable obj on the standard error output stream(supriya140)
				e.printStackTrace();
			}
		}
		//terminates the execution of a function and returns control to the calling function 
		return res;
	}
	//fetches all remaining row in the result set9supriya140)
	public List<Profile> fetchAll() {
		//conn and statement has been kept null(supriya140)
		List<Profile> list=null;
		Connection con = null;
		Statement st = null;
		//exception handling(supriya140)
		try {
			//getting connection with database(suupriya140)
			con = getConnection();
			//creating statements(supriya140)
			st = con.createStatement();
			//executing queries(supriya140)
			ResultSet rs = st.executeQuery("SELECT * FROM emp2");
			if(rs != null)
				//creating a new obj profile of the class(supriya140)
				list = new ArrayList<>();
			while(rs.next()) {
				Profile pr = new Profile();
				//set method would set the value and get method would return the variable(supriya140)
				pr.setUserid(rs.getString("userid"));
				pr.setName(rs.getString("name"));
				pr.setEmail(rs.getString("email"));
				pr.setMobile(rs.getLong("mobile"));
				list.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				//this method prints a stack trace for this throwable obj on the standard error output stream(supriya140)
				e.printStackTrace();
			}
			
		}
		//terminates the execution of a function and returns control to the calling function(supriya140)
		return list;
	}
	//main function(supriya140)
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","supriya06");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM emp2");
			while(rs.next()) {
				String userid = rs.getString("userid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long mobile = rs.getLong("mobile");
				System.out.println("Id : " +userid + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}

