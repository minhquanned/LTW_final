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
<title>In Charge of the Specialized Projects Edit</title>
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
								In Charge of the Specialized Projects Edit
							</h3>
							<form action="EditRSP" method="post">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="rspID">ID</label> <input
												type="text" id="rspID" name="rspID"
												class="form-control form-control-lg"
												value="${rsp.getRspID()}" required />
											<p class="text-danger">Do not change this field</p>
										</div>

									</div>

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="spName">Specialized
												Projects</label><br> <select class="select form-control-lg"
												id="spID" name="spID" required>
												<option value="NULL" disabled>Choose
													option</option>
												<c:forEach var="item" items="${ListSPs}">
													<option value="${item.getSpID()}" ${rsp.getSpID() == item.getSpID() ? "selected" : ""}>${item.getSpID()}
														- ${item.getSpName()}</option>
												</c:forEach>
											</select>
										</div>

									</div>
								</div>

								<div class="row">

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="studentName">Student</label><br>
											<select class="select form-control-lg" id="studentID"
												name="studentID" required>
												<option value="NULL" disabled>Choose
													option</option>
												<c:forEach var="item" items="${ListStudents}">
													<option value="${item.getStudentID()}" ${rsp.getStudentID() == item.getStudentID() ? "selected" : ""}>${item.getStudentID()}
														- ${item.getLastName()} ${item.getFirstName()}</option>
												</c:forEach>
											</select>
										</div>

									</div>

									<div class="col-md-6 mb-4">

										<div class="form-outline">
											<label class="form-label required" for="lecturerName">Lecturer</label><br>
											<select class="select form-control-lg" id="lecturerID"
												name="lecturerID" required>
												<option value="NULL" disabled>Choose
													option</option>
												<c:forEach var="item" items="${ListLecturers}">
													<option value="${item.getLecturerID()}" ${rsp.getLecturerID() == item.getLecturerID() ? "selected" : ""}>${item.getLecturerID()}
														- ${item.getLastName()} ${item.getFirstName()}</option>
												</c:forEach>
											</select>
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