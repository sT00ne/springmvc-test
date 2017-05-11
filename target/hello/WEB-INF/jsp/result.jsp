<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<spring:url value="/web-resources/jquery-3.2.1.min.js" var="jquery" />
<spring:url value="/web-resources/mycss.css" var="myCSS" />
<link href="${myCSS}" rel="stylesheet" type="text/css" />
<script src="${jquery}" type="text/javascript"></script>
</head>
<body>
	<h1>User List</h1>
	<table>
		<tr>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.school}</td>
				<td>${user.enable}</td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="add" onclick="window.location = 'user'" />
</body>
</html>