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

	<sf:form method="post" modelAttribute="customer">
		<table style="background-color: cyan; margin: auto;">
		
	
		
		
			<tr>
				<td>Enter User Email</td>
				<td><sf:input  path="Cemail" /></td>
			</tr>
			<tr>
				<td>Enter User Name</td>
				<td><sf:input  path="Cname" /></td>
			</tr>
		
			<tr>
				<td>Enter Phone No</td>
				<td><sf:input  path="Cmobno" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><sf:password path="Cpassword" /></td>
			</tr>
			
			<tr>
			<td>Select Preference</td>
			<td> <input type="radio" name="preference" value="Veg">Veg</td>
 
				<td><input type="radio" name="preference" value="Non-veg">Non-veg <br></td>
			
		</tr>	
			
			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>