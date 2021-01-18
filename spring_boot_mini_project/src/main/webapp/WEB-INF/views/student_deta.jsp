<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO SPRING BOOT STUDENT DATA</h3>
	<table>
		<tr>
			<th>STUDENT ID</th>
			<th>ROLL NO</th>
			<th>STUDENT NAME</th>
			<th>AGE</th>
			<th>FEES</th>
			<th colspan=2>OPERATIONS</th>
		</tr>

		<c:forEach items="${listStudentDetails}" var="list">
			<tr>
				<td><c:out value="${list.sid}" /></td>
				<td><c:out value="${list.rollNo}" /></td>
				<td><c:out value="${list.sname}" /></td>
				<td><c:out value="${list.age}" /></td>
				<td><c:out value="${list.fees}" /></td>

				<td>
					<a href="delete?sid=${list.sid}">DELETE</a>
					<a href="edit?sid=${list.sid}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>