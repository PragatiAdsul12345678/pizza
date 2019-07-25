<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<sf:form method="post" modelAttribute="admin">
		<table style="background-color: cyan; margin: auto;">
		
	
		
		
			<tr>
				<td>Enter Admin Email</td>
				<td><sf:input  path="email" /></td>
			</tr>
			<tr>
				<td>Enter Admin Name</td>
				<td><sf:input  path="name" /></td>
			</tr>
		
			<tr>
				<td>Enter Phone No</td>
				<td><sf:input  path="mobile_no" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><sf:password path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>