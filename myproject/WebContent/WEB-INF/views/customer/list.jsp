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
<h4>Last Action Status : ${requestScope.status}</h4>
	<h3>Vendor List</h3>
	<table style="background-color: cyan; margin: auto;">
		<c:forEach var="v" items="${requestScope.pizza_list}">

			<tr>
				<td>${p.Pizza_id}</td>
				<td>${p.Pizza_name}</td>
				<td>${p.rate}</td>
				
				<td><a href="<spring:url value='/admin/update?vid=${v.id}'/>">Update</a></td>
				<td><a href="<spring:url value='/admin/delete?vid=${v.id}'/>">Delete</a></td>

			</tr>
		</c:forEach>
	</table>
	<h5>
		<a href="<spring:url value='/admin/add'/>">Add New Vendor</a>
	</h5>

</body>
</html>