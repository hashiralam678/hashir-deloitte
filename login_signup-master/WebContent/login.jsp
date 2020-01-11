<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="LoginVerification" method="post">
		<table border=1>
			<tr>
				<td>User ID:</td>
				<td><input type="number" name="id" placeholder="user_id"
					required="required"></td></tr>
				<tr><td>Password:</td>
				<td><input type="password" name="pass" placeholder="password"
					required="required"></td>
				<tr><td colspan="2" align="right"><input type="submit" value="LOGIN"></td></tr>
			</tr>
			<tr>
				<%
					String error = (String) session.getAttribute("error");
					error = error != null ? error : "";
				%>
				<td colspan="3"><%=error%></td>
			</tr>
			<tr>
				<td colspan="5" align="left">Create a new Account. <a
					href="signup.jsp">Sign Up</a>.
				</td>
			</tr>
			<%
				session.setAttribute("error", "");
			%>
		</table>
	</form>
</body>
</html>