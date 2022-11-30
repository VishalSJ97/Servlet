package com.servlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyGoogleSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * The sendRedirect() method of HttpServletResponse interface can be used to redirect response to another resource,
	 * it may be servlet, jsp or html file.
	 * It accepts relative as well as absolute URL.
	 * It works at client side because it uses the url bar of the browser to make another request.
	 * So, it can work inside and outside the server.
	 * 
	 * Difference between forward() and sendRedirect() method
	 * 
	 * forward() method														sendRedirect() method
	 * The forward() method works at server side.							The sendRedirect() method works at client side.
	 * It sends the same request and response objects to another servlet.	It always sends a new request.
	 * It can work within the server only.									It can be used within and outside the server.
	 * Example:																Example: 
	 * request.getRequestDispacher("servlet2").forward(request,response);	response.sendRedirect("servlet2");
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");  
        response.sendRedirect("https://www.google.co.in/search?q="+name);  
    }  
}
