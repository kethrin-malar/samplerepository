<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Patients</title>
</head>
<body>
    <h1>Patients</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Location</th>
            <th>Gender</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="patient" items="${list}">
            <tr>
                <td>${patient.patientId}</td>
                <td>${patient.patientName}</td>
                <td>${patient.patientAge}</td>
                <td>${patient.patientLocation}</td>
                <td>${patient.patientGender}</td>
                <td><a href="/Demo/editpatient/${patient.patientId}">Edit</a></td>
                <td><a href="/Demo/deletepatient/${patient.patientId}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
