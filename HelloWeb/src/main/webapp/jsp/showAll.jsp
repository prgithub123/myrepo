<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<div align="center">
		<h1>Users List</h1>
		<h2>Students: ${numberOfStudents}</h2>

		<table border="1">
			<th>No</th>
			<th>Id</th>
			<th>Age</th>
			<th>name</th>
			<th>Actions</th>

			<c:forEach var="student" items="${studentList}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${student.id}</td>
					<td>${student.age}</td>
					<td>${student.name}</td>
					<td><a href="/edit?id=${student.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="/delete?id=${student.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>

		<form method="GET" action="/HelloWeb/student">
			<table>
				<tr>
					<td><input type="submit" value="Dodaj kolejnego studenta" /></td>
				</tr>
			</table>
		</form>

	</div>
</body>
</html>
