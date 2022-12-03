package com.servlet;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionSampleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * In such case, container creates a session id for each user.
	 * The container uses this id to identify the particular user.
	 * An object of HttpSession can be used to perform two tasks:
	 * 1. bind objects
	 * 2. view and manipulate information about a session, such as the session identifier, creation time, and last accessed time.
	 * 
	 * 
	 * getting HTTPSession object
	 * public HttpSession getSession():
	 * 	Returns the current session associated with this request, or if the request does not have a session, creates one.
	 * public HttpSession getSession(boolean create):
	 * 	Returns the current HttpSession associated with this request or, if there is no current session and create is true,
	 * 	returns a new session.
	 * 
	 * Commonly used methods of http Session interface
	 * public String getId():
	 * 	Returns a string containing the unique identifier value.
	 * public long getCreationTime():
	 * 	Returns the time when this session was created, measured in milliseconds since midnight January 1, 1970 GMT.
	 * public long getLastAccessedTime():
	 * 	Returns the last time the client sent a request associated with this session,
	 * 	as the number of milliseconds since midnight January 1, 1970 GMT.
	 * public void invalidate():
	 * 	Invalidates this session then unbinds any objects bound to it.
	 */
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{  
		try
		{
			response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        String n=request.getParameter("userName");
	        out.print("Welcome "+n);
	        HttpSession session=request.getSession();
	        session.setAttribute("uname",n);
	        out.print("<a href='servlet2'>visit</a>");
	        out.close();
        } catch(Exception e) {
        	System.out.println(e);
    	}
    }
}
