<html>

<head>
	<title>Spring MVC Form Handling</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<div class="col-lg-12">
			<h2>Submitted Student Information</h2>
		</div>
		<div class="col-lg-12">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Name</th>
						<th>Age</th>
						<th>Id</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${name}</td>
						<td>${age}</td>
						<td>${id}</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="col-lg-12">
			<a href="/HelloWeb/showAll">Pokaz wszystko</a>
		</div>
	</div>

</body>
</html>