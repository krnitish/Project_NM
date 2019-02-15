<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Registration</h1>
<form action="/register">
	<label>First Name</label>
	<input type="text" name="fname"/>
	<br>
	<label>Last Name</label>
	<input type="text" name="lname"/>
	<br>
	<label>DOB</label>
	<input type="text" name="dob"/>
	<br>
	<label>Email ID</label>
	<input type="text" name="email"/>
	<br>
	<label>Aadhar</label>
	<input type="text" name="aadhar"/>
	<br>
	<label>Phone Number</label>
	<input type="text" name="phone"/>
	<br>
	<label>Country</label>
	<input type="text" name="country"/>
	<br>
	<label>State</label>
	<input type="text" name="state"/>
	<br>
	<label>City</label>
	<input type="text" name="city"/>
	<br>
	<label>Location</label>
	<input type="text" name="location"/>
	<br>
	<input type="submit" value="Register"/>
	<input type="reset" value="Reset"/>
</form>
</body>
</html>