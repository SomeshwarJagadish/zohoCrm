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
First Name  : ${lead.firstName}
Last Name   : ${lead.lastName}
Email       : ${lead.email}
Lead Source : ${lead.leadSource}
Mobile      : ${lead.mobile}
</pre>
		<form action="compose" method="post">
			<input type="hidden" name="emailId" value="${lead.email}"/>
			<input type="hidden" name="id" value="${lead.id}"/>
			<input type="submit" value="Send Email"/> 
		</form>
		<form action="lead" method="post">
			<input type="submit" value="Save another lead"/>
		</form>
		<form action="convert" method="post">
			<input type="hidden" name="id" value="${lead.id}"/>
			<input type="hidden" name="firstName" value="${lead.firstName}"/>
			<input type="hidden" name="lastName" value="${lead.lastName}"/>
			<input type="hidden" name="email" value="${lead.email}"/>
			<input type="hidden" name="leadSource" value="${lead.leadSource}"/>
			<input type="hidden" name="mobile" value="${lead.mobile}"/>
			<input type="submit" value="convert"/>
		</form>
		<form action="edit" method="post">
			<input type="hidden" name="id" value="${lead.id}"/>
			<input type="submit" value="Edit"/> 
		</form>
${msg}
</body>
</html>