<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Welcome Page</title>
</head>
<body>
	<h1 align="center">Beer Selection Page</h1></br>
	<form method="get" action="SelectBeer.do">
		Select beer characteristics<p>
		Color:
		<select name="color" size="1">
			<option value="light">light</option>
			<option value="amber">amber</option>
			<option value="brown">brown</option>
			<option value="dark">dark</option>
		</select>
		<br><br>
		<center>
			<input type="submit" value="OK"/>
		</center>
	</form>
</body>
</html>