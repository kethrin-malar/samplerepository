package sampledemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: venkat testing").append(request.getContextPath());
		String destination = "dept.jsp";
		String b=request.getParameter("dept");
		System.out.println(b);
		String jdbcUrl= "jdbc:mysql://localhost:3306/sampleschemas";
        String username = "root";
        String password = "Root";
        
      try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
       
		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Insert data using a prepared statement
            String insertQuery = "INSERT INTO jdbcconnectivity values(?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, b);
           
            int rowsInserted = insertStatement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
           
            // Select data using a prepared statement. Get all the departments
            String QUERY = "select dept from jdbcconnectivity";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            ArrayList departmentArrayList = new ArrayList();
   	         // Extract data from result set
   	         while (rs.next()) {
   	            // Retrieve by column name
   	            String v = rs.getString("dept");
   	            		
   	            departmentArrayList.add(v);
   	            
   	         }
           
            
          //loop through resultset and add elements in departmentArrayList 
          request.setAttribute("deptList", departmentArrayList);
            
            
          
       }catch (SQLException e) {
            e.printStackTrace();
        }
    //You can also connect to DB, save the value of dept in a table.
		RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
		String name = "john";
		//You can also connect to DB, get the value of name from SQL query and pass it to JSP page.
		
		request.setAttribute("name", name);
		dispatcher.forward(request, response);
		
 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	// TODO Auto-generated method stub
	try {
		doGet(request, response);
		} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
}

}

