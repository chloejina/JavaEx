package com.javaex.basic.operators;

public class practice {

	public static void assignOperTest() {
		// = : 우선순위 가장 마지막
		int a = 7;
		int b = 3;
		
		a = a+b;
		System.out.println(a); // 10
		a += b; // 확장 할당 연산
		System.out.println(a); // 13
		
	}
}
