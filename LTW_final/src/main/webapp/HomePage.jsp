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
<link rel="stylesheet" type="text/css" href="CSS/index.css">
<title>Home</title>
</head>
<body>
	<section class="vh-100 bg-secondary bg-gradient gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<h3 class="mb-4 pb-2 pb-md-0 mb-md-5 text-center">Home</h3>
							<form class="d-flex justify-content-md-around" method="post">

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-lg" type="button"
										value="Subjects" data-action="SubjectServlet" />
								</div>

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-lg" type="button"
										value="Lecturers" onclick="location.href='Lecturers.jsp'" />
								</div>

								<div class="mt-4 pt-2">
									<input class="btn btn-primary btn-lg" type="button"
										value="Students" onclick="location.href='Students.jsp'" />
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