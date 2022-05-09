<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<hr>
<h2>Welcome to CRM application</h2>
<hr>
<h3>Number of Leads</h3>
${leadscount}


<h3>Number of Contacts</h3>
${contactsCount}


<h3>Number of Billings</h3>
${billsCount}
</body>
</html>