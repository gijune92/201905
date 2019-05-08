package com.java0508;

import java.util.ArrayList;
import java.util.List;

public class Main12 implements Main12Interface {

	static List<Student> student_data = new ArrayList<Student>();
	
	@Override
	public boolean Student_Add(Student stu) {
		student_data.add(stu);
		System.out.println(stu.toString());
		return false;
	}

	@Override
	public Student Student_Search(String name) {
		for(int i = 0; i < student_data.size(); i++) {
			if(name.equals(student_data.get(i).getName())) {
				//return student_data.get(i).toString();
				return student_data.get(i);
			}
		}
		
		return null;
	}

	@Override
	public boolean Student_Update(Student stu) {
		for(int i = 0; i < student_data.size(); i++) {
			if(stu.getName().equals(student_data.get(i).getName())) {
				//return student_data.get(i).toString();
				student_data.remove(i);
				student_data.add(stu);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean Student_Delete(Student stu) {
		for(int i = 0; i < student_data.size(); i++) {
			if(stu.getName().equals(student_data.get(i).getName())) {
				//return student_data.get(i).toString();
				student_data.remove(i);
				return true;
			}
		}
		return false;
	}

}
