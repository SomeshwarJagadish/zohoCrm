<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Update Information</h2>
<hr>
<form action="editInfo" method="post">
<pre>
Id          <input type="text" value="${lead.id}" name="id" disabled/>
			<input type="hidden" value="${lead.id}" name="id" /> 
First Name  <input type="text" value="${lead.firstName}" name="firstName"/>
Last Name   <input type="text" value="${lead.lastName}" name="lastName"/>
Email       <input type="text" value="${lead.email}" name="email"/>
Lead Source: <select name="leadSource"  >
			<option value="Advertisement">Ads</option>
			<option value="Social media">Social Media</option>
			<option value="News Paper">News Paper</option>
			<option value="Web browser">Web Browser</option>
			<option value="Radio">Radio</option>
			<option value="Others">Others</option>
			</select>
Mobile      <input type="text" value="${lead.mobile}" name="mobile"/>
            <input type="submit" value="save"/>
</pre>
</form>
</body>
</html>