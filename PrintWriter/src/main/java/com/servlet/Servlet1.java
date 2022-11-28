package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * When we use System.out.println this statement is used to print on the console
		 * not on the page so to use it on jsp or html page we use printwriter class
		 * 
		 * Java PrintWriter class is the implementation of Writer class. It is used to print the formatted representation of objects to the text-output stream.
		 * 
		 * DECLARATION
		 * public class PrintWriter extends Writer
		 * 
		 * PrintWriter pw = response.getWriter();
		 * 			OR
		 * PrintWriter pw = new PrintWriter("Filename.txt");
		 */
		
		//This will be printed on console
		System.out.println("Hello World");
		
		//this will be printed on the page
		PrintWriter out = response.getWriter();
		out.println("Hello World");
	}
}
