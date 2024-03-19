package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx3 {
		// 정수를 입력하세요
		// 3의 배수 여부 판별 3,6,9,12,15,18.. 3으로 나눠서 나머지가 0
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int num = scanner.nextInt();
		String message;
		
		switch(num%3==0) {
		case true:
			message = "3의 배수입니다.";
			break;
		
		default:
			message = "3의 배수가 아닙니다.";
			break;
		}
		System.out.println(num + "은"+ message);
		scanner.close();	
	}
}