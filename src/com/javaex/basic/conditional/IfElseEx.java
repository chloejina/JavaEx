package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {
		// 점수 입력, 50점 이상이면 합격입니다 출력
		// tip: ctrl + space (자동 쉼표)
		// ctrl + shift + O (Organize imports)
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);             
		// 점수 입력 받기
		System.out.print("정수는?");
		int score = scanner.nextInt();
		
		// 정수 비교
		if (score >= 60) {
			// 조건을 만족할 때
			System.out.println("합격입니다.");
		} else {
				// 조건을 만족하지 않을 때
			System.out.println("불합격입니다.");
		}
		
		// 스캐너 닫기
		scanner.close();
		
	}
	
}
