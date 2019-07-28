package com.maren.project1.controller;//java package(supriya140)

//importing all the classes from the packages(supriya140)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeCtrl
 */
@WebServlet("/ScopeCtrl")
public class ScopeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TO set a value
		request.setAttribute("request", "requestscope");
		//get session has access toget and dopost method and set the value of session,request,application
		request.getSession().setAttribute("session", "session scope");
		request.getSession().setAttribute("session", "session scope");
		request.getSession().setAttribute("app", "application scope");
		//getrequestdispatcher provides the facility of dispatching the request to another resource i.e. servlet or html(supriya140)
		request.getRequestDispatcher("/ScopeTest2").forward(request, response);
		response.getWriter().append("served at:").append(request.getContextPath());//returns a printwriter object that can send char text to the client(supriya140)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)(supriya140)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
