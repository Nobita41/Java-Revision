package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDemoDao;
import com.entity.RegistrationDemo;

/**
 * Servlet implementation class registrationServlet
 */
@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		
		String name= request.getParameter("name");
		String fname= request.getParameter("fname");
		String mname= request.getParameter("mname");
		String bname= request.getParameter("bname");
		String sname= request.getParameter("sname");
		String branch= request.getParameter("branch");
		String adharnumber= request.getParameter("adharnumber");
		String States= request.getParameter("States");
		String pin= request.getParameter("pin");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		// Object of registrationDemo Entites
		RegistrationDemo rd = new RegistrationDemo(name, fname, mname, bname, sname, branch, adharnumber, States, pin, email, password);
		
		
		// Object of Registration Demo 
		RegistrationDemoDao rdd= new RegistrationDemoDao();
		
		int status=rdd.registration(rd);
		if(status>0) {
			request.setAttribute("msg", "Registration Successfully");
			 dispatcher = request.getRequestDispatcher("/index.jsp");
			 
			dispatcher.forward(request, response);
		}}

}
