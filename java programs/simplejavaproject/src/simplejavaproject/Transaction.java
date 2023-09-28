package simplejavaproject;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/sampleschemas";
        String username = "root";
        String password = "Root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "INSERT INTO Transaction (transactionid, transactiondate, transactiontime, amount, merchantname, `desc`, status, cardnum) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, 2);
                preparedStatement.setString(2, "2002-05-16");
                preparedStatement.setString(3, "12:30:56"); // Fixed time format
                preparedStatement.setString(4, "35.2300");
                preparedStatement.setString(5, "sita");
                preparedStatement.setString(6, "Transaction successful");
                preparedStatement.setString(7, "approval");
                preparedStatement.setString(8, "1234 4567 2396");

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " rows affected.");
            }
               //Read the statement
                try (Statement readStatement = connection.createStatement()) {
                    ResultSet rs = readStatement.executeQuery("SELECT * FROM Transaction");
                    System.out.println("transactionid    transactiondate     amount");
                    
                    while (rs.next()) {
                       int transactionid = rs.getInt("transactionid");
                       String transactiondate = rs.getString("transactiondate");
                       String amount = rs.getString("amount");
                       System.out.println(transactionid + "   " + transactiondate + "    " +amount);
                    }
                }
                
                
                 // Delete data using PreparedStatement
                    int transactionIdToDelete = 1;
                    String deleteSql = "DELETE FROM transaction WHERE transactionid = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) {
                        deleteStatement.setInt(1, transactionIdToDelete);

                        int rowsDeleted = deleteStatement.executeUpdate();
                        System.out.println(rowsDeleted + " row(s) deleted.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}