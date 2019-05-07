package com.java0507;

import java.util.ArrayList;
import java.util.List;

import com.java0503.User;

public class storage {
	 static List<User> user = new ArrayList<User>();
	
	public void save_User(String name, int age, int height, int weight) {
		user.add(new User(name, age, height, weight));
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(user.size());
	}
	
	public String load_User(String name) {
		String res = "";
		System.out.println("name : " + name);
		System.out.println(user.size());
		
		for(int i = 0; i < user.size(); i++) {
			if(name.equals(user.get(i).getName())) {
				res = "<h3> 검색 결과 </h3>";
				res = res + "이름 : " + user.get(i).getName() + "<br>";
				res = res + "나이 : " + user.get(i).getAge() + "<br>";
				res = res + "키 : " + user.get(i).getHeight() + "<br>";
				res = res + "몸무게 : " + user.get(i).getWeight() + "<br><br>";
				
				break;
			}
			else if(i == (user.size()-1)) {
				res = "<b>검색된 사용자가 없습니다.</b> <br>";
			}
		}
		
		res = res + "<a href = 'http://localhost:8080/201905/'>처음으로</a>";
		return res;
	}
}
