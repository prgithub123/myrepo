<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<form class="form-horizontal" role="form" action="addStudent" method="post">

					<div class="form-group">
						<label class="control-label col-lg-2" for="text">Name:</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" id="name" name="name" placeholder="Name">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2" for="text">Age:</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" id="age" name="age" placeholder="Name">
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2" for="text">Id:</label>
						<div class="col-lg-10">
							<input type="text" class="form-control" id="id" name="id" placeholder="Name">
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>

				</form>
			</div>
		</div>
	</div>

	<a href="/HelloWeb/showAll">Pokaz wszystko</a>
</body>
</html>