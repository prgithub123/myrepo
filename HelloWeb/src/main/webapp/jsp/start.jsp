<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style>
    .jumbotron {
    	background-color: #85e085;
    }
</style>

<title>Lista studentow</title>

</head>
<body style="padding-top: 30px">

	<div class="container">
		<div class="jumbotron text-center">
			<h2>Students Repository Application</h2> 
			<br>
			<a href="/HelloWeb/showAll" class="btn btn-success btn-block" role="button">Lista studentów</a>
			<a href="/HelloWeb/addStudent" class="btn btn-success btn-block" role="button">Dodaj studenta</a>
		</div>
	</div>
	
</body>
</html>
