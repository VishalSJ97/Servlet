package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int sum = 0;
		Cookie[] cookie = request.getCookies();
		for(Cookie c : cookie) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		sum *= sum;
		PrintWriter out = response.getWriter();
		out.println("RESULT OF SQUARE IS :: "+sum);
	}	
}
