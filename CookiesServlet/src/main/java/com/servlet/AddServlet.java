package com.servlet;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;

	/** 
	 * A cookie is a small piece of information that is persisted between the multiple client requests.
	 * A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age
	 * and a version number.
	 * 
	 * 			1. Request
	 * Browser	2. Response + Cookie   Server
	 * 			3. Request + Cookie
	 * 
	 * Types of Cookies
	 * 1. Non-persistent cookie
	 * 		It is valid for single session only.
	 * 		It is removed each time when user closes the browser.
	 * 2. Persistent cookie
	 * 		It is valid for multiple session.
	 * 		It is not removed each time when user closes the browser.
	 * 		It is removed only if user logout or signout.
	 * 
	 * How to create Cookie?
	 * Cookie ck=new Cookie("user","sonoo jaiswal");
	 * response.addCookie(ck);
	 * 
	 * How to delete Cookie?
	 * Cookie ck=new Cookie("user","");//deleting value of cookie
	 * ck.setMaxAge(0);//changing the maximum age to 0 seconds
	 * response.addCookie(ck);//adding cookie in the response  
	 * 
	 * How to get Cookies?
	 * Cookie ck[]=request.getCookies();  
	 * for(int i=0;i<ck.length;i++){  
	 * 		out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
	 * }
	 */
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = num1 + num2;
		
		Cookie cookie = new Cookie("sum", sum+"");
		response.addCookie(cookie);
		response.sendRedirect("sqServlet");
	}
	
}
