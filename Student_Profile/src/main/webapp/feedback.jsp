<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback form</title>
<%@include file="student_component/Navbar.jsp"%>
<%@include file="student_component/shotcut.jsp"%>

<script>
      function submitForm() {
        var nameInput = document.getElementById('name');
        var feedbackTypeSelect = document.getElementById('feedbackType');
        var feedbackMessageInput = document.getElementById('feedbackMessage');

        if (nameInput.value.trim() === '' || feedbackTypeSelect.value.trim() === '' || feedbackMessageInput.value.trim() === '') {
          alert('Please fill out all fields.');
          return false;
        }

        alert('Form submitted successfully!');
        return true;
      }
</script>
</head>
<body>
	<section class="container">
		<header>Feedback Form</header>
		<form action="#" class="form" id="registrationForm"
			onsubmit="return submitForm()">
			<div class="input-box">
				<label>Name</label> <input type="text" id="name"
					placeholder="Enter full name" />
			</div>
			<div class="input-box">
				<label>Feedback Type</label>
				<div class="select-box">
					<select id="feedbackType">
						<option value="" hidden>Select feedback type</option>
						<option value="Complaint">Complaint</option>
						<option value="Suggestion">Suggestion</option>
						<option value="Question">Question</option>
						<option value="Other">Other</option>
					</select>
				</div>
			</div>
			<div class="input-box">
				<label>Feedback Message</label>
				<textarea class="feedback-textarea" id="feedbackMessage"
					placeholder="Enter your feedback message" rows="4" cols="50"></textarea>
			</div>
			<button type="submit">Submit</button>
		</form>
	</section>
	 
</body>
</html>