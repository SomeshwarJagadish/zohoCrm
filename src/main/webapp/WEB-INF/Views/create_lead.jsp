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
<h2>Lead Information</h2>
<hr>
<form action="leadPage" method="post">
<pre>
First Name  <input type="text" name="firstName"/>
Last Name   <input type="text" name="lastName"/>
Email       <input type="text" name="email"/>
Lead Source: <select name="leadSource" >
			<option value="Advertisement">Ads</option>
			<option value="Social media">Social Media</option>
			<option value="News Paper">News Paper</option>
			<option value="Web browser">Web Browser</option>
			<option value="Radio">Radio</option>
			<option value="Others">Others</option>
			</select>
Mobile      <input type="text" name="mobile"/>
            <input type="submit" value="save"/>
</pre>
</form>
${msg}
</body>
</html>