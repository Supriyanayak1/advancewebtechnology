//java package(supriya140)
package com.maren.project1.controller;

import java.io.IOException;//importing all the classes from the packages(supriya140)
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.project1.dao.ProfileDao;
import com.maren.project1.model.Profile;


@WebServlet("/ProfileSaveCtrl")
public class ProfileSaveCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Profile profile140 = new Profile();//creating a new object profile of the class(supriya140)
		//the set method would set the value and get method will return the variable(supriya140)
		profile140.setUserid(request.getParameter("userid"));
		profile140.setName(request.getParameter("name"));
		profile140.setEmail(request.getParameter("email"));
		profile140.setMobile(Long.parseLong(request.getParameter("mobile")));//here long class is use parse the char sequence argument as a signed long with specified radix(supriya140)
		// save in database
		int res = new ProfileDao().save(profile140);
		request.setAttribute("RES", res);//to set the attribute
		request.getRequestDispatcher("/ProfileViewCtrl").forward(request, response);//getrequest dispatcher provides the facilities of dispatching the request to another resource i.e. servlet,jsp or html(supriya140)
	}

}
