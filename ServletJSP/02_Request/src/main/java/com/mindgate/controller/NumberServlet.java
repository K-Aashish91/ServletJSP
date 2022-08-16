package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String choice = request.getParameter("operation");
		PrintWriter out = response.getWriter();

		switch (choice) {
		case "add":
			
			int add = (num1 + num2);
			out.println("Addition of " + num1 + " & " + num2 + " is " + add);
			
			break;

		case "sub":

			int substract = (num1 - num2);
			out.println("Substraction of " + num1 + " & " + num2 + " is " + substract);

			break;

		}

	}

}
