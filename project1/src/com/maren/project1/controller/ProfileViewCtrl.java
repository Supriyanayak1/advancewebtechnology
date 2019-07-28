//java package(supriya140)
package com.maren.project1.controller;

import java.io.IOException;//importing all the classes from the packages(supriya140)
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.project1.dao.ProfileDao;
import com.maren.project1.model.Profile;

@WebServlet("/ProfileViewCtrl")
public class ProfileViewCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {//request to get a value(supriya140)
		int res = (int) request.getAttribute("RES");//added cast to int(supriya140)
		PrintWriter out = response.getWriter();//returns a printwriter obj that can send char text to the client(supriya40)
		if (res == 0)//business logic
			//to output text to the console out.println prints the string and moves too next line(supriya140)
			out.println("There is some problem ,  Try again .");
		else
			out.println("Data Successfully inserted");
		
		out.print(" <br/> The Datas are");
		//fetches all remaining row in the result set(supriya140)
		List<Profile> list = new ProfileDao().fetchAll();
		//iterator enables the programmer to traverse tthe container particularly lists(supriya140)
		for(Iterator<Profile> iterator=list.iterator();iterator.hasNext();) 
		{
			Profile profile140=(Profile) iterator.next();
			out.println("Name :"+profile140.getName() +"userid" +profile140.getUserid()+"mobile :"+profile140.getMobile());
		} 
}}