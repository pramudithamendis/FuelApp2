<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String no1= (String)request.getAttribute("sum"); %>

<%=no1 %> Updated

<a href="index.jsp">index</a>
</body>
</html>