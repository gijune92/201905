<%@ page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>

	<body>
		<%
		/*
			INFO: CATALINA_BASE:         D:\IDE\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
			5월 07, 2019 2:21:22 오후 org.apache.catalina.startup.VersionLoggerListener log
			INFO: CATALINA_HOME:         D:\IDE\apache-tomcat-8.5.40
			5월 07, 2019 2:21:22 오후 org.apache.catalina.startup.VersionLoggerListener log
			INFO: Command line argument: -Dcatalina.base=D:\IDE\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0

			--> JSP로 만든 파일이 위치하는 경로.
			JSP는 호출하면 생성(컴파일)이 된다.
		*/
			// Java Area....		
			PrintWriter pw = response.getWriter();
	
			pw.println(request.getPathInfo());
			pw.println(request.getProtocol());
			pw.println(request.getContextPath());
			pw.println(request.getLocalPort());
			pw.println(request.getServerPort());
			pw.println(request.getServletPath());
			pw.println(request.getContentType());

		%>
	</body>
</html>