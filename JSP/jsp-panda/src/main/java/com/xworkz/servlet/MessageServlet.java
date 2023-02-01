package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1, urlPatterns = "/msg")
public class MessageServlet extends HttpServlet {
	
       
     public MessageServlet() {
       System.out.println("Created " + this.getClass().getSimpleName());
     }
     
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in Message Servlet......");
		
		String to = req.getParameter("to");
		String from = req.getParameter("from");
		String message  = req.getParameter("message");
		
		System.out.println(to);
		System.out.println(from);
		System.out.println(message);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Message.jsp");
		req.setAttribute("to", to);
		req.setAttribute("from", from);
		req.setAttribute("message", message);
		
		
		dispatcher.forward(req, resp);
		
		
	}

}
