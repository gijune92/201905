package com.java0507;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main8")
public class Main8 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		System.out.println(request.getPathInfo());
		System.out.println(request.getProtocol());
		System.out.println(request.getContextPath());
		System.out.println(request.getLocalPort());
		System.out.println(request.getServerPort());
		System.out.println(request.getServletPath());
		System.out.println(request.getContentType());
		
		PrintWriter pw = response.getWriter();

		pw.println(request.getPathInfo());
		pw.println(request.getProtocol());
		pw.println(request.getContextPath());
		pw.println(request.getLocalPort());
		pw.println(request.getServerPort());
		pw.println(request.getServletPath());
		pw.println(request.getContentType());
	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
