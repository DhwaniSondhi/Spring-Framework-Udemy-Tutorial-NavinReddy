<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>Hi Dhwani</p>

	<form action="addPerson">
		Enter your id: <input type="text" name="id"/><br>
		Enter your name: <input type="text" name="name"/><br>
		<input type="submit"/><br>
	</form>
	
	<form action="getPerson">
		Enter the id: <input type="text" name="id"/><br>
		<input type="submit"/><br>
	</form>
	
	<form action="getPersonByName">
		Enter the name: <input type="text" name="name"/><br>
		<input type="submit"/><br>
	</form>
</body>
</html>