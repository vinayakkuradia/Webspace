<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Trainees</title>
</head>
<body>
	<h3>YMSLI Trainees</h3>
	<a href="logout">Logout</a>
	<hr />
	<table>
		<tr>
			<th>Trainee Id</th>
			<th>Name</th>
			<th>Branch</th>
			<th>Percentage</th>
		</tr>
		<c:forEach items="${traineeList}" var="trainee">
		<tr>
		<td>${ trainee.traineeId }</td>
		<td>${ trainee.traineeName }</td>
		<td>${ trainee.branch }</td>
		<td>${ trainee.percentage }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="addTrainee">Add new trainee</a>
</body>
</html>