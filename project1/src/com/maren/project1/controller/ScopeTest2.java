package com.maren.project1.controller;//java package(supriya140)

import java.io.IOException;//importing all the classes from the packages(supriya140)
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest2(supriya140)
 */
@WebServlet("/ScopeTest2")
public class ScopeTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(supriya140)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// sharing out data among resources(supriya140)
		String req=(String)request.getAttribute("request");//process current request(supriya140)
		String ses=(String)request.getSession().getAttribute("session");//return current request(supriya140)
		String app=(String)getServletContext().getAttribute("app");//http session contains a reference to servlet coontext that this sesion belong to the client(supriya140)
		PrintWriter out=response.getWriter();//returns a printwriter obj that can send char text to client(supriya140)
		out.println("req:"+req);
		out.println("sec:"+ses);
		out.println("application:"+app);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
