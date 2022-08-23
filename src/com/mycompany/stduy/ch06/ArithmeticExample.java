package com.mycompany.stduy.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int a;
		
		int a = 1;
		
		int resultAdd = arithmetic.add(1,2);
		int resultMinus = arithmetic.minus(1,2);
		int resultMulti = arithmetic.multi(1,2);
		int resultDivid = arithmetic.divid(1,2);
		int resultremind = arithmetic.remind(1,2);

		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMulti);
		arithmetic.say(resultDivid);
		arithmetic.say(resultremind);
		
	}

}
