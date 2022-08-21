package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloservlet2
 */
@WebServlet(
		urlPatterns = { 
				"/Helloservlet2", 
				"//blablaa", 
				"*.do"
		}, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.myql.cj.jdbc.Driver"), 
				@WebInitParam(name = "myfriend", value = "Abdullah")
		})
public class Helloservlet2 extends HttpServlet {
	@Override
		public void init(ServletConfig config) throws ServletException {
			String mydriver=config.getInitParameter("driver");
			String myfriend=config.getInitParameter("myfriend");
			System.out.println(mydriver+" : "+myfriend);
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
