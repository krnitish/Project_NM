<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Registration</h1>
<form:form action="/addnewuser" method="POST">
	<label>First Name</label>
	<form:input type="text" path="fname"/>
	<br>
	<label>Last Name</label>
	<form:input type="text" path="lname"/>
	<br>
	<label>DOB</label>
	<form:input type="text" path="dob"/>
	<br>
	<label>Email ID</label>
	<form:input type="text" path="email"/>
	<br>
	<label>Aadhar</label>
	<form:input type="text" path="aadharCard"/>
	<br>
	<label>Phone Number</label>
	<form:input type="text" path="mobileNo"/>
	<br>
	<%-- <label>Country</label>
	<form:input type="text" path="country"/>
	<br>  --%>
	<%-- <label>State</label>
	<form:input type="text" path="state"/>
	<br> --%>
<%-- 	<label>City</label>
	<form:input type="text" path="city"/>
	<br>
	<label>Location</label>
	<form:input type="text" path="location"/>
	<br> --%>
	<input type="submit" value="Register"/>
	<input type="reset" value="Reset"/>
</form:form>
</body>
</html>