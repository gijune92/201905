package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Java Project <-> Web Project 
// 개인사용			Serivce를 해주느냐

// URL Mapping : http://localhost:8080/201905/Main2?a=1&b=2
//													___ QueryString ( URL 주소에 넣는 Parameter라고 한다. )
//													    ___ 2개의 값을 받을 때는, &를 사용한다.
@WebServlet("/Main2")
public class Main2 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().println("출력합니다.");
		// -> Servlet으로 무언가를 처리할때만 사용한다.
		
		/* 무언가 값이 오는건...? (Clinet 에서 온다. 요청하는 사람이 )
		 * request
		 * -> 클라이언트가 서버로 보내주는 데이터. 요청한다...? // 고객이 나에게 요청한 작업에 대한 데이터.
		 */
		//변수명 'a' 가 된다. ---> a = 1;   b변수 : b = 2;
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String s_c = request.getParameter("c");
		// 내가 만들어서 보내는거...?
		// Parameter가 같을때 , 전달 받는 순서중 제일 먼저오는것을 받는다 ?a=1&b=2&c=1&c=22 << c = 1 이게 된다.
		String c = a+b;	// 12
		int res = Integer.parseInt(a) + Integer.parseInt(b);	// 3
		System.out.println("String s_c : " + s_c);
		System.out.println("String c : " + c);
		System.out.println("int res : " + res);
		
		response.getWriter().print(c + ", " + res);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
