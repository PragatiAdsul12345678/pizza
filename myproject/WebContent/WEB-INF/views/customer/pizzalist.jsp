<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h4>${requestScope.status}</h4>
<h5>User Details : ${sessionScope.cust_dtls}</h5>
<p>In Pizza List</p>

<h3>Menu List</h3>
	<table style="background-color: white; margin: auto;">
	<tr> 
	<td>Menu Pizza</td>
	 </tr>
	
		<c:forEach var="c" items="${requestScope.Pizza_pizza_list}">

			<tr>
				<td><input type="checkbox">${c.pizza_id}</td>
			    <td>${c.pizza_name}</td>
			    <td>${c.rate}</td>
				
				
				
				
				
			</tr>
		</c:forEach>
		<tr><td><input type="submit" value="submit"></td></tr>
		
	</table>
</body>
</html>