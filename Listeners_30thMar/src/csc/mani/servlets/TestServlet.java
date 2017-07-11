package csc.mani.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletContext sc=getServletContext();
		System.out.println("Setting a context Attribute with name: att1");
		sc.setAttribute("att1","att1value");
		System.out.println("\nSetting a context Attribute with name: att2");
		sc.setAttribute("att2","att2value");
		System.out.println("\nSetting a context Attribute with name: att1");
		System.out.println("An attribute with a name att1 exists in context and is now replaced");
		sc.setAttribute("att1","newvalue");
		System.out.println("\nremoving an Attribute with name: att1");
		sc.removeAttribute("att1");
		System.out.println("\nRemoving an Attribute with name: att2 using setAttrbute method");
		sc.setAttribute("att2",null);
		response.getWriter().println("Look into the tomcat server console for output");
	}}
