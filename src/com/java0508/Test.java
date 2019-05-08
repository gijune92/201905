package com.java0508;

public class Test implements TestInterface, Test1Interface {

	/*
	 * Class <- Class ----- extends
	 * Class <- Interface ------ implements 
	 * Interface <- Interface ------ extends
	 * 
	 * Override 무조건 해야한다. 
	 * 클래스에서는, 내가 바꾸고 싶으면 바꿔도 그만 안바꿔도 그만이지만.
	 * 추상메소드에서는 해주어야 한다.
	 * 
	 * 인터페이스는 여러개 사용할 수 있지만, 상속 클래스는 한개만 사용이 가능
	 * 
	 * 
	 * < 구현 클래스 >
	 * 메소드명이 중복되는경우, Override와 같이 Overloading 개념을 생각
	 * 같은 메소드명에, 매개변수명을 달리주어서 사용하자
	 */
	@Override
	public int add() {
		return 0;
	}

	@Override
	public void add(int a) {
		System.out.println(a);
		
	}


}
