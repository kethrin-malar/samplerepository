package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/sampleschemas";
    private static final String USER = "root";
    private static final String PASS = "Root";

    public ResultSet executeQuery(String query) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
        	
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
		} /*
			 * finally { if (statement != null) { statement.close(); } if (connection !=
			 * null) { connection.close(); } }
			 */

        return resultSet;
    }
}

