package org.mani.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    
    private String message; 
    public void init() throws ServletException { 
    	message = "Hello Manikanta! Welcome to Servlets"; 
    } 

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html"); 
		out.print("<html><body>");  
		out.print("<h1>Hello Manikanta! Welcome to Servlets</h1>"); 
		out.print("</body></html>");
		String userAgent = request.getHeader("User-Agent");
		System.out.println(response.getBufferSize());
		if (userAgent.contains("MSIE")){
			response.sendRedirect("http://www.google.com");
			System.out.println(response.getStatus());
		} else {
			response.sendRedirect("http://www.fb.com");
			System.out.println(response.getStatus());
		}


	}

}
