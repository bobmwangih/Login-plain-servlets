package com.bob.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	String sql ="select * from user where username=? password=?";
	String url="jdbc:mysql://localhost:3306/userdata";
	String username ="root";
	String password = "admin";
	
	public boolean verifyCredentials(String uname,String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, username, password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "uname");
		st.setString(2, pass);
		ResultSet rs =st.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;		
	}
}
