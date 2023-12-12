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
<title>Student Registration</title>
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
								Student Registration
							</h3>
							<form>

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="studentID">Student ID</label>
											<input type="text" id="studentID"
												class="form-control form-control-lg" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="class">Class</label> <input
												type="text" id="class" class="form-control form-control-lg" />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="firstName">First Name</label>
											<input type="text" id="firstName"
												class="form-control form-control-lg" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="lastName">Last Name</label> <input
												type="text" id="lastName"
												class="form-control form-control-lg" />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 d-flex align-items-center">

										<div class="form-outline datepicker w-100">
											<label for="birthdayDate" class="form-label">Birthday</label>
											<input type="date" class="form-control form-control-lg"
												id="birthdayDate" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<h6 class="mb-2 pb-1">Gender:</h6>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio"
												name="inlineRadioOptions" id="femaleGender" value="option1"
												checked /> <label class="form-check-label"
												for="femaleGender">Female</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio"
												name="inlineRadioOptions" id="maleGender" value="option2" />
											<label class="form-check-label" for="maleGender">Male</label>
										</div>

										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio"
												name="inlineRadioOptions" id="otherGender" value="option3" />
											<label class="form-check-label" for="otherGender">Other</label>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<label class="form-label" for="emailAddress">Email</label> <input
												type="email" id="emailAddress"
												class="form-control form-control-lg" />
										</div>

									</div>
									<div class="col-md-6 mb-4 pb-2">

										<div class="form-outline">
											<label class="form-label" for="phoneNumber">Phone
												Number</label> <input type="tel" id="phoneNumber"
												class="form-control form-control-lg" />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">
										<div>

											<label class="form-label select-label">Department of</label><br>
											<select class="select form-control-lg">
												<option value="0" disabled>Choose option</option>
												<option value="1">Mathematics</option>
												<option value="2">Physics</option>
												<option value="3">Biology</option>
												<option value="4">Geography</option>
												<option value="5">Information Technology</option>
												<option value="6">Fine Art</option>
												<option value="7">Literature</option>
												<option value="8">History</option>
												<option value="9">Engineering</option>
												<option value="10">Informatics</option>
												<option value="11">Technology</option>
												<option value="12">Politics</option>
												<option value="13">Psychology</option>
												<option value="14">Music</option>
												<option value="15">Craft</option>
												<option value="16">Astronomy</option>
												<option value="17">Economics</option>
												<option value="18">Social Science</option>
												<option value="19">Foreign language</option>
												<option value="20">Physical Education</option>
											</select>

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