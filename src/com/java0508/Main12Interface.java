package com.java0508;


public interface Main12Interface {

	// 4개의 기능 추상메소드로 선언 한다.
	public abstract boolean Student_Add(Student stu);
	public abstract Student Student_Search(String name);
	public abstract boolean Student_Update(Student stu);
	public abstract boolean Student_Delete(Student stu);

}
