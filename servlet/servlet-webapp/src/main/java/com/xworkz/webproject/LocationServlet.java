package com.xworkz.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/loc")
public class LocationServlet extends HttpServlet {
	
	public LocationServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in LocationServlet....");
		
	    String name = req.getParameter("name");
	    String email = req.getParameter("email");
	    String startPoint = req.getParameter("startPoint");
	    String destination = req.getParameter("destination");
	    String gender = req.getParameter("gender");
	    
	    System.out.println(name);
	    System.out.println(email);
	    System.out.println(startPoint);
	    System.out.println(destination);
	    System.out.println(gender);
	    
	    PrintWriter writer = resp.getWriter();
	    writer.print("<html>");
	    writer.print("<body>");
	    writer.print("<h1>");
	    if(name.length() > 3) {
		       writer.print("<span style = 'color : green';>");
		       writer.print("Sign up successfull : " + name);
		    }
		    else {
		    	writer.print("<span style = 'color : red';>");
			    writer.print("Invalid name : " + name);
		    }
		writer.print("<pre>");    
		writer.print("<a href = 'location.html'> Send agin </a1>");
		writer.print("</pre>"); 
		writer.print("<pre>"); 
	    writer.print("<a href = 'index.html'> Home page </a1>");
	    writer.print("</pre>"); 
	    writer.print("</span>");
	    writer.print("</h1>");
	    writer.print("</body>");
	    writer.print("</html>");
	    resp.setContentType("text/html");
	}

}
