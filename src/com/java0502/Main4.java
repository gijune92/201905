package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main4")
public class Main4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Calc calc = new Calc(); 
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		String operator = request.getParameter("operator");
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		if(operator.equals("+")) {
			response.getWriter().print(num1 +" + " + num2 + " = " + calc.plus(num1, num2)+ "<br>");
		}else if(operator.equals("-")) {
			response.getWriter().print(num1 +" - " + num2 + " = " + calc.minus(num1, num2)+ "<br>");
		}else if(operator.equals("*")) {
			response.getWriter().print(num1 +" * " + num2 + " = " + calc.multiful(num1, num2)+ "<br>");
		}else if(operator.equals("/")) {
			response.getWriter().print(num1 +" / " + num2 + " = " + calc.division(num1, num2)+ "<br>");
		}else
			response.getWriter().print("다시 입력하세요");
		
		switch(operator) {
		case "+" : 
			response.getWriter().print(num1 +" + " + num2 + " = " + calc.plus(num1, num2));
			break;
		case "-":
			response.getWriter().print(num1 +" - " + num2 + " = " + calc.minus(num1, num2));
			break;
		case "*":
			response.getWriter().print(num1 +" * " + num2 + " = " + calc.multiful(num1, num2));
			break;
		case "/":
			response.getWriter().print(num1 +" / " + num2 + " = " + calc.division(num1, num2));
			break;
			
		default :
			response.getWriter().print("다시 입력하세요");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

}
