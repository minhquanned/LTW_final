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
<link rel="stylesheet" href="CSS/index.css">
<title>Test</title>
</head>
<body>
	<div class="container mt-5">
		<input class="btn btn-primary btn-rounded btn-sm my-0"
			data-bs-toggle="modal" data-bs-target="#myModal" type="button"
			value="More Info">
		<div class="modal" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Subject Info</h5>
						<input class="btn-close"
							type="button" data-bs-dismiss="modal">
					</div>
					<div class="modal-body">
						<label class="form-lable">Subject ID:</label><br> <label
							class="form-lable">Subject Name:</label><br> <label
							class="form-lable">Number of credits:</label><br>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-danger"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--
	<c:forEach var="i" begin="1" end="5">
         Item <c:out value="${i}" />
		<p>
	</c:forEach>
	-->
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>