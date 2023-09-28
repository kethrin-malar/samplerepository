package jspservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollegeEnrollmentServlet
 */
@WebServlet("/CollegeEnrollmentServlet")
public class CollegeEnrollmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollegeEnrollmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		//if (pathInfo != null && pathInfo.equals("someValue")) {
		String destination = "/WEB-INF/jsp/login.jsp";
	    if(pathInfo.equals("/SignUp")) {
	    System.out.println("Going to login.jsp");
	    RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
	    dispatcher.forward(request, response);
	    }
	    
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
	    
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String userid = request.getParameter("userid");
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String password = request.getParameter("password");
			doGet(request, response);
		}catch(ServletException | IOException e) {
		e.printStackTrace();
		}
		
	}

}
