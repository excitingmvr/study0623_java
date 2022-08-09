package com.mycompany.stduy.ch04;

public class IfExample3 {

	public static void main(String[] args) {

//		int 타입의 변수를 2개 선헌하고
//		두 정수 가 주어졌을때 두 정수를 비교하여
//		크기 비교 결과를 나타내는 프로그램을 작성하시요
		
		int a = 4;
		int b = 5;
		
		if(a>b) {
			System.out.println("a가 b보다 크다");
		} else if (a<b) {
			System.out.println("b가 a 보다 크다");
		} else {
			System.out.println("a와 b가 같다");
		}
	}

}
