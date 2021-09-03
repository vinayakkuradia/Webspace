<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
	<h3>Please enter trainee information:</h3>
	<hr />
	<form action="" method="post">
		<label for="traineeName">Name: </label>
		<input type="text" id="traineeName" name="traineeName" /> <br />
		
		<label for="traineeBranch">Branch: </label>
		<select id="traineeBranch" name="traineeBranch">
			<option value="JAVA" >JAVA</option>
			<option value="DOTNET">DOTNET</option>
			<option value="PHP">PHP</option>
			<option value="ORACLE">ORACLE</option>
		</select> <br />
		
		<label for="traineePercentage">Percentage: </label>
		<input type="text" id="traineePercentage" name="traineePercentage" /> <br />
		
		<input type="submit" onclick="return true" /> <br />
	</form>
</body>
</html>