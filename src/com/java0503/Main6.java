package com.java0503;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main6")
public class Main6 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		/* Java Bean 
		인덱스가 없는대신에, set, get을 이용하여 구분 할 수 있다.
		
		User user = new User();
		user.name ="길동이";
		user.age = 1;
		user.weight = 1000;
		user.height = 2;
		user.setName("길동이");
		String name = user.getName();
		System.out.println(name);

		
		User dong = new User("길동이", 1, 2, 1000);
		User gill = new User("동길이", 10, 180, 77);
		
		System.out.println(dong.age);
		System.out.println(gill.age);
		
		if(dong.getAge() < gill.getAge()) {
			System.out.println("동길이가 더 늙었어요");
		}else
			System.out.println("길동이가 더 늙었어요");
		 */
		
		
		// << Collection >>
		
		/* 안에 들어가는 데이터가 유동적일때는, HashMap을 사용한다.
		 * 배열과 다르게 hashMap에는 순서가 없다 !!!
		 * 
		 * HashMap을 List처럼 사용할 수 있다.
		 * HashMap안에, HashMap을 활용 하면 계층 구조( 트리 구조 )로 만들수도 있다.
		 * K(Key) 찾을때 사용하는 이름.
		 * V(Variable) 값
		 * 인덱스가 없는 모든형식에 데이터를 넣을수 있다고도 생각 해도 됩니다! 구조적으로 가면 좀 어렵겠지만
		 * 
		 * HashMap을 활용하면 Json 형식과 연관될수 있다.
		 * HashMap (Key, Value) ------- Json( Attribute , Value )
		 * 
		 * put
		 * putAll
		*/
		HashMap<String, Object> resMap = new HashMap<String, Object>();	// 선언부
		resMap.put("이름", "길동이");			// 데이터 입력
		resMap.put("나이", 1);
		resMap.put("키", 2);
		resMap.put("몸무게", 2000);
		resMap.put("학교", "구디");
		
		String name = resMap.get("이름").toString();		// Object 형식이기 때문에 형변환이 필요.
		System.out.println(resMap.get("이름") + "     " + name);
		
		/*
		 * List < E >
		 * E - Class이름, HashMap 객체명 등
		 * Element 형식인 배열
		 * 객체를 묶기위해서 사용하는 용도다
		 * 순서가 있는 녀석이지 // 
		 */
		
		
		List<User> user_List = new ArrayList<User>();
		
		user_List.add(new User("길동이", 1, 2, 1000)); // index -> 0
		user_List.add(new User("동길이", 10, 175, 80)); // index -> 1
		
		User dong = user_List.get(0);
		User gill = user_List.get(1);
		
		
		
		if(user_List.get(0).getAge() < user_List.get(1).getAge()) {
			System.out.println(user_List.get(1).getName());
		}
		else {
			System.out.println(user_List.get(0).getName());
		}
		
		/* 
		 * List IntList = new ArrayList();
		 * IntList.add(1);
		 * IntList.add("2ss");
		 * IntList.add(3.4);
		 * IntList.add(true);
		 * 
		 * Object 형식이기 때문에, 어느 값을 넣어도 사용이 가능하지만, 위에 형식 처럼 선언해야한다.
		 */
		
		 List<Object> IntList = new ArrayList<Object>();
		 IntList.add(1);
		 IntList.add("2ss");
		 IntList.add(3.4);
		 IntList.add(true);
		 
		 for(int i = 0; i < IntList.size(); i++) {
			 System.out.println(IntList.get(i));
		 }


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
