package jspservlet;
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
//import com.mysql.*;


/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet/*")
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
		System.out.println("testing inside hws");
		
		String pathInfo = request.getPathInfo();
		
		String destination = "/WEB-INF/jsp/login.jsp";
		if(pathInfo.equals("/SignUp")) {
	    System.out.println("Going to login.jsp");
	    RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
	    dispatcher.forward(request, response);
	    
	    }
		/*else if (pathInfo.equals("/coursedisplay")) {
		   System.out.println("Going to listcourse.jsp");
		   destination = "/WEB-INF/jsp/listcourse.jsp";
		   RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
		    dispatcher.forward(request, response);
	   }*/
	   /*else if (pathInfo.equals("/courseenroll")) {
		   System.out.println("Going to courseenroll.jsp");
		   destination = "/WEB-INF/jsp/courseenroll.jsp";
		   RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
		    dispatcher.forward(request, response);
	   }*/
	   else if (pathInfo.equals("/courseconfirm")) {
		   System.out.println("Going to confirm.jsp");
		   destination = "/WEB-INF/jsp/confirm.jsp";
		   RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
		    dispatcher.forward(request, response);
	   }else{
		   System.out.println("Going to exit.jsp");
		   destination = "/WEB-INF/jsp/exit.jsp";
		   RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
		   dispatcher.forward(request, response);
	   }
        
	    
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
   // TODO Auto-generated method stub
   		response.getWriter().append("Served at: ").append(request.getContextPath());
       
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	// TODO Auto-generated method stub
	try {
		String jdbcUrl = "jdbc:mysql://localhost:3306/sampleschemas";
	    Connection con = DriverManager.getConnection(jdbcUrl, "root", "Root");
	    String pathInfo = request.getPathInfo();
		
		if (pathInfo.equals("/coursedisplay")) {
			   System.out.println("Going to listcourse.jsp");
			   String destination = "/WEB-INF/jsp/listcourse.jsp";
			   
			   
			    String userid = request.getParameter("userid");
				String firstname = request.getParameter("firstname");
				String lastname = request.getParameter("lastname");
				String password = request.getParameter("password");
				
				String insertQuery = "INSERT INTO usertbl(userid, firstname, lastname,password) VALUES (?, ?, ?, ?)";

		        PreparedStatement pstmt = con.prepareStatement(insertQuery);
		        
		        pstmt.setString(1,userid );
		        pstmt.setString(2, firstname);
		        pstmt.setString(3, lastname);
		        pstmt.setString(4, password);
		        pstmt.executeUpdate();
		        
		        
	            
	            String QUERY = "SELECT * FROM course";
	            
	            Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery(QUERY);
		        ArrayList listcourse = new ArrayList();
		        
		        
		        
		        
		            while (rs.next()) {
		        	System.out.println("1");
	 	            // Retrieve by column name
	 	            String courseId = rs.getString("courseid");
	 	            String coursename = rs.getString("coursename");
	 	            String coursecategory = rs.getString("coursecategory");
	 	            String credits = rs.getString("credits");
	 	            
	 	            System.out.println("2");
		           
	 	            Course courseobj = new Course();
	 	            
	 	            courseobj.setCourseid(courseId);
	 	            courseobj.setCoursename(coursename);
	 	            courseobj.setCoursecategory(coursecategory);
	 	            courseobj.setCredits(credits);
	 	            System.out.println("3");
	 	            
	 	            
	 	           listcourse.add(courseobj);
	 	           System.out.println("4");
	 	           
	 	           
	 	          
	 	         //request.getRequestDispatcher("/enrollPage.jsp").forward(request, response);
	 	           
	 	         }
		            
		            request.setAttribute("listcourse",listcourse);
		 	        RequestDispatcher dispatcher = request.getRequestDispatcher(destination);
				    dispatcher.forward(request, response);
		                  
					       
					 
					 
				  if (pathInfo.equals("/courseenroll")) {
						   System.out.println("Going to courseenroll.jsp");
						   String destination1 = "/WEB-INF/jsp/courseenroll.jsp";
						  
						   
						    String coursename = request.getParameter("coursename");
							String coursecategory = request.getParameter("coursecategory");
							String credits = request.getParameter("credits");
						    String userId = request.getParameter("userid");
							String courseid = request.getParameter("courseid");
							
							insertQuery = "INSERT INTO enrollment(userid, courseid) VALUES (?, ?)";

					        PreparedStatement pstm = con.prepareStatement(insertQuery);
					        
					        pstm.setString(1,userId);
					        pstm.setString(2, courseid);
					        
					        pstm.executeUpdate();
					        
					        String Query = "SELECT * FROM enrollment";
					        String query = "SELECT * FROM course";
				            
				            Statement stmt1 = con.createStatement();
					        ResultSet rs1 = stmt1.executeQuery(Query);
					        ResultSet rs2 = stmt1.executeQuery(query);
					        
					        ArrayList courseenroll = new ArrayList();
					        
					        
					        while (rs1.next()) {
					        	System.out.println("1");
				 	            // Retrieve by column name
				 	           
				 	            String userID = rs1.getString("userid");
				 	            String courseID = rs1.getString("courseid");
				 	           
				 	            
				 	          Enrollment enrollobj = new Enrollment();
				 	            
				 	         
				 	          enrollobj.setUserid(userID);
				 	          enrollobj.setCourseid(courseID);
				 	          
				 	          
				 	         
				 	          System.out.println("3");
				 	          
				 	          courseenroll.add(enrollobj);
				 	          
				 	          
					        }
				 	          
				 	          
				 	          while(rs2.next()) {
				 	        	  String courseName = rs2.getString("coursename");
				 	        	  String courseCategory = rs2.getString("coursecategory");
				 	        	  String credits1 = rs2.getString("credits");
				 	        	  
				 	        	 Course courseobj = new Course();
					 	          
					 	          courseobj.setCoursename(courseName);
					 	          courseobj.setCoursecategory(courseCategory);
					 	          courseobj.setCredits(credits);
					 	          courseenroll.add(courseobj);
					 	          System.out.println("4");
				 	        	  
				 	          }
				 	            
				 	          
				 	           
				 	           
				 	          request.setAttribute("courseenroll",courseenroll);
				 	          RequestDispatcher dispatcher1 = request.getRequestDispatcher(destination1);
							  dispatcher1.forward(request, response);
				 	           
				 	            
					        
		 	            
	 	          
				  
		          
		         }          
		}
		        
	    //doGet(request, response);
		
	}catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
}
}


