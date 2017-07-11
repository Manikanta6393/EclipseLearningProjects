package org.mani.sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendRedirectServlet
 */
@WebServlet("/SendRedirectServlet")
public class SendRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendRedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String name = request.getParameter("username");
		   String password = request.getParameter("pwd");
		    if(name.equalsIgnoreCase("Mani")&& password.equalsIgnoreCase("Mani")){
		      //response.sendRedirect("LoginServlet");
		    	request.setAttribute("Name", "Manikanta");
		    	RequestDispatcher rd= request.getRequestDispatcher("LoginServlet");
		        rd.include(request, response);
		        PrintWriter out = response.getWriter();
				 out.println("Manikanta");
		    }
		    else{
		      response.sendError(HttpServletResponse.SC_NOT_FOUND, "Invalid  Username and password");
		    }

	}

}
