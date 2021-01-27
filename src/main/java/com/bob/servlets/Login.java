package com.bob.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bob.dao.LoginDao;

@WebServlet("/login")
public class Login extends HttpServlet {
	LoginDao dao =new LoginDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String password = request.getParameter("password");
		
		try {
			if(dao.verifyCredentials(uname, password)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", uname);
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("index.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


