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
	<a href="logout">Logout</a>
	<hr />
	<form action="" method="post" onsubmit="return validate()">
		<label for="traineeName">Name: </label>
		<input type="text" id="traineeName" name="traineeName" /><span id="traineeNameError"></span> <br />
		
		<label for="traineeBranch">Branch: </label>
		<select id="traineeBranch" name="traineeBranch">
			<option value="JAVA" >JAVA</option>
			<option value="DOTNET">DOTNET</option>
			<option value="PHP">PHP</option>
			<option value="ORACLE">ORACLE</option>
		</select> <br />
		
		<label for="traineePercentage">Percentage: </label>
		<input type="number" step=".01" id="traineePercentage" name="traineePercentage" /> <span id="percentageError"></span> <br />
		
		<input type="submit" /> <br />
	</form>

<script>
function validate() {
	if(document.getElementById("traineeName").value.length<8) {
		document.getElementById("traineeNameError").innerHTML = "Minimum 10 characters required";
	return false;
		}
	else
		return true;
	
}
</script>
</body>

</html>