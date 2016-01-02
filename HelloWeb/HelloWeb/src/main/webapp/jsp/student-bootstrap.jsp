<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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