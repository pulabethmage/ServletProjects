package com.appbrewery;

import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter pw = res.getWriter();
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int total = i+j;
		
		pw.println("Total is :"+ total);

	}
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter pw = res.getWriter();
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int total = i+j;
		
		pw.println("Total is :"+ total);

	}

}
