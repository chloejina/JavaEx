package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);             
	
		System.out.print("과목을 선택하세요:\n1.자바, 2.C, 3. C++, 4.파이썬");
		int subj = scanner.nextInt();
		
		if (subj==1) {
			System.out.println("R101입니다.");
		}else if (subj==2) {
			System.out.println("R202입니다.");
		}else if (subj==3) {
			System.out.println("R303입니다.");
		}else if (subj==4) {
			System.out.println("R401입니다.");
		}else {
			System.out.println("상담원에게 문의하세요.");
		}
		
	
		scanner.close();
	}		
}
	
//선언 
//초기
//조회
