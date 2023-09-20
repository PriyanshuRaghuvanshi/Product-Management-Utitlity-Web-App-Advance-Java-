package com.nagarro.servlets.authenticator;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nagarro.dao.RegisterDao;

@WebServlet("/Register")
public class RegisterUserServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		RegisterDao register = new RegisterDao();
		if (register.registerUser(uname, pass)) {
			response.sendRedirect("LoginPage.jsp");
			return;
		}
		response.sendRedirect("RegisterPage.jsp");

	}

}
