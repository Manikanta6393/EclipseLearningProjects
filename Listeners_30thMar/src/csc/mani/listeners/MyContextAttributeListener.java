package csc.mani.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyContextAttributeListener
 *
 */
@WebListener
public class MyContextAttributeListener implements ServletContextAttributeListener {

	/**
	 * Default constructor. 
	 */
	public MyContextAttributeListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent sce) {
		System.out.println("Context attribute Added");
		System.out.println("Name : "+ sce.getName());
		System.out.println("Value : "+ sce.getValue());
	}
	public void attributeReplaced(ServletContextAttributeEvent sce) {
		System.out.println("Context attribute Replaced");
		System.out.println("Name : "+ sce.getName());
		System.out.println("Old Value : "+ sce.getValue());
		ServletContext sc=sce.getServletContext();
		System.out.println("New Value : "+ sc.getAttribute(sce.getName()));
	}
	public void attributeRemoved(ServletContextAttributeEvent sce) {
		System.out.println("Context attribute removed");
		System.out.println("Name : "+ sce.getName());
		System.out.println("Value : "+ sce.getValue());
		ServletContext sc=sce.getServletContext();
		System.out.println("New Value : "+ sc.getAttribute(sce.getName()));
	}

}
