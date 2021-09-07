<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-up Validation</title>
</head>
<body>
	<h2>Sign-up Page</h2>
	<hr />
	<form action="" method="post" onsubmit="return signupFormValidator()">
		<label>Full Name: </label>
			<input type="text" id="fullName" name="fullName" /> <span id="fullNameMsg"></span> <br />
		<label>Username: </label>
			<input type="text" id="username" name="username" /> <span id="usernameMsg"></span> <br />
		<label>Password: </label>
			<input type="password" id="password" name="password" /> <span id="passwordMsg"></span> <br />
		<label>Confirm Password: </label>
			<input type="password" id="password1" name="password1" /> <span id="password1Msg"></span> <br />
		<label>Gender: </label>
			<select id="gender" name="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>
				<option value="Other">Other</option>
			</select> <br />
		<input type="submit" />
	</form>
	<script type="text/javascript" src="${pageContext.request.contextPath}/validation.js"></script>
</body>
</html>