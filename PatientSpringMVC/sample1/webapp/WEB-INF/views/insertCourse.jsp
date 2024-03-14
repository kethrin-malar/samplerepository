<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Course</title>
</head>
<body>
    <h2>Insert Course</h2>
    <form action="${pageContext.request.contextPath}/insertCourse" method="post">
        <label for="courseid">Course ID:</label>
        <input type="text" id="courseid" name="courseid" required><br><br>
        
        <label for="coursename">Course Name:</label>
        <input type="text" id="coursename" name="coursename" required><br><br>
        
        <label for="coursecategory">Course Category:</label>
        <input type="text" id="coursecategory" name="coursecategory" required><br><br>
        
        <label for="credits">Credits:</label>
        <input type="text" id="credits" name="credits" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>