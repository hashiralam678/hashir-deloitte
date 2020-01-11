<%@page import="com.deloitte.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%! 
 Person p;
%>

<%
 p=(Person)request.getAttribute("person");
%>

<body>
<style>

table{
border:"1 solid red";
margin:5px;
width:50%;
padding-right:5px;
font-size: 18;
color:blue;
  
}

</style>

<h1> Person Information </h1>
<table >

<tr>
<th>Property</th>
<th>Value</th>
</tr>

<tr>
<td>Name</td>
<td><%=p.getName() %></td>
</tr>

<tr>
<td>Gender</td>
<td><%=p.getGender() %></td>
</tr>

<tr>
<td>Languages</td>
<td><%=p.getLangs() %></td>
</tr>

<tr>
<td>Country</td>
<td><%=p.getCountry() %></td>
</tr>

</table>

</body>
</html>