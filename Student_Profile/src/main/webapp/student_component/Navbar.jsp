<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>navbar</title>
<%@include file="shotcut.jsp"%>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">College</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
       </ul>
      <form class="d-flex">
        <button class="btn btn-outline-danger " type="submit"><a href="#" style="text-decoration: none; color: red;">Login</a></button>
        <button class="btn btn-outline-success ms-3" type="submit"><a style="text-decoration: none;" href="signup.jsp">Registration</a></button>
      </form>
    </div>
  </div>
</nav>



</body>
</html>