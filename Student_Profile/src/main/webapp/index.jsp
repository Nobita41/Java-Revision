<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<%@include file="student_component/Navbar.jsp"%>
<%@include file="student_component/shotcut.jsp"%>
</head>
<body>
	<form >
		<div class="container mt-5 pt-5">
			<div class="row">
				<div class="col-12 col-sm-8 col-md-6 m-auto ">
					<div class="card">
						<div class="card-body">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control"
									id="exampleInputPassword1">
							</div>
							
							<div class="text-center ">
								<button type="submit" class="btn btn-primary ">Submit</button><br>
								<label class="form-check-label" for="exampleCheck1">
										 <a style="text-decoration: none" href="signup.jsp">If you are not register then Click
											me.....</a>
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