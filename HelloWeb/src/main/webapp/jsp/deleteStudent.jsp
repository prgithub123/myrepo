<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="refresh" content="5;url=/HelloWeb/showAll" />

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Usuwanie studenta</title>
</head>
<body>
	<div class="container">
		<h2>Lista studentów</h2>
		<p>Pomyślnie usunięto studenta nr <b>${id}</b> z Bazy Studenów</p>
		<p>Nastąpi przekierowanie do <a href="/HelloWeb/showAll">Listy	Studentów</a>...</p>
	</div>
</body>
</html>
