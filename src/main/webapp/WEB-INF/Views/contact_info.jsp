<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer info</title>
</head>
<body>
<h2>Customer information</h2>
<hr>
<pre>
First Name  : ${contact.firstName}
Last Name   : ${contact.lastName}
Email       : ${contact.email}
Lead Source : ${contact.leadSource}
Mobile      : ${contact.mobile}
</pre>
		<form action="compose" method="post">
			<input type="hidden" name="emailId" value="${contact.email}"/>
			<input type="hidden" name="id" value="${contact.id}"/>
			<input type="submit" value="Send Email"/> 
		</form>
		<form action="editContact" method="post">
			<input type="hidden" name="id" value="${contact.id}"/>
			<input type="submit" value="Edit"/> 
		</form>
${msg}
</body>
</html>