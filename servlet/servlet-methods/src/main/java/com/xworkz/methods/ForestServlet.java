package com.xworkz.methods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/animal")

public class ForestServlet extends HttpServlet{
	
	public ForestServlet() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in ForestSerblet...");
		String info = "We are upcoming developers..";
		PrintWriter writer = resp.getWriter();
		writer.print(info);
		resp.setContentType("text/plain");
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in ForestServlet..");
		String message = "Banglore is a silicon city..";
		PrintWriter writer = resp.getWriter();
		writer.print(message);
		resp.setContentType("text/plain");
	}
	
	@Override
	public void destroy() {
		System.out.println("running destroy in ForestServlet.. ");
	}
	
	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running doTrace in ForestServlet...");
	}
	
	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running doOptions in ForestServlet..");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPut method in ForestServlet...");
		String msg = "Our trainers are very inteligent";
		PrintWriter writer = resp.getWriter();
		writer.print(msg);
		resp.setContentType("text/plain");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init of ForestServlet");
	}
	
	
}
