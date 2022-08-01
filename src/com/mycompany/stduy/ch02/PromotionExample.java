package com.mycompany.stduy.ch02;

public class PromotionExample {

	public static void main(String[] args) {

//		자동 타입 변환 (promotion)
//		작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double

		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue + " 입니다.!!!");
		
		short shortValue = byteValue;	//	10
		System.out.println("shortValue: " + shortValue);
		
		// int 에 short 대입 후 출력
		
		// long 에 int 대입 후 출력
		
		// float 에 long 대입 후 출력
		
		// double 에 float 대입 후 출력
		
		
		
		


		
	}

}
