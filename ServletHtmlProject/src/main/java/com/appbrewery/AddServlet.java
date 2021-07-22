package com.appbrewery;

import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//This is a anotation and it helps to call the servlet without the xml file
@WebServlet("/add")

public class AddServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter pw = res.getWriter();
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int total = i+j;
		
		pw.println("Total is :"+ total);

	}
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter pw = res.getWriter();
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int total = i+j;
		
		////Cookies
			Cookie cookie = new Cookie("total",total+ "");
			res.addCookie(cookie);			
			res.sendRedirect("sq");
		
		/////Sessions
			//HttpSession session = req.getSession();
			//session.setAttribute("total", total);
			//res.sendRedirect("sq");
		
		
		/////URL Rewriting
			//res.sendRedirect("sq?total="+total);
		
		//////Request Dispatcher technique					
			//req.setAttribute("total", total);				
			//RequestDispatcher rd = req.getRequestDispatcher("sq");
			//rd.forward(req, res);					
			//pw.println("Total is :"+ total);

	}

}
