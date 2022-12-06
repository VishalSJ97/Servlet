# Servlet
Servlet codes
In this repository I will be using basic which will be required through out the servlet
Starting with
1. PrintWriter

When we use System.out.println this statement is used to print on the console not on the page so to use it on jsp or html page we use printwriter class
Java PrintWriter class is the implementation of Writer class. It is used to print the formatted representation of objects to the text-output stream.

DECLARATION
public class PrintWriter extends Writer

PrintWriter pw = response.getWriter();
			OR
PrintWriter pw = new PrintWriter("Filename.txt");


2. Request Dispatcher

The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp. 
This interface can also be used to include the content of another resource also. 
It is one of the way of servlet collaboration.
There are two methods defined in the RequestDispatcher interface.

a. include method
public void forward(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException
	Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.

b. forward method
public void include(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException
	Includes the content of a resource (servlet, JSP page, or HTML file) in the response.


3. sendRedirect

The sendRedirect() method of HttpServletResponse interface can be used to redirect response to another resource,
it may be servlet, jsp or html file.
It accepts relative as well as absolute URL.
It works at client side because it uses the url bar of the browser to make another request.
So, it can work inside and outside the server.

Difference between forward() and sendRedirect() method

forward() method							sendRedirect() method
The forward() method works at server side.				The sendRedirect() method works at client side.
It sends the same request and response objects to another servlet.	It always sends a new request.
It can work within the server only.					It can be used within and outside the server.
Example:								Example: 
request.getRequestDispacher("servlet2").forward(request,response);	response.sendRedirect("servlet2");


4. Cookies

A cookie is a small piece of information that is persisted between the multiple client requests.
A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age and a version number.

	1. Request
Browser	2. Response + Cookie   Server
	3. Request + Cookie
 
Types of Cookies
    a. Non-persistent cookie
	It is valid for single session only.
	It is removed each time when user closes the browser.
    b. Persistent cookie
 	It is valid for multiple session.
 	It is not removed each time when user closes the browser.
 	It is removed only if user logout or signout.
 
How to create Cookie?
Cookie ck=new Cookie("user","sonoo jaiswal");
response.addCookie(ck);

How to delete Cookie?
Cookie ck=new Cookie("user","");//deleting value of cookie
ck.setMaxAge(0);//changing the maximum age to 0 seconds
response.addCookie(ck);//adding cookie in the response  
 
How to get Cookies?
```Cookie ck[]=request.getCookies();  
for(int i=0;i<ck.length;i++){  
	out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
}
```

5. HttpSession

In such case, container creates a session id for each user.
The container uses this id to identify the particular user.
An object of HttpSession can be used to perform two tasks:
1. bind objects
2. view and manipulate information about a session, such as the session identifier, creation time, and last accessed time. 

getting HTTPSession object
public HttpSession getSession():
	Returns the current session associated with this request, or if the request does not have a session, creates one.
public HttpSession getSession(boolean create):
	Returns the current HttpSession associated with this request or, if there is no current session and create is true,
 	returns a new session.

Commonly used methods of http Session interface
public String getId():
	Returns a string containing the unique identifier value.
public long getCreationTime():
	Returns the time when this session was created, measured in milliseconds since midnight January 1, 1970 GMT.
public long getLastAccessedTime():
	Returns the last time the client sent a request associated with this session,
	as the number of milliseconds since midnight January 1, 1970 GMT.
public void invalidate():
	Invalidates this session then unbinds any objects bound to it.
    
    
6. Url Rewriting

In URL rewriting, we append a token or identifier to the URL of the next Servlet or the next resource. 
We can send parameter name/value pairs using the following format:
url?name1=value1&name2=value2&??
A name and a value is separated using an equal = sign, 
a parameter name/value pair is separated from another parameter using the ampersand(&).
When the user clicks the hyperlink, the parameter name/value pairs will be passed to the server.
From a Servlet, we can use getParameter() method to obtain a parameter value.

Advantage of URL Rewriting
	It will always work whether cookie is disabled or not (browser independent).
	Extra form submission is not required on each pages.

Disadvantage of URL Rewriting
	It will work only with links.
	It can send Only textual information.
