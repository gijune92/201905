<%@page import="com.java0508.Test1Interface"%>
<%@page import="com.java0508.Test"%>
<%@page import="com.java0508.TestInterface"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--
 인터 페이스를 선언하고, 생성자를 사용할 수 없기 때문에,
 구현 클래스를 import 하여, 객체를 생성 하여 사용.	
 -->
<%
	TestInterface ti; // 선언
	// ti = new TestInterface(); -> 인터페이스는 생성자를 사용할 수 없다.
	ti = new Test();
	
	/* List 와 비교해서, 선언을 한다면
	 * TestInterface ti = new Test();
	 * 인터페이스                          구현 클래스
	 
	 인터페이스 생성자를 이용해서, 구현클래스에 내가 새로정의한 메소드는 이용할 수 없다.
	 인터페이스를 이용하여 만든 객체는 인터페이스 내에, 추상메소드를 만든것만 사용이 가능하고.
	 
	 인터페이스란, 부분적 기능을 하는...
	 어떠한 틀에서, 각각의 기능을 구분시켜서 나눈 부분을 정의
	 */
	int res = ti.add();
	
	Test1Interface t1i = new Test();
	t1i.add(10);
%>

<%= res%> <!-- 변수값 출력. -->