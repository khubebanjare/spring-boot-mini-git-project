<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style type="text/css">
		/* h1 {text-align:center; color:gree;} */
	</style>
<title>Student View Page</title>
</head>
	<body>
		<h1>Welcome to Spring Boot Student View Page</h1>
	<div >
		<table border="1">
			<tr>
				<th>ID</th>
				<td>${getOneStudent.sid}</td>
			</tr>
			<tr>
				<th>ROLL NO</th>
				<td>${getOneStudent.rollNo}</td>
			</tr>
			<tr>
				<th>NAME</th>
				<td>${getOneStudent.sname}</td>
			</tr>
			<tr>
				<th>AGE</th>
				<td>${getOneStudent.age}</td>
			</tr>
			<tr>
				<th>FEES</th>
				<td>${getOneStudent.fees}</td>
			</tr>
		</table>
		</div>
</body>
</html>