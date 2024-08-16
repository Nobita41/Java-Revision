package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Registration_dao;
import com.entity.Student_registration;

/**
 * Servlet implementation class registration_servlet
 */
@WebServlet("/registration_servlet")
public class registration_servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("name");
		String fname=request.getParameter("fname");
		String mname= request.getParameter("mname");
		String branch= request.getParameter("branch");
		String adharnumber= request.getParameter("adharnumber");
		String gender = request.getParameter("gender");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Student_registration regis = new Student_registration(adharnumber, name, fname, mname, branch, gender, email, password,"normal");
		Registration_dao rd = new Registration_dao();
		
	int  status=rd.Student_registratiom(regis);
		if(status>0) {
			request.setAttribute("msg", "Registration Successfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}
		else {
			request.setAttribute("msg", "Registration Failed");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/signup.jsp");
			dispatcher.forward(request, response);
			
		}
		
	}

}
