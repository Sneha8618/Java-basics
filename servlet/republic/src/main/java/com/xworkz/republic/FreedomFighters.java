package com.xworkz.republic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/freedom")
public class FreedomFighters extends HttpServlet{
	
	public FreedomFighters() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	   System.out.println("Running doGet in FreedomFighters....");
	   String name = req.getParameter("fighterName");
	   String alive = req.getParameter("alive");
	   String mode = req.getParameter("mode");
	   String weapon = req.getParameter("weapon");
	   
	   System.out.println(name);
	   System.out.println(alive);
	   System.out.println(mode);
	   System.out.println(weapon);
	   
	   PrintWriter writer = resp.getWriter();
	   writer.print("<html>");
	   writer.print("<body>");
	   writer.print("<h1>");
	   writer.print("<span style = 'color : green;'>");
	   writer.print("Freedom fighter " + name + " is send succefully");
	   writer.print("</span>"); 
	   writer.print("</h1>");
	   writer.print("</body>");
	   writer.print("</html>");
	   resp.setContentType("text/html");
	   
	   
	}
	
	@Override
	public void destroy() {
		System.out.println("Running destroy in FreedomFighter....");
		super.destroy();
	}

}
