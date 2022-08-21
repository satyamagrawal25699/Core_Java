package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ServletOutputStream out=response.getOutputStream();
		Object obj=session.getAttribute("count");
		if(obj==null) {
			out.println("<h1> Welcome for the first time </h1>");
			session.setAttribute("count", 1);
			
			
		}
		else {
			int c=Integer.parseInt(obj.toString());
			c++;
			out.println("<h1> You are visiting </h1>"+c+ "<h1>times</h1> ");
			session.setAttribute("count", c);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
