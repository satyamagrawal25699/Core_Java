package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Helloservlet")
public class Helloservlet extends HttpServlet {
	
   
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		//System.out.println("Name is.."+name);
		//response.setContentType("text/html");
		//ServletOutputStream out=response.getOutputStream();
		//out.println("<h1>Name is...."+name+"</h1>");
		
		
		if(name.equals("Rahim")) {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
			rd.forward(request, response);
			
			
		}
		else {
			//response.sendRedirect("Register.html");
			RequestDispatcher rd=request.getRequestDispatcher("Register.html");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
