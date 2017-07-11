package org.mani.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mani.beans.BankCustomer;
import org.mani.logics.BankCustomerLookup;

/**
 * Servlet implementation class ShowBalance
 */
@WebServlet("/ShowBalance")
public class ShowBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBalance() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BankCustomer currentCustomer = BankCustomerLookup.getCustomer(request.getParameter("id"));
		request.setAttribute("customer", currentCustomer);
		String address="";
		if(currentCustomer == null){
			address = "/WEB-INF/bank-account/unknown-customer.jsp";
		}else
		if(currentCustomer.getBalance()<0){
			address = "/WEB-INF/bank-account/negative-balance.jsp";
		}else
		if(0< currentCustomer.getBalance() && currentCustomer.getBalance()<1000){
				address = "/WEB-INF/bank-account/normal-balance.jsp";
		}else
		if(currentCustomer.getBalance()>1000){
				address = "/WEB-INF/bank-account/high-balance.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
		
	}

}
