package com.mycompany.stduy.ch04;

public class IfExample4 {

	public static void main(String[] args) {

//		int 타입의 변수를 1개 선헌하고
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요
		
		int a = 4;
		
		if(a != 0) {
			if(a%2 == 0) {
				System.out.println("짝수 임다.");
			} else {
				System.out.println("홀수 임다.");
			}
		} else {
			// a==0
			System.out.println("0은 홀짝을 판단할 수 없습니다.");
		}
		
		
		
	}

}
