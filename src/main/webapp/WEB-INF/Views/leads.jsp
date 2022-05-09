<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>
<a href="lead">Create Lead</a>
<h2>Leads</h2>
<hr>
		<table>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Lead Source</th>
				<th>Mobile</th>
			</tr>
			<c:forEach items="${lead}" var="lead" >		
			<tr> 
     			<td><a href="getLeadInfo?id=${lead.id}">${lead.id}</a></td>
     			<td><a href="getLeadInfo?id=${lead.id}">${lead.firstName}</a></td>
     			<td><a href="getLeadInfo?id=${lead.id}">${lead.lastName}</a></td>
     			<td><a href="getLeadInfo?id=${lead.id}">${lead.email}</a></td>
     			<td><a href="getLeadInfo?id=${lead.id}">${lead.leadSource}</a></td>
     			<td><a href="getLeadInfo?id=${lead.id}">${lead.mobile}</a></td>
			</tr>
			</c:forEach>  
		</table>
</body>
</html>