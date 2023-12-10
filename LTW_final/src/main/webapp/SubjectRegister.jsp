<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="index.css">
<title>Subject Registration</title>
</head>
<body>
<section class="vh-100 bg-secondary bg-gradient gradient-custom">
  <div class="container py-5 h-100">
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Subject Registration</h3>
            <form>
            
              <div class="row">
                <div class="col-md-6 mb-4">

                  <div class="form-outline">
                    <label class="form-label" for="lecturerID">Subject ID</label>
                    <input type="text" id="lecturerID" class="form-control form-control-lg" />
                  </div>

                </div>
                
                <div class="col-md-6 mb-4">

                  <div class="form-outline">
                    <label class="form-label" for="subjectName">Subject Name</label>
                    <input type="text" id="subjectName" class="form-control form-control-lg" />
                  </div>

                </div>
              </div>

              <div class="row">
                <div class="col-md-6 mb-4 pb-2">
                  <div>

	                 <label class="form-label select-label">Number of credits</label><br>
	                 <select class="select form-control-lg">
	                   <option value="0" disabled>Choose option</option>
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
                <input class="btn btn-primary btn-lg" type="submit" value="Submit" />
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