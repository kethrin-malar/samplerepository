<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Enroll Course</title>
</head>
<body>
    <h1>Enroll Course</h1>
    <p>Course ID: ${param.courseid}</p>
    <p>Course Name: ${param.coursename}</p>
    <p>Course Category: ${param.coursecategory}</p>
    <p>Credits: ${param.credits}</p>
    <!-- Add enrollment form or other content here -->
</body>
</html>
 
 
 
 <%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Enroll Course</title>
</head>
<body>
    <h1>Enroll Course</h1>
    
    
    <form action="EnrollmentServlet" method="post">
    	 <label for="userid">USER ID:</label>
        <input type="text" name="userid" value="${param.userid}">
        <label for="">Course ID:</label>
        <input type="text" name="courseid" value="${param.courseid}" ><br>
        <label for="">Your Email:</label>
        <input type="email" id="email" name="email" required><br>
        <!-- Add more input fields as needed -->
        <button type="submit">Enroll</button>
    </form>
</body>
</html>
   --%>