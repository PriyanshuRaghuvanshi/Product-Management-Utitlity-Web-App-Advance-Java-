package com.nagarro.servlets.authenticator;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nagarro.dao.UserDao;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		UserDao userdao = new UserDao();

		if (userdao.checkLogin(uname, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("Home.jsp");

//			request.setAttribute("username", uname);
//			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
//			rd.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			response.sendRedirect("LoginPage.jsp");
		}
	}
}
