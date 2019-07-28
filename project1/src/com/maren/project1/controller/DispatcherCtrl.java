//java package(supriya140)
package com.maren.project1.controller;
//importing all the classes from the packages(supriya140)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherCtrl(supriya140)
 */
@WebServlet("/DispatcherCtrl")
public class DispatcherCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)(supriya140)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// configctrl is the url pattern of config ctrl sevlet(supriya140)
		//getrequest dispatcher provides the facilities of dispatching the request to another resource i.e. servlet,jsp or html(supriya140)
		request.getRequestDispatcher("/HelloCtrl").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(supriya140)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
