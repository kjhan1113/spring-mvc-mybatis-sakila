<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Actors List</h1>
	<table>
		<tr>
			<th>Actor ID</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach var="actor" items="${actors}">
			<tr>
				<td>${actor.actorId}</td>
				<td>${actor.firstName}</td>
				<td>${actor.lastName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>