<%@page import="com.java.be.RSPDBContext"%>
<%@page import="com.java.be.SPDBContext"%>
<%@page import="com.java.be.LecturerDBContext"%>
<%@page import="com.java.be.StudentDBContext"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>In Charge of the Specialized Projects List</title>
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
									onclick="location.href='/LTW_final/HomePage.jsp'">
									<i class="fa-solid fa-chevron-left"></i>
								</button>
								In Charge of the Specialized Projects List
							</h3>

							<div class="mt-4 pt-2">
								<button type="button"
									class="btn btn-primary btn-rounded btn-sm my-0"
									onclick="location.href='/LTW_final/AddRSP'">
									<i class="fa-solid fa-plus"></i>&nbsp;&nbsp;Add
								</button>
							</div>
							<br>

							<form class="d-flex justify-content-md-around">

								<%
								SPDBContext spDBContext = new SPDBContext();
								StudentDBContext studentDBContext = new StudentDBContext();
								LecturerDBContext lecturerDBContext = new LecturerDBContext();
								%>
								<table class="table ccard-table table-striped table-hover">
									<tr>
										<th>ID</th>
										<th>Specialized Project</th>
										<th>Student</th>
										<th>Lecturer</th>
										<th class="text-center" colspan="3"></th>
									</tr>

									<c:forEach var="item" items="${rspList}">

										<tr>
											<td>${item.getRspID()}</td>
											<!--<td>${spDBContext.getSPbyID(item.getSpID()).getSpName()}</td> -->
											<td>${item.getSpID()}</td>
											<td>${item.getStudentID()}</td>
											<td>${item.getLecturerID()}</td>
											<td><span class="table-remove edit">
													<button type="button"
														class="btn btn-primary btn-rounded btn-sm my-0"
														onclick="moreInfo('${item.getRspID()}','${item.getSpID()}','${item.getStudentID()}','${item.getLecturerID()}')">More
														Info</button>
											</span></td>
											<td><span>
													<button type="button"
														class="btn btn-primary btn-rounded btn-sm my-0"
														onclick="location.href='/LTW_final/EditRSP?rspID=${item.getRspID()}'">
														Edit</button>
											</span></td>
											<td><span>
													<button type="button"
														class="btn btn-danger btn-rounded btn-sm my-0"
														onclick="location.href='/LTW_final/DeleteRSP?rspID=${item.getRspID()}'">
														Remove</button>
											</span></td>
										</tr>

									</c:forEach>

									<script type="text/javascript">
										function moreInfo(rspID, spID,
												studentID, lecturerID) {
											alert("ID: "
													+ rspID
													+ "\Specialized Project ID: "
													+ spID + "\nStudent ID: "
													+ studentID
													+ "\nLecturer ID: "
													+ lecturerID);
										}
									</script>

								</table>



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