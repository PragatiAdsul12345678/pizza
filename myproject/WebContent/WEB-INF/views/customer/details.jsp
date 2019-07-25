<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>${requestScope.status}</h4>
	<h5><font color="pink">WELCOME USER</font></h5>
	 <h5>User Details : ${sessionScope.user_dtls}</h5>
		<a href="<spring:url value='/customer/pizza'/>">List</a>
</body>
</html>