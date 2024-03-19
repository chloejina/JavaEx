package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);   // 스위치인데 if로 하라고 함
		// 점수 입력 받기
		System.out.print("점수는?");
		int score = scanner.nextInt();

		if (score >= 90) {

			
			System.out.println("A등급");
		}

		else if (score >= 80) {
			
			System.out.println("B등급");
		}

		else if (score >= 70) {
			
			System.out.println("C등급");
		}

		else if (score >= 60) {
			
			System.out.println("D등급");
		}

		else {

			System.out.println("F등급");
		}

		scanner.close();

	}

}
