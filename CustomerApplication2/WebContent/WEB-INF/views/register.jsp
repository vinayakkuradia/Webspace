<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Portal</title>
</head>
<body>
	<h1>Welcome to customer registration</h1>
	<br/>
	<form action="" method="post">
	<h3>Please enter customer details</h3>
	<hr>
	<label for="firstname">First Name: </label>
	<input type="text" name="firstname" />
	<label for="lastname">Last Name: </label>
	<input type="text" name="lastname" /> <br />
	<label for="address">Address: </label> 
	<input type="text" name="address" /> <br />
	<label for="mobile">Mobile: </label>
	<input type="number" name="mobile" /> <br />
	<label for="email">Email: </label>
	<input type="email" name="email" /> <br />
	<input type="submit" />
	</form>
</body>
</html>