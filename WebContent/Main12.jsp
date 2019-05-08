<%@page import="com.java0508.Student"%>
<%@page import="com.java0508.Main12Interface"%>
<%@page import="com.java0508.Main12"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");
	Main12Interface Student = new Main12();

	if(request.getParameter("Student_Process").equals("Add")){
		Student.Student_Add(new Student(request.getParameter("Student_Name"), request.getParameter("Student_Gender"), request.getParameter("Student_ID"), request.getParameter("Student_PWD")));
		response.getWriter().println("저장 되었습니다.");
		response.getWriter().println("<a href = 'http://localhost:8080/201905/Student.html'>처음으로</a>");
		
	}else if(request.getParameter("Student_Process").equals("Search")){
		response.getWriter().println(Student.Student_Search(request.getParameter("Student_Name")));
	
	}else if(request.getParameter("Student_Process").equals("Update")){
		if(Student.Student_Update(new Student(request.getParameter("Student_Name"), request.getParameter("Student_Gender"), request.getParameter("Student_ID"), request.getParameter("Student_PWD")))){
			response.getWriter().println("수정되었습니다.");
			response.getWriter().println("<a href = 'http://localhost:8080/201905/Student.html'>처음으로</a>");
		}else{
			response.getWriter().println("수정할 정보와 맞는 데이터가 없습니다.");
			response.getWriter().println("<a href = 'http://localhost:8080/201905/Student.html'>처음으로</a>");
		}
			
	}else if(request.getParameter("Student_Process").equals("Delete")){
		if(Student.Student_Delete(new Student(request.getParameter("Student_Name"), request.getParameter("Student_Gender"), request.getParameter("Student_ID"), request.getParameter("Student_PWD")))){
			response.getWriter().println("삭제되었습니다.");
			response.getWriter().println("<a href = 'http://localhost:8080/201905/'>처음으로</a>");
		}else{
			response.getWriter().println("삭제 될 아이디가 없습니다.");
			response.getWriter().println("<a href = 'http://localhost:8080/201905/'>처음으로</a>");
		}
	}


%>