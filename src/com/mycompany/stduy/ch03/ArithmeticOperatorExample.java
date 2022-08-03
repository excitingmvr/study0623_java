package com.mycompany.stduy.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
//		int 변수 v1 에 초기값 5
//		int 변수 v2 에 초기값 2

//		int 변수 result1 에 + 연산 후 출력
//		int 변수 result2 에 - 연산 후 출력
//		int 변수 result3 에 * 연산 후 출력
//		int 변수 result4 에 / 연산 후 출력
//		int 변수 result5 에 % 연산 후 출력
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);	// 7
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);	// 3
		
		int result3 = v1 * v2;	
		System.out.println("result3=" + result3);	// 10
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);	//	2
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);	//	1
		
		double result6 = v1 / v2;
		System.out.println("result5=" + result6);

		double result7 = (double) v1 / v2;
		System.out.println("result5=" + result7);
		
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		avg("홍길동", 60, 70, 85, 90, 45);
		avg("박말순", 50, 75, 70, 60, 70);
		avg("고장난", 55, 60, 64, 58, 90);
		avg("도룡용", 80, 70, 63, 88, 78);
		
		
	}
	
	public static void sum(int a, int b, int c) {
		
		System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c) );
		
	}
	
	public static void avg (String name, int english, int math, int physics, int music, int athletic) {
		
		System.out.println(name + " 의 평균은: " + (double) (english + math + physics + music + athletic)/5 );
	}

}
