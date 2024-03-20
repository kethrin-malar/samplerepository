<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Patient</title>
</head>
<body>
    <h2>Update Patient</h2>
    <form action="${pageContext.request.contextPath}/update" method="post">
        <input type="hidden" name="patientId" value="${patient.patientId}">
        <label for="patientName">Name:</label><br>
        <input type="text" id="patientName" name="patientName" value="${patient.patientName}" required><br><br>
        
        <label for="patientLocation">Location:</label><br>
        <input type="text" id="patientLocation" name="patientLocation" value="${patient.patientLocation}" required><br><br>
        
        <label for="patientAge">Age:</label><br>
        <input type="text" id="patientAge" name="patientAge" value="${patient.patientAge}" required><br><br>
        
        <label for="patientGender">Gender:</label><br>
        <input type="text" id="patientGender" name="patientGender" value="${patient.patientGender}" required><br><br>
        
        <input type="submit" value="Update">
    </form>
</body>
</html>
