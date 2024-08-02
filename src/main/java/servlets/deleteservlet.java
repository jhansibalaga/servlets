package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.studentdb;
import services_dao.studentservice_dao;

@WebServlet("/delete")
public class deleteservlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id")); // it don't support the integers so, we have to typecast it
		
		studentservice_dao service = new studentservice_dao(studentdb.getconnection()); // first 2 jdbc connections are written in studentdb and another 2 connections are written in services so,by connecting these two we get all jdbc connections so,to perform all jdbc connections we add this line here
		
		service.delbyid(id); //importing delbyid method which we create before in sevices to perform delete operation
		boolean f = false;
		
		if(f) {
			resp.sendRedirect("welcome.jsp");
		}
		else {
			resp.sendRedirect("welcome.jsp");
		}
	}

	
	}


