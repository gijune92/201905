package com.java0508;

public class Main12 implements Main12Interface {
	/* 전역 변수 처럼 만들어졌기때문에, Static 이라도, 어느 클래스에 리스트인지 명시적으로 표현을 해주어야
	   정확히 찾을수 있다.
	   JSP 내에서, 리프레시 ( 새로고침 )을 하다보면, JSP에서 객체를 계속 생성하다보니 중복될수 있다.
	*/
	
	
	@Override
	public boolean Student_Add(Student stu) {
		Util.student_data.add(stu);
		System.out.println(stu.toString());
		return false;
	}

	@Override
	public Student Student_Search(String name) {
		for(int i = 0; i < Util.student_data.size(); i++) {
			if(name.equals(Util.student_data.get(i).getName())) {
				//return student_data.get(i).toString();
				return Util.student_data.get(i);
			}
		}
		
		return null;
	}

	@Override
	public boolean Student_Update(Student stu) {
		for(int i = 0; i < Util.student_data.size(); i++) {
			if(stu.getName().equals(Util.student_data.get(i).getName())) {
				//return student_data.get(i).toString();
				Util.student_data.remove(i);
				Util.student_data.add(stu);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean Student_Delete(Student stu) {
		for(int i = 0; i < Util.student_data.size(); i++) {
			if(stu.getName().equals(Util.student_data.get(i).getName())) {
				//return student_data.get(i).toString();
				Util.student_data.remove(i);
				return true;
			}
		}
		return false;
	}
	

}
