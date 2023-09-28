package simplejavaproject;
import java.sql.*;

public class FirstExample1 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/sampleschemas";
	   static final String USER = "root";
	   static final String PASS = "Root";
	   static final String QUERY = "select customer_tbl.username from customer_tbl;";

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY);) {
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	           
	            System.out.print(", First: " + rs.getString("username"));
	            
	         }
	         conn.close();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}




