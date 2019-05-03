package com.java0503;

public class User { // 이런식으로 구성되어 있는 클래스를, 자바빈 ? 이라고 합니다?
	// 필드 
	
	// 변수로 선언한 객체들은 접근제한자를 이용해서, 처음 객체를 생성할때만 데이터를 입력 받을수 있게 만들수 있다.
	// 이 후, 활용은 get, Set 메소드를 활용. 고정되어있는 형식으로 데이터를 담을때. 사용한다
	
	String name;
	int age;
	int height;
	int weight;
	
	public User(String name, int age, int height, int weight) {
		setName(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	
}
