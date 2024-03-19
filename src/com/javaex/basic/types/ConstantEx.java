package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 수
		// 초기화; 조회 가능, 재할당 불가
		final doule PI = 3.14159; // 상수의 이름은 모두 대문자 , _ 로 단어 구분
		final int Speed_LIMIT = 110; 
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//재할당 불가
		SPEED_LIMIT = 100;
		
		System.out.println("현재 제한 속도는" + SPEED_LIMIT
				+"입니다.");
		System.out.println("제한 속도" + SPEED_LIMIT
				+"이하로 주행해 주세요");
		
		// 상수의 사용목적
		// 1. 코드 가독성을 높인다
		// 2. 특정 데이터를 한곳에서 일괄 관리
	}

}
