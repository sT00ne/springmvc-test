<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		<c:forEach items="${userList}" var="car">
			<tr>
				<td>${car.id} </td>
				<td>${car.name} </td>
				<td>${car.school} </td>
				<td>${car.enable} </td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="add" onclick="window.location = 'user'"/>
</body>
</html>