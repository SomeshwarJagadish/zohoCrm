<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bills</title>
</head>
<body>
<h2>Billing Section</h2>
<hr>
		<table>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Product Name</th>
				<th>Billing Amount</th>
			</tr>
			<c:forEach items="${bills}" var="bills" >		
			<tr> 
				<td>${bills.id}</td>
     			<td>${bills.firstName}</td>
     			<td>${bills.lastName}</td>
     			<td>${bills.email}</td>
     			<td>${bills.mobile}</td>
     			<td>${bills.productName}</td>
     			<td>${bills.billingAmount}</td>
			</tr>
			</c:forEach>  
		</table>
</body>
</html>