package jspservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;

public class SignUpDAO {

    public void saveSignUp(String userid, String firstname, String lastname, String password) {
	
	String userID = userid;
	String firstName = firstname;
	String lastName = lastname;
	String passWord = password;
    
   
    
    try {
    	String jdbcUrl = "jdbc:mysql://localhost:3306/sampleschemas";
	    Connection con = DriverManager.getConnection(jdbcUrl, "root", "Root");
	    String insertQuery = "INSERT INTO usertbl(userid, firstname, lastname,password) VALUES (?, ?, ?, ?)";
	    PreparedStatement pstmt = con.prepareStatement(insertQuery);
	    
	   
	    
        
        pstmt.setString(1,userID );
        pstmt.setString(2, firstName);
        pstmt.setString(3, lastName);
        pstmt.setString(4, passWord);
        pstmt.executeUpdate();

    } catch(SQLException e) {
			e.printStackTrace();
		}

 }
    
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SignUpDAO dao1 = new SignUpDAO();
		//dao1.saveSignUp();

	}

}
