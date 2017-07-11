package org.mani.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloForm
 */
@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html"); 
		out.println( "<ul>\n" +
                "  <li><b>Maths Flag : </b> " + request.getParameter("Maths") + "\n" +
                "  <li><b>Physics Flag: </b> "+ request.getParameter("Physics") + "\n" +
                "  <li><b>Chemistry Flag: </b> "+ request.getParameter("Chemistry") + "\n" +
                "  <li><b>Dropdown Value: </b> "+ request.getParameter("Dropdown") + "\n" +
                 "</ul>\n");
		//response.sendRedirect("http://www.google.com");


	}

}
