package com.javaex.basic.loop;

public class ContinueEx {
		// 1~ 20까지 루프
		// 2의 배수와 3의 배수는 출력 안함 
		// 나머지는 출력  1 4 5 7 10 ......
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=20; i+=1)  { // i+=1 , i=i+1,  i+= 증감 
			if( i%2 == 0 || i%3 ==0)   // || 는 or
				continue;              // 다음 루프로
			System.out.println(i);
	}
	}
}
