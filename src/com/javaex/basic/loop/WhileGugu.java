package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		// 스캐너 열기
		
		// 단 입력 받기
		System.out.print("단을 입력하세요:");
		int num = 1, dan;
		
		dan = scanner.nextInt();
		// 1~9까지 while loop
		while(num<=9) {
			System.out.println(dan + "+"
					+num + "=" + (dan * num) );
			num += 1;
		}
		// 단 * num 출력 
		scanner.close();
		// 스캐너 닫기
		
	}

}
