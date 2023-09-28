<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp page</title>
</head>
<body>
<h1>Welcome User!!!</h1>
<form action ="/WebApplication//HelloWorldServlet/coursedisplay" method= "post">
<label for="userid">User Id:</label>
    <input type="text" id="userid" name="userid" required><br><br>
<label for="firstname">First Name:</label>
    <input type="text" id="firstname" name="firstname" required><br><br>

    <label for="lastname">Last Name:</label>
    <input type="text" id="lastname" name="lastname" required><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
<input type = 'submit' value = "SignUp">
</form>
</body>
</html>