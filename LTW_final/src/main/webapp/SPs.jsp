<%@page import="com.java.be.bean.SP"%>
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
<title>Specialized Projects List</title>
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
								Specialized Projects List
							</h3>

							<div class="mt-4 pt-2">
								<button type="button"
									class="btn btn-primary btn-rounded btn-sm my-0"
									onclick="location.href='/LTW_final/AddSP'">
									<i class="fa-solid fa-plus"></i>&nbsp;&nbsp;Add
								</button>
							</div>
							<br>

							<form class="d-flex justify-content-md-around">

								<table class="table ccard-table table-striped table-hover">
									<tr>
										<th>Specialized Project</th>
										<th>School Year</th>
										<th>Part</th>
										<th>Subject ID</th>
										<th class="text-center" colspan="3"></th>
									</tr>

									<c:forEach var="item" items="${ListSPs}">

										<tr>
											<td>${item.getSpName()}</td>
											<td>${item.getSchoolYear()}</td>
											<td>${item.getSpPart()}</td>
											<td>${item.getSubjectID()}</td>
											<td><span> <input
													class="btn btn-primary btn-rounded btn-sm my-0"
													data-bs-toggle="modal"
													data-bs-target="#myModal-${item.getSpID()}" type="button"
													value="More Info">
													<div class="modal fade" id="myModal-${item.getSpID()}">
														<div class="modal-dialog">
															<div class="modal-content">
																<div class="modal-header">
																	<h5 class="modal-title">Specialized Project Info</h5>
																	<input class="btn-close" type="button"
																		data-bs-dismiss="modal">
																</div>
																<div class="modal-body">
																	<label class="form-lable">Specialized Project
																		ID: ${item.getSpID()}</label><br> <label
																		class="form-lable">Name: ${item.getSpName()}</label><br>
																	<label class="form-lable">School Year:
																		${item.getSchoolYear()}</label><br> <label
																		class="form-lable">Part: ${item.getSpPart()}</label><br>
																	<label class="form-lable">Subject ID:
																		${item.getSubjectID()}</label><br>
																</div>
																<div class="modal-footer">
																	<button type="button" class="btn btn-danger"
																		data-dismiss="modal">Close</button>
																</div>
															</div>
														</div>
													</div>
											</span></td>
											<td><span>
													<button type="button"
														class="btn btn-primary btn-rounded btn-sm my-0"
														onclick="location.href='/LTW_final/EditSP?spID=${item.getSpID()}'">
														Edit</button>
											</span></td>
											<td><span>
													<button type="button"
														class="btn btn-danger btn-rounded btn-sm my-0"
														onclick="location.href='/LTW_final/DeleteSP?spID=${item.getSpID()}'">
														Remove</button>
											</span></td>
										</tr>

									</c:forEach>

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
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>