<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String myname = (String) session.getAttribute("name");
	%>
	<h3> welcome to <%= myname %>'s profile </h3>
	
	<a href="home.jsp">home</a> &nbsp; &nbsp;
	<a href = "about-us.jsp"> about us</a>
</body>
</html>