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
<title>Edit Subject</title>
</head>

<script type="text/javascript"></script>

<body>
	<section class="vh-100 gradient-custom">
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
								Edit Subject
							</h3>
							<form action="EditSubject" method="post">

								<div class="row">
								
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="lecturerID">Subject ID</label>
											<input type="text" id="subjectID" name="subjectID"
												class="form-control form-control-lg" value="${subject.getSubjectID()}" disabled required />
										</div>

									</div>

									<div class="col-md-6 mb-4">
										<div class="form-outline">
											<label class="form-label" for="subjectName">Subject
												Name</label> <input type="text" id="subjectName" name="subjectName"
												class="form-control form-control-lg" value="${subject.getSubjectName()}" required />
										</div>
									</div>
									
								</div>
								
								<div class="row">
									
									<div class="col-md-6 mb-4 pb-2">
										<div>
											<label class="form-label select-label">Number of
												credits</label><br> <select class="select form-control-lg"
												id="noC" name="noC" required>
												<option value="0" disabled selected>Choose option</option>
												<option value="1">1</option>
												<option value="2">2</option>
												<option value="3">3</option>
												<option value="4">4</option>
												<option value="5">5</option>
												<option value="6">6</option>
												<option value="7">7</option>
												<option value="8">8</option>
												<option value="9">9</option>
												<option value="10">10</option>
											</select>
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