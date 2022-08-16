package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	       
   
    public LifeCycleServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("init() of Servlet ");
	}

	public void destroy() {
		System.out.println("Destroy() of Servlet ");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); //gives output on browser and can apply html
		response.setContentType("text/html");
		out.println("<h1>Service() of Servlet </h1>");
		out.println("<h2>Service() of Servlet </h2>");
		out.println("<h3>Service() of Servlet </h3>");
		out.println("<h4>Service() of Servlet </h4>");
		out.println("<h5>Service() of Servlet </h5>");
		
		//	System.out.println("Service() of Servlet ");
	}

}
