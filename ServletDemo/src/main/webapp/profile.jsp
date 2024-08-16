<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile page</title>
</head>
<body>
<%
	String message= (String)session.getAttribute("msg");
%>
<h1>Hello world<%=message %></h1>
<a href="home.jsp">Homepage</a>
<a href="about.jsp">About</a>

</body>
</html>