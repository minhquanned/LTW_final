<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Font Awesome -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
	rel="stylesheet" />
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
	rel="stylesheet" />
<!-- MDB -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css"
	rel="stylesheet" />
<link rel="shortcut icon" type="x-icon" href="IMG/Logo.png">
<link rel="stylesheet" type="text/css" href="CSS/index.css">
<title>Login</title>
</head>
<body>
	<section class="vh-150 gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<span class="d-flex justify-content-center mb-5"> <img
								alt="" src="IMG/Logo.png" width="300" height="auto">
							</span>
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Login</h3>
							<form class="justify-content-md-around" action="LoginServlet">
								<div
									class="d-flex flex-row justify-content-md-around align-items-center">
									<p class="text-danger">${errorMessage}</p>
								</div>

								<div
									class="d-flex flex-row justify-content-md-around align-items-center">

									<div class="">
										<label class="form-label" for="userName">Username</label> <input
											type="text" id="userName" name="userName"
											class="form-control" />

									</div>
								</div>

								<div
									class="d-flex flex-row justify-content-md-around align-items-center">

									<div class="">
										<label class="form-label" for="password">Password</label> <input
											type="password" id="password" name="password"
											class="form-control" />
									</div>
								</div>
								
								<div class="d-flex justify-content-md-around">
									<div class="mt-4 pt-2">
										<input class="btn btn-primary btn-rounded btn-sm my-0"
											style="font-size: 20px; min-width: 140px;" type="submit"
											value="Login" />
									</div>

								</div>

							</form>


						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- MDB -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.umd.min.js"></script>
</body>
</html>