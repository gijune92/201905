package com.java0503;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main5")
public class Main5 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String h = "<html><head><meta charset='UTF-8'><style type='text/css' > .tab1 { padding-left: 2em; }"+ "</style></head><body>";
		String f = "</body></html>";
		Dan dan = new Dan();
		
		//response.getWriter().print(dan.lv1());
		response.getWriter().print(dan.lv2()+"<style type='text/css' > .tab1 { padding-left: 2em; }\"+ \"</style>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
