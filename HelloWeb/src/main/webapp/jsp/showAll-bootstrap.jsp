<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"
	integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
	integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ=="
	crossorigin="anonymous"></script>

<title>Lista studentów</title>
</head>
<body>
	<div class="container">
		<h2>Lista studentów</h2>
		<p>Liczba studentów: ${numberOfStudents}</p>
		<p><button id="/student" onclick="location='student'" type="button" class="btn btn-success">Dodaj studenta</button></p>
		<table class="table">
			<thead>
				<tr>
					<th>No</th>
					<th>Id</th>
					<th>Age</th>
					<th>Name</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody style="font-size: 80%">
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
			</tbody>
		</table>
	</div>
</body>
</html>
