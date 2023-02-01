package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/details")
public class PersonServlet extends HttpServlet {
	
    public PersonServlet() {
        System.out.println("Created " + this.getClass().getSimpleName());
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in PersonServlet...");
		
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String reason = req.getParameter("reason");
		
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(reason);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		req.setAttribute("fname", firstName);
		req.setAttribute("lname", lastName);
		req.setAttribute("gender", gender);
		req.setAttribute("address", address);
		req.setAttribute("reason", reason);
		
		
		
		dispatcher.forward(req, resp);
	}
	
	

}
