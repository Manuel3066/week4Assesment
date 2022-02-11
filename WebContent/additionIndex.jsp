<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Index</title>
</head>
<body>
<h1>Hello! please enter the number to be randomly added!</h1>
<form action="getAdditionServlet" method="post">
Enter the number to randomly add 5!
<input type="text"name="userNumber" size="10">
<input type="submit" value="Calculate Score"/>
</form>
</body>
</html>