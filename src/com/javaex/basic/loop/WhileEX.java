package com.javaex.basic.loop;

public class WhileEX {
	// I like Java ~ I like Java 20
	public static void main(String[] args) {
		//While 반복문 
		// 조건을 만족하는 동안 블록을 반복
		// 반복 조건 제어 변수 필요, 조건 변수를 개발자가 직접 제어해야 함.
		
		int num = 0;
		
		while(num <=20) {
			System.out.println("I Like Java" + num);
			// 반복 제어 변수 등장
			num += 1;
		}
	}
}