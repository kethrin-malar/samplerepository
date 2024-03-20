<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Patient</title>
</head>
<body>
    <h2>Delete Patient</h2>
    <p>Are you sure you want to delete this patient?</p>
    <p>Patient ID: ${patient.patientId}</p>
    <p>Patient Name: ${patient.patientName}</p>
    <p>Patient Location: ${patient.patientLocation}</p>
    <p>Patient Age: ${patient.patientAge}</p>
    <p>Patient Gender: ${patient.patientGender}</p>
    
    <form action="${pageContext.request.contextPath}/delete/${patient.patientId}" method="post">
        <input type="submit" value="Confirm Delete">
    </form>
    <br>
    <a href="${pageContext.request.contextPath}/view">Cancel</a>
</body>
</html>
