<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Partner</title>
</head>
<body>
<form:form method="post" >
	<label for="driverId">Driver Id</label>
	<form:input path="driverId"  />
	<label for="driverName">Driver Name</label>
	<form:input path="driverName"  />
	<label for="mobileNumber">Mobile Number</label>
	<form:input path="mobileNumber" />
	<label for="rateing">Rating </label>
	<form:input path="rateing" />
	<input type="submit"  value="Add Driver">		
</form:form>
</body>
</html>