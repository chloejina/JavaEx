package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {
		int a= 10;
		
		// a 가 짝수면 true, 홀수면 false 출력
		String result = a % 2 == 0 ? "짝수": "홀수";
		System.out.println(a+ "은" + 
						result + "입니다");
	
		int score = 70;
		String message;
		
		// score가 80점 이상 : Good
		// score가 50 ~ 80 : Pass
		// score가 50 미만 : Fail
	
		message = score >=80 ? "Good":
					score >= 50 ? "Pass":"Fail";
		System.out.println(message);
	
	}

}
