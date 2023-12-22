<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
	integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" type="text/css" href="CSS/index.css">
<title>Lecturer Edit</title>
</head>
<body>
	<section class="bg-secondary bg-gradient gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">
								<button type="button"
									class="btn btn-danger btn-rounded btn-sm my-0"
									onclick="history.back()">
									<i class="fa-solid fa-chevron-left"></i>
								</button>
								Lecturer Edit
							</h3>
							<form action="AddLecturer">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="lecturerID">Lecturer
												ID</label> <input type="text" id="lecturerID" name="lecturerID"
												class="form-control form-control-lg" value="${lecturer.getLecturerID()}" disabled required />
										</div>

									</div>

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="position">Position</label><br>
											<select class="select form-control-lg" name="position" required>
												<option value="0" disabled selected>Choose option</option>
												<option value="Tutors">Tutors</option>
												<option value="Main lecturer">Main lecturer</option>
												<option value="Associate Professor">Associate Professor</option>
												<option value="Professor">Professor</option>
											</select>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="firstName">First Name</label>
											<input type="text" id="firstName" name="firstName"
												class="form-control form-control-lg" value="${lecturer.getFirstName()}" required />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="lastName">Last Name</label> <input
												type="text" id="lastName" name="lastName"
												class="form-control form-control-lg" value="${lecturer.getLastName()}" required />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div class="form-outline datepicker w-100">
											<label for="birthday" class="form-label">Birthday</label> <input
												type="date" name="birthday"
												class="form-control form-control-lg" id="birthday" value="${lecturer.getBirthday() }" required />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<h6 class="mb-2 pb-1">Gender:</h6>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												id="female" value="female" checked /> <label
												class="form-check-label" for="female">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												id="male" value="male" /> <label class="form-check-label"
												for="male">Male</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="gender"
												id="orther" value="orther" /> <label
												class="form-check-label" for="orther">Other</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<label class="form-label" for="email">Email</label> <input
												type="email" id="email" name="email"
												class="form-control form-control-lg" value="${lecturer.getEmail()}" required />
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<label class="form-label" for="phoneNumber">Phone
												Number</label> <input type="tel" id="phoneNumber" name="phoneNumber"
												class="form-control form-control-lg" value="${lecturer.getPhoneNumber()}" required />
										</div>

									</div>
								</div>

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-lg" type="submit"
										value="Submit" />
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>