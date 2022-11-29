package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp. 
		 * This interface can also be used to include the content of another resource also. 
		 * It is one of the way of servlet collaboration.
		 * There are two methods defined in the RequestDispatcher interface.
		 * 
		 * public void forward(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException
		 * 	Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
		 * public void include(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException
		 * 	Includes the content of a resource (servlet, JSP page, or HTML file) in the response.
		 */
		
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(n.equals("admin") && p.equals("admin123")){  
	        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
	        rd.forward(request, response);  
	    } else {  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
	        rd.include(request, response);
        }  
    }		  
}
