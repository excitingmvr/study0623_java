package com.mycompany.stduy.ch02;

public class CastingExample {

	public static void main(String[] args) {

		// 강제 형변환 : casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891;	// 7자리 이상인 경우에는 e로 표현횜
		 System.out.println("doubleValue2: " + doubleValue2);
		
		// folat 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);

		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue);
		
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		
		// int를 string으로 변환
		String stringValue = String.valueOf(intValue);
		System.out.println("stringValue: " + stringValue);
		
		// string 을 int 로 변환
		int intValue2 = Integer.parseInt(stringValue);
		System.out.println("intValue2: " + intValue2);
		
	}

}
