package com.java0503;

public class Dan {
	public void level1() {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9; j++) {
				if(j == 1) {
					System.out.println(i+"단");
				}
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("");
		}
	}//10
	
	public void level2() {
		for(int i = 1; i<=7; i+=3) {
			System.out.println(i+"단 \t\t" + (i+1) +"단\t\t" + (i+2) + "단 ");
			for(int j = 1; j <= 9; j++) {
				for(int k = 0; k <= 2; k++) {
					System.out.print((i+k) + " * " + (j) +" = " + ((i+k)*(j)) + " \t" );
				}
				System.out.println("");
			}
		}
	} //12
	
	public void level3() {
		for(int i = 1; i<=3; i++) {
			System.out.println(i+"단 \t\t" + (i+3) +"단\t\t" + (i+6) + "단");
			for(int j = 1; j <= 9; j++) {
				for(int k = 0; k <= 6; k+=3) {
					System.out.print((i+k) + " * " + (j) +" = " + ((i+k)*(j)) + " \t" );
				}
				System.out.println("");
			}
		}
	} //12
	
	public String lv1() {
		/*****************************
		 * 1난이도 (한행에 하나씩)
		 * 1단 > 2단 (순차적으로 출력)
		 *****************************/
		String str = "";
		for(int y = 1; y <= 9; y++) {
			System.out.println(y + " 단");
			str = str + (y + " 단 <br>");
			for(int x = 1; x <= 9; x++) {
				System.out.println(y + " * " + x + " = " + (y * x));
				str = str + (y + " * " + x + " = " + (y * x)+ "<br>");
			}
			System.out.println();
			str = str + "<br>";
		}
		return str;
	}
	
	public String lv2() {
		/*****************************
		 * 2난이도 (한행에 3단씩)
		 * 1단 2단 3단 > 4단 5단 6단 > 7단 8단 9단
		 *****************************/
		
		String str= "";
		for(int y = 1; y <= 9; y = y + 3) {
			str = str + "<p class='tab1'>" + y +" 단 </p>";
			str = str + "<p class='tab1'>" + (y + 1) + " 단 </p>";
			str = str + "<p class='tab1'>" + (y + 2) + " 단  </p><br>";
			for(int x = 1; x <= 9; x++) {
				str = str + y + " * " + x + " = " + (y * x) + "&emsp;";
				str = str + (y + 1) + " * " + x + " = " + ((y + 1) * x) + "&emsp;";
				str= str + (y + 2) + " * " + x + " = " + ((y + 2) * x) + "&emsp;<br>";
			}
			str =str + "<br>";
		}
		System.out.println(str);
		return str;
	}
	
}
