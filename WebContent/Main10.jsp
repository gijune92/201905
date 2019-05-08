<%@ page import="com.java0507.storage" %>
<%@page import="java.util.List"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.java0503.User" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
List<User> user_List = new ArrayList<User>();
%>
<%
/*
	//사용자 입력
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
	}
	
	html = html + "<a href = 'http://localhost:8080/201905/'>처음으로</a>";
	response.getWriter().print(html);
*/
%>

<%
	request.setCharacterEncoding("UTF-8");
	String s_SearchName = request.getParameter("search_name");
	String res = "";
	storage sto = new storage();
	System.out.println(s_SearchName);
	if(s_SearchName != null){
		
		response.getWriter().print(sto.load_User(s_SearchName));
	}else{
		sto.save_User(request.getParameter("name"), Integer.parseInt(request.getParameter("age")),	Integer.parseInt(request.getParameter("height")), Integer.parseInt(request.getParameter("weight")));
	}
	
%>
</body>
</html>