//java package(supriya140)
package com.maren.project1.controller;
//importing all the classes from the packages(supriya140)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParametersCtrl(supriya140)
 */
@WebServlet("/ParametersCtrl")
public class ParametersCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(supriya140)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// retrive request parameter(supriya140)
		String name=request.getParameter("txtname");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();//returns a printwriter object that can send character text to the client(supriya140)
		out.append("<b> Name <b>"+name);//name and password would simply print(supriya140)
		out.append("<b> Password <b>"+pass);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
