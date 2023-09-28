package jspservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    
		    try {
		    	String jdbcUrl= "jdbc:mysql://localhost:3306/sampleschemas";
		    	Connection con = DriverManager.getConnection(jdbcUrl,"root","Root");
		    	Statement stmt = con.createStatement();
		    	ResultSet rs = stmt.executeQuery("SELECT * FROM  usertbl;");
		    	while(rs.next()) {
		    		User user = new User();
		    		user.setUserid(rs.getString("userid"));
		    		user.setFirstname(rs.getString("firstname"));
		    		user.setLastname(rs.getString("lastname"));
		    		user.setPassword(rs.getString("password"));
		    	}
		    }catch(SQLException e) {
		    	e.printStackTrace();
		    	
		    }

	}

}
