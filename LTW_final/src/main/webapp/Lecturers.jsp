<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Lecturers List</title>
</head>
<body>
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">
								<button type="button"
									class="btn btn-danger btn-rounded btn-sm my-0"
									onclick="location.href='/LTW_final'">
									<i class="fa-solid fa-chevron-left"></i>
								</button>
								Lecturers List
							</h3>

							<div class="mt-4 pt-2">
								<button type="button"
									class="btn btn-primary btn-rounded btn-sm my-0"
									onclick="location.href='LecturerRegistration.jsp'">
									<i class="fa-solid fa-plus"></i>&nbsp;&nbsp;Add
								</button>
							</div>
							<br>

							<form class="d-flex justify-content-md-around">

								<table class="table ccard-table table-striped table-hover">
									<tr>
										<th>Lecturer ID</th>
										<th>Position</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th class="text-center" colspan="3"> </th>
									</tr>
									<c:forEach var="item" items="${ListLecturers}">

										<tr>
											<td>${item.getLecturerID()}</td>
											<td>${item.getPosition()}</td>
											<td>${item.getFirstName()}</td>
											<td>${item.getLastName()}</td>
											<td><span class="table-remove edit">
													<button type="button"
														class="btn btn-primary btn-rounded btn-sm my-0"
														onclick="moreInfo('${item.getLecturerID()}','${item.getPosition()}','${item.getFirstName()}','${item.getLastName()}','${item.getBirthday()}','${item.getGender()}','${item.getEmail()}','${item.getPhoneNumber()}')">More Info</button>
											</span></td>
											<td><span>
													<button type="button"
														class="btn btn-primary btn-rounded btn-sm my-0"
														onclick="location.href='/LTW_final/EditLecturer?lecturerID=${item.getLecturerID()}'">
														Edit</button>
											</span></td>
											<td><span>
													<button type="button"
														class="btn btn-danger btn-rounded btn-sm my-0"
														onclick="location.href='/LTW_final/DeleteLecturer?lecturerID=${item.getLecturerID()}'">
														Remove</button>
											</span></td>
										</tr>

									</c:forEach>
								</table>
								
								<script type="text/javascript">
									function moreInfo(lecturerID, position, firstName, lastName, birthday, gender, email, phoneNumber) {
										alert("Lecture ID: " + lecturerID
												+ "\nPosition: " + position
												+ "\nFirst Name: " + firstName
												+ "\nLast Name: " + lastName
												+ "\nBirthday: " + birthday
												+ "\nGender: " + gender
												+ "\nEmail: " + email
												+ "\nPhone Number: " + phoneNumber);
									}
								</script>

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