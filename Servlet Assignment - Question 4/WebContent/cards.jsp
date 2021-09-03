<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    Integer servletAttribute = (Integer)request.getAttribute("flowers");                   
    out.print("<br>flowers:" + servletAttribute);
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cards</title>
</head>
<body>
<h4>Go to any of the pages:</h4>
<a href="./billPage">Bill Page</a>
<a href="./flowers">Flowers</a>
</body>
</html>