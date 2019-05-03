package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main7")
public class Main7 extends HttpServlet {
	
	int count = 0;
	List<User> user_List = new ArrayList<User>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String s_SearchName = request.getParameter("search_name");
		String res = "";
		String html ="";
		if(s_SearchName != null) {
			for(int i = 0; i < user_List.size(); i++) {
				if(s_SearchName.equals(user_List.get(i).getName())) {
					res = "<h3> 검색 결과 </h3>";
					res = res + "이름 : " + user_List.get(i).getName() + "<br>";
					res = res + "나이 : " + user_List.get(i).getAge() + "<br>";
					res = res + "키 : " + user_List.get(i).getHeight() + "<br>";
					res = res + "몸무게 : " + user_List.get(i).getWeight() + "<br><br>";
					response.getWriter().print(res);
				}
				else if(i == (user_List.size()-1)) {
					html = "<b>검색된 사용자가 없습니다.</b> <br>";
				}
			}
		}else {
			user_List.add(new User(request.getParameter("name"), Integer.parseInt(request.getParameter("age")),	Integer.parseInt(request.getParameter("height")), Integer.parseInt(request.getParameter("weight"))));
			html = "<b>입력 되었습니다.</b> <br>";
			count++;
		}
		
		html = html + "<a href = 'http://localhost:8080/201905/'>처음으로</a>";
		response.getWriter().print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
