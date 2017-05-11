<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
	<form:form method="POST" action="/hello/form/add">
		<table>
			<tr>
				<td><form:hidden path="id" />
					<form:label path="name">name</form:label></td>
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
				<td><form:radiobutton path="enable" value="0" checked="checked" />0
					<form:radiobutton path="enable" value="1" />1</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
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
				<td><input type="button" value=edit
					onclick="edit(${user.id},'${user.name}',${user.school},${user.enable})" /></td>
					<td><input type="button" value=delete
					onclick="del(${user.id})" /></td>
			</tr>
		</c:forEach>
	</table>
	<!-- <input type="button" value="add" onclick="window.location = 'user'" /> -->

	<script>
	function edit(id,name,school,enable){
		$("#id").val(id);
		$("#name").val(name);
		$("#school").val(school);
		$("#enable"+(enable+1)).prop('checked', true);
	}
	function del(id){
		$.ajax({
			   url: '/hello/form/del',
			   data: {
			      'id': id
			   },
			   error: function() {
			      $('#info').html('<p>An error has occurred</p>');
			   },
			   dataType: 'text',
			   success: function(data) {
			      location.reload();
			   },
			   type: 'GET'
			});
	}
	</script>
</body>
</html>