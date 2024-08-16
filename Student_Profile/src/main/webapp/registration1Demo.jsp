<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration1 Demo</title>
<%@include file="/student_component/Navbar.jsp"%>
<%@include file="/student_component/shotcut.jsp"%>
</head>
<body>
<%
String message= (String)request.getAttribute("msg");

%>
<form action="registrationServlet" method="post">
		<div class="container mt-5 pt-5">
			<div class="row">
				<div class="col-12 col-sm-8 col-md-6 m-auto ">
					<div class="card">
						<div class="card-body">
							<h3 style="text-align: center;">Registration Demo Again</h3>
							<div class="mb-1">
								<label for="exampleInputEmail1" class="form-label">Your
									Name </label> <input type="text" name="name" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>


							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Father's
									Name </label> <input type="text" name="fname" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>

							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Mother's
									Name </label> <input type="text" name="mname" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Bother
									Name </label> <input type="text" name="bname" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Sister
									Name </label> <input type="text" name="sname" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
							</div>
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Your
									branch</label> <input type="text" class="form-control"
									id="exampleInputEmail1" name="branch" aria-describedby="emailHelp">

							</div>
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Adhar
									Card Number</label> <input type="text" class="form-control"
									id="exampleInputEmail1" name="adharnumber" aria-describedby="emailHelp"> 
							</div>
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">States</label> <input type="text" class="form-control"
									id="exampleInputEmail1" name="States" aria-describedby="emailHelp"> 
							</div>
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Pin code</label> <input type="text" class="form-control"
									id="exampleInputEmail1" name="pin" aria-describedby="emailHelp"> 
							</div>
							
							<div class="mb-2">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input name="email" type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">

							</div>


							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" name="password" class="form-control"
									id="exampleInputPassword1">
							</div>

							<div class="text-center ">
								<button type="submit" class="btn btn-primary ">Submit</button>
								<button type="reset" class="btn btn-danger ">Reset</button>
								<br> <label class="form-check-label" for="exampleCheck1">
									<a style="text-decoration: none" href="index.jsp">You have
										already account then Click me.....</a>
								</label>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</form>

	
</body>
</html>