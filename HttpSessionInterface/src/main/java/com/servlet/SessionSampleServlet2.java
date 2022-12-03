package com.servlet;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionSampleServlet2 extends HttpServlet {	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        HttpSession session=request.getSession(false);
	        String n=(String)session.getAttribute("uname");
	        out.print("Hello "+n);

	        out.close();

        } catch (Exception e) {
        	System.out.println(e);
    	}
	}
}
