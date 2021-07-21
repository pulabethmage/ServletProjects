package com.appbrewery;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pr = resp.getWriter();
		
		////ServletContext is available for all servlets
		ServletContext ctx = getServletContext();
		String packagename = ctx.getInitParameter("packagename");
		
	////ServletConfig is only for params initiated inside the servlet tag, it is only available for specific servlet
		ServletConfig servconfig = getServletConfig();
		String  name = servconfig.getInitParameter("name");
		
		pr.println("My name is :"+name+"  , Package Name is : "+ packagename);
		
		
	}

}
