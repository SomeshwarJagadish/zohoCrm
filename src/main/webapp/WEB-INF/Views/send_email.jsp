<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
</head>
<body>
<h2>Compose Email</h2>
<hr>
<form action="sendEmail" method="post">
	<pre>
		to      <input type="text" value="${email}" disabled/>
		Subject <input type="text" name="subject"/>
		<label for="body">Message Body</label>
		<textarea name="body" rows="8" cols="70">
		</textarea>
			    <input type="submit" value="send email"/>
	</pre>
</form>
</body>
</html>