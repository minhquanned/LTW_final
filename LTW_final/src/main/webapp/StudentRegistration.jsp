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
<title>Student Registration</title>
</head>
<body>
	<section class="gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">
								<button type="button"
									class="btn btn-danger btn-rounded btn-sm my-0"
									onclick="location.href='/LTW_final/StudentServlet'">
									<i class="fa-solid fa-chevron-left"></i>
								</button>
								Student Registration
							</h3>
							<form action="AddStudent">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="studentID">Student ID</label>
											<input type="text" id="studentID" name="studentID"
												class="form-control form-control-lg" required />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="className">Class</label> <input
												type="text" id="className" name="className"
												class="form-control form-control-lg" required />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="firstName">First Name</label>
											<input type="text" id="firstName" name="firstName"
												class="form-control form-control-lg" required />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="lastName">Last Name</label> <input
												type="text" id="lastName" name="lastName"
												class="form-control form-control-lg" required />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div class="form-outline datepicker w-100">
											<label for="birthday" class="form-label required">Birthday</label>
											<input type="date" class="form-control form-control-lg"
												id="birthday" name="birthday" required />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<h6 class="mb-2 pb-1 required">Gender:</h6>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio"
												name="gender" id="female" value="female"
												checked /> <label class="form-check-label"
												for="female">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio"
												name="gender" id="male" value="male" />
											<label class="form-check-label" for="male">Male</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio"
												name="gender" id="other" value="other" />
											<label class="form-check-label" for="other">Other</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<label class="form-label required" for="email">Email</label> <input
												type="email" id="email" name="email"
												class="form-control form-control-lg" required />
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<label class="form-label required" for="phoneNumber">Phone
												Number</label> <input type="tel" id="phoneNumber" name="phoneNumber"
												class="form-control form-control-lg" required />
										</div>

									</div>
								</div>

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-rounded btn-sm my-0" type="submit"
										value="Submit" />
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