<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Validation</title>
</head>
<body>
	<h2>Login Page</h2>
	<hr />
	<form action="" method="post" onsubmit="return loginFormValidator()">
	<label>Username: </label>
	<input type="text" id="username" name="username" /> <span id="usernameMsg"></span><br />
	<label>Password: </label>
	<input type="password" id="password" name="password" /> <span id="passwordMsg"></span> <br />
	<input type="submit" />
	</form>
	<script type="text/javascript" src="<%= response.encodeURL(request.getContextPath() + "/validation.js") %>"></script>
</body>
</html>