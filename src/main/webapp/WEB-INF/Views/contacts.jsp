<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
<a href="listAllBilling">Billings</a>
<h2>Contacts</h2>
<hr>
		<table>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Lead Source</th>
				<th>Mobile</th>
				<th>Create Billing</th>
			</tr>
			<c:forEach items="${contact}" var="contact" >		
			<tr> 
     			<td><a href="getcontactInfo?id=${contact.id}">${contact.id}</a></td>
     			<td><a href="getcontactInfo?id=${contact.id}">${contact.firstName}</a></td>
     			<td><a href="getcontactInfo?id=${contact.id}">${contact.lastName}</a></td>
     			<td><a href="getcontactInfo?id=${contact.id}">${contact.email}</a></td>
     			<td><a href="getcontactInfo?id=${contact.id}">${contact.leadSource}</a></td>
     			<td><a href="getcontactInfo?id=${contact.id}">${contact.mobile}</a></td>
     			<td><a href="billing?id=${contact.id}">Generate bill</a>
			</tr>
			</c:forEach>  
		</table>
</body>
</html>