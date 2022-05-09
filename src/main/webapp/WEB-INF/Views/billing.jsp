<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Generate the Billing</h2>
<hr>
<form action="billingPage" method="post">
<pre>
First Name     <input type="text" name="firstName" value="${contact.firstName}"/> <input type="hidden" name="id" value="${contact.id}"/>
Last Name      <input type="text" name="lastName"value="${contact.lastName}"/>
Email          <input type="text" name="email"value="${contact.email}"/>
Mobile         <input type="text" name="mobile"value="${contact.mobile}"/>
Product Name   <input type="text" name="productName" />
Billing Amount <input type="text" name="billingAmount" />
               <input type="submit" value="Generate the bill"/>
</pre>
</form>
</body>
</html>