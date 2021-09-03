<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mail Home</title>
</head>
<body>
<h1>Mail Options</h1>
<form action="" method="post">
<input name="mailProvider" value=1 type="radio"/>
<label>Gmail</label> <br />
<input name="mailProvider" value=2 type="radio"/>
<label>Rediff</label> <br />
<input name="mailProvider" value=3 type="radio"/>
<label>Yahoo</label> <br />
<input name="mailProvider" value=4 type="radio"/>
<label>Hotmail</label> <br />
<input name="mailProvider" value=0 type="radio"/>
<label>Unknown</label> <br />
<input value="go" type="submit" />
</form>
</body>
</html>