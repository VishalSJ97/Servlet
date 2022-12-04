package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DataSent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int sum = 0;
		
		sum = Integer.parseInt(request.getParameter("aaa"));
		sum *= sum;
		PrintWriter out = response.getWriter();
		out.println("RESULT IS :: "+sum);
	}

}
