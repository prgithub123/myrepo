<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Lista studentów</title>
</head>
<body>
	<div class="container">
		<h2>Lista studentów</h2>
		<p>Liczba studentów: ${numberOfStudents}</p>
		<p>
			<button id="/addStudent" onclick="location='addStudent'"
				type="button" class="btn btn-success">Dodaj studenta</button>
		</p>

		<!-- Tabela -->
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
						<td>${(currentPage - 1) * pageSize + status.index + 1}</td>
						<td>${student.id}</td>
						<td>${student.age}</td>
						<td>${student.name}</td>
						<td>
							<a href="/HelloWeb/editStudent?id=${student.id}">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp; 
							<a href="/HelloWeb/deleteStudent?id=${student.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<!-- Pagination -->
		<nav class="text-center">
			<ul class="pagination" style="align-content: center">
				
				<!-- Przycisk Previous -->
				<c:choose>
					<c:when test="${currentPage==1}">
						<li class="disable">
							<span aria-hidden="true">&laquo;</span>
						</li>
					</c:when>
					<c:otherwise>
						<li>
							<a href="/HelloWeb/showAll?page=${currentPage - 1}" aria-label="Previous"> 
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
					</c:otherwise>
				</c:choose>

				<!-- Przyciski numeryczne -->
				<c:forEach var="i" begin="1" end="${numberOfPages}">
					<li class="<c:out value="${currentPage eq i ? 'active': ''}"/>"><a
						href="/HelloWeb/showAll?page=${i}">${i}</a></li>
				</c:forEach>

				<!-- Przycisk Next -->
				<c:choose>
					<c:when test="${currentPage==numberOfPages}">
						<li class="disable">
							<span aria-hidden="true">&raquo;</span>
						</li>
					</c:when>
					<c:otherwise>
						<li>
							<a href="/HelloWeb/showAll?page=${currentPage + 1}" aria-label="Previous"> 
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					</c:otherwise>
				</c:choose>
				
			</ul>
		</nav>


	</div>
</body>
</html>
