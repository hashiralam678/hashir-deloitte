<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
.cc{
background-color:red;
}
</style>
<div class="cc">
<h3>Date/Time : <%=new Date() %></h3>
<h2>Cube= ${cube}</h2>
</div>
</body>
</html>