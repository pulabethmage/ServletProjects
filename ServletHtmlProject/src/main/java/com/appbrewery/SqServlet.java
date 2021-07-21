package com.appbrewery;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		//int total = (int)req.getAttribute("total");
		//total = total * total;
		//PrintWriter pw = res.getWriter();
		//pw.println("Total Sq is :" + total);
		
		//int total = Integer.parseInt(req.getParameter("total"));
		
		
		////Session
			//HttpSession session  = req.getSession();
			//int total = (int)session.getAttribute("total");
		
		
		////Cookies
		int total = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies)
		{
			if(c.getName().equals("total"))
				total =  Integer.parseInt(c.getValue());
		}
		
		total = total * total;
		
		PrintWriter pw = res.getWriter();
		pw.println("Total Sq is :" + total);
		
		
	}

}
