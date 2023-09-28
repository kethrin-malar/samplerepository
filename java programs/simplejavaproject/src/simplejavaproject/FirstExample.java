package simplejavaproject;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/sampleschemas";
        String username = "root";
        String password = "Root";
        
        
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            String deleteSql = "DELETE FROM booking_tbl WHERE userid = 4";
            int rowsAffected = statement.executeUpdate(deleteSql);

            System.out.println(rowsAffected + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
