package com.mycompany.stduy.test.ch07.exc;

public class Child extends Parents{

	
//	public int getSum(int
	@Override
	public int getSum(int array[]) {
		sum = ( array[0] * array[1] )+ array[2] + 10;
		
		return sum;
	}
}
