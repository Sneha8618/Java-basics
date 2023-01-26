package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/series")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Running doGet method in WebSeries....");
		
		String name = req.getParameter("name");
		String lang = req.getParameter("language");
		String episodes = req.getParameter("episodes");
	    String ott = req.getParameter("ott");
	    String budget = req.getParameter("budget");
	    
	    System.out.println(name);
	    System.out.println(lang);
	    System.out.println(episodes);
	    System.out.println(ott);
	    System.out.println(budget);
	    
	    PrintWriter writer = resp.getWriter();
	    writer.print("<html");
	    writer.print("<body>");
	    writer.print("<h1>");
	    writer.print("<span style = 'color : blue';>");
	    writer.print("Web Series infomation send successfully....");
	    writer.print("</span>");
	    writer.print("</h1>");
	    writer.print("</body>");
	    writer.print("</html");
	    resp.setContentType("text/html");
	}

}
