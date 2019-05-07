package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
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
					break;
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
		// post 방식일때, requset에서 한글이 깨져서 표시되기때문에, setCharacterEncoding 부분을 넣어준다.
		// 이 코드는, doPost에서 사용해도 되고, html코드에서도 입력해도 된다.
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		// Html -> Servlet 넘어오는 Parameter가 몇개가 전송되는지 보는 코드..
		Enumeration<String> param_str = request.getParameterNames();
		/*Enumeration<?> -<< ? 라는 의미는 어떠한 형식이 올지 모르기때문에 ?로 표기한다.
			( Object로 명시적으로 표현할수도 있지만, 그렇게 사용하면 Object로 같이 표기.)
		 */
		Enumeration<?> param =  request.getParameterNames();
		
		while (param_str.hasMoreElements() ) {
			System.out.println(param_str.nextElement());
		}
		
		
		
		String str = request.getParameter("search_name");
		System.out.println(str);
		System.out.println(request.getParameter("search_name"));
		
		
	}

}
