package jspservlet;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUpServlet/*")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        String pathInfo = request.getPathInfo();
        System.out.println(pathInfo + "...");
		
		String destination = "/WEB-INF/jsp/login.jsp";
		if(pathInfo.equals("/SignUp")) {
	    System.out.println("Going to login.jsp");
	    RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
	    dispatcher.forward(request, response);
	
		{
	    
		String userid = request.getParameter("userid");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");
		
	    SignUp obj = new SignUp();
	    obj.doSignUp(userid,firstname,lastname,password);
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
        response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		
		}	
		
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

