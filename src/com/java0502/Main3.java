package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main3")
public class Main3 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8"); 
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		//response.gerWriter().print( _______________________________) 
		// 괄호 부분에 출력 되어질 때, html로 나가기때문에 html 태그를 안에 넣어야한다.
		response.getWriter().println("이름 : " + name + "<br>");
		response.getWriter().print("나이 : " + age + "<br><br>");
		
		
		String html = "";
		
		html = html + "이름 : " + name +"<br>";
		html = html + "나이 : " + age + "<br>";
		html = html + "<a href = 'http://localhost:8080/201905/'>처음으로</a>";
		
		response.getWriter().print(html);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
