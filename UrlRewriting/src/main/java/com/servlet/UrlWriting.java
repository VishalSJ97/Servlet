package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UrlWriting extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * In URL rewriting, we append a token or identifier to the URL of the next Servlet or the next resource. 
	 * We can send parameter name/value pairs using the following format:
	 * url?name1=value1&name2=value2&??
	 * A name and a value is separated using an equal = sign, 
	 * a parameter name/value pair is separated from another parameter using the ampersand(&).
	 * When the user clicks the hyperlink, the parameter name/value pairs will be passed to the server.
	 * From a Servlet, we can use getParameter() method to obtain a parameter value.
	 * 
	 * Advantage of URL Rewriting
	 * 	It will always work whether cookie is disabled or not (browser independent).
	 * 	Extra form submission is not required on each pages.
	 * 
	 * Disadvantage of URL Rewriting
	 * 	It will work only with links.
	 * 	It can send Only textual information.
	 */
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = num1 + num2;

		response.sendRedirect("servlet1?aaa="+sum);
	}
}
