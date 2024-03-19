package com.javaex.basic.operators;

public class ArithOperaEx {

	public static void main(String[] args) {
		// 산술연산
		arithOperTest();
		// 증감연산 (디버거)
		// 할당연산

	}
	
	public static void arithOperTest() {
		int a = 7;
		int b = 3;
		
		//부호연산 (+,-)
		System.out.println(-a);
		System.out.println("-----------");
		
		//사칙연산 (+,-,*,/,%)
		System.out.println(a+b); // 10
		System.out.println(a-b); // 4
		System.out.println(a*b); // 21
		System.out.println(a/b); // 2
		System.out.println(a%b);  // 1
	}

}
