<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.nagarro.entities.Product"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

	if (session.getAttribute("username") == null) {
		response.sendRedirect("LoginPage.jsp");
		return;
	}

	String title = request.getParameter("title");
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class)
			.buildSessionFactory();
	Session session2 = factory.openSession();
	session2.beginTransaction();
	Query searchQuery = session2.createQuery("from Product where title=:title");
	searchQuery.setParameter("title", title);
	Product product = (Product) searchQuery.uniqueResult();

	byte[] img = product.getImage();

	response.setContentType("image/gif");
	OutputStream os = response.getOutputStream();
	os.write(img);
	os.flush();
	os.close();
	session2.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hey
</body>
</html>