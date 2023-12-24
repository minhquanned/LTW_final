<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Specialized Projects Registration</title>
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
								Specialized Projects Registration
							</h3>
							<form action="EditSP" method="post">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="spID">SP ID</label> <input
												type="text" id="spID" name="spID"
												class="form-control form-control-lg" value="${sp.getSpID()}"
												required />
												<p class="text-danger">Do not change this field</p>
										</div>

									</div>

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="spName">SP Name</label> <input
												type="text" id="spName" name="spName"
												class="form-control form-control-lg"
												value="${sp.getSpName()}" required />
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="schoolYear">School
												Year</label><br> <select class="select form-control-lg"
												id="schoolYear" name="schoolYear" required>
												<option value="NULL" disabled selected>Choose
													option</option>
												<c:forEach var="item" begin="2000" end="2023">
													<option value="${item}">${item}</option>
												</c:forEach>
											</select>
											<p class="text-primary">Last choice: ${sp.getSchoolYear()}</p>
										</div>

									</div>

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label" for="spPart">Part</label><br>
											<select class="select form-control-lg" id="spPart"
												name="spPart" required>
												<option value="NULL" disabled selected>Choose
													option</option>
												<option value="1">1</option>
												<option value="2">2</option>
											</select>
											<p class="text-primary">Last choice: ${sp.getSpPart()}</p>
										</div>

									</div>
								</div>

								<div class="row">
									<div class="col-md-6 mb-4 pb-2">
										<div>

											<label class="form-label select-label">Subject</label><br>
											<select class="select form-control-lg" id="subjectID"
												name="subjectID" required>
												<option value="NULL" disabled selected>Choose
													option</option>
												<c:forEach var="item" items="${ListSubjects}">
													<option value="${item.getSubjectID()}">${item.getSubjectID()} - ${item.getSubjectName()}</option>
												</c:forEach>
											</select>
											<p class="text-primary">Last choice: ${sp.getSubjectID()}</p>
										</div>

									</div>
								</div>

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-rounded btn-sm my-0"
										type="submit" value="Submit" />
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