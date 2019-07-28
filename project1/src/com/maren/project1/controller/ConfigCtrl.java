//java package(supriya140) 
package com.maren.project1.controller;

import java.io.IOException;//importing all the classes from the packages(supriya140)

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigCtrl(supriya140)
 */
@WebServlet(
		urlPatterns = { "/ConfigCtrl" }, 
		initParams = { 
				@WebInitParam(name = "univ", value = "cutm"), //initialisation of parameters(supriya140)
				@WebInitParam(name = "loc", value = "bbsr")
		})
public class ConfigCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
		//gets the values of initialization parameter with the given name(supriya140)
		String univ=config.getInitParameter("univ");
		String loc=config.getInitParameter("loc");
	response.getWriter().append("university is:"+univ+"at:"+loc);//to print the content(supriya140)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(supriya140)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
