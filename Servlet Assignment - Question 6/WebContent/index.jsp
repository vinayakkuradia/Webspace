<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stationer's Catalog</title>
</head>
<body>
	<h2>Stationer's Catalog</h2>
	<table>
	<tr>
	<th>Item</th>
	<th>Price</th>
	</tr>
		<c:forEach var="item" items="${ catalogMap }">
			<tr>
				<td>${ item.key }</td>
				<td>${ item.value }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>