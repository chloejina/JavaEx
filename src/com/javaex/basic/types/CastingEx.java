package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		// 암시적 캐스팅 (Promotion)
		promotionEx); {
		// 명시적 캐스팅 (Casting)

	}
	
	public static void promotionEx() {
		//표현 범위가 높은 자료형 -> 넓은 자료형으로의 변환
		// 암묵적으로 자동으로 캐스팅을 수행
		//byte -> short -> int -> long
		// -> float -> double
		byte b = 25; // 1바이트 정수형
		System.out.println(b);
		
		short s = b; // 2바이트
		System.out.println(i);
		
		int i = s;
		
		long 1 - i; // 8바이트
		
		float f = 1; // 8바이트 정수 -> 4바이트 상수
		
		double d = f; // 4바이트 실수 -> 8바이트 상수
		System.out.println(d);
		
		char ch ='A'
		short s2 = short) ch; // unsigned int (2) -> 2qkdlxm
		System.out.println(s2);
		
		public static void castingEx() {
			// 표현 범위가 넓은 자료형 -> 좁은 자료형으로의 변환
			// 데이터의 유실 위험 -> 반드시 강제 타입 변환이 필요
			double d = 1234567.890;
			System.out.println(d);
			
			float f = (float)d; // 8qkdlxm tlftn -> 4qkdlxm tlftn
			System.out.println(f);
			
			long l = (long)f; // 4바이트 실수 -> 8바이트 정수
			System.out.println(l);
			
			short s = (short)l; // 8바이트 정수 -> 2바이트 정수
			System.out.println(s);
			
		}
	}

}

