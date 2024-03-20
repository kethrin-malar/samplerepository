<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Patient</title>
</head>
<body>
    <h2>Edit Patient</h2>
    <form action="${pageContext.request.contextPath}/editsavepatient" method="post">
        <input type="hidden" name="patientId" value="${command.patientId}">
        
        <label for="patientName">Name:</label><br>
        <input type="text" id="patientName" name="patientName" value="${command.patientName}" required><br><br>

        <label for="patientAge">Age:</label><br>
        <input type="text" id="patientAge" name="patientAge" value="${command.patientAge}" required><br><br>

        <label for="patientLocation">Location:</label><br>
        <input type="text" id="patientLocation" name="patientLocation" value="${command.patientLocation}" required><br><br>

        <label for="patientGender">Gender:</label><br>
        <select id="patientGender" name="patientGender">
            <option value="Male" ${command.patientGender == 'Male' ? 'selected' : ''}>Male</option>
            <option value="Female" ${command.patientGender == 'Female' ? 'selected' : ''}>Female</option>
            <option value="Other" ${command.patientGender == 'Other' ? 'selected' : ''}>Other</option>
        </select><br><br>

        <input type="submit" value="Update">
    </form>
</body>
</html>
