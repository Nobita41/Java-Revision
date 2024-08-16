package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name= request.getParameter("email");
		String pass= request.getParameter("password");
		HttpSession hs= request.getSession();
		if(name.equals("raj@gmail.com" )&& pass.equals("raj123")) {
			
			hs.setAttribute("msg", "raj Sharma");
			RequestDispatcher dispatcher=request.getRequestDispatcher("profile.jsp");
			dispatcher.forward(request, response);
		}
		else {
			out.println("Email password not matched");
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.include(request, response);
		}
	}

}
