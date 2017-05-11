<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${message}
	<form:form method="POST" action="/hello/form/add">
		<table>
			<tr>
				<td><form:hidden path="id" /><form:label path="name">name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="school">school</form:label></td>
				<td><form:select path="school">
						<form:option value="NONE"> --SELECT--</form:option>
						<form:options items="${schoolList}"></form:options>
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="enable">enable</form:label></td>
				<td><form:radiobutton path="enable" value="0" checked="checked" />0 <form:radiobutton
						path="enable" value="1" />1</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>