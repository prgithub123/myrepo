<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


<title>Dodaj studenta</title>
</head>
<body>

	<div class="row">
		<div class="col-sm-10 col-lg-offset-1">
			<form:form action="addStudent" method="post">
				<table class="table">
					<tbody style="">
						<tr>
							<td>Name</td>
							<td><form:input path="name" /></td>
						</tr>
						<tr>
							<td>Age</td>
							<td><form:input path="age" /></td>
						</tr>
						<tr>
							<td>Id</td>
							<td><form:input path="id" /></td>
						</tr>
						<tr>
							<td colspan=2><input name="Dodaj" value="Dodaj" type=submit></td>
						</tr>
					</tbody>
				</table>
			</form:form>
		</div>
	</div>

	<a href="/HelloWeb/showAll">Pokaz wszystko</a>
</body>
</html>