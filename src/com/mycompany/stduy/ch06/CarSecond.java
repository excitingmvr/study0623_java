package com.mycompany.stduy.ch06;

public class CarSecond {
	
	String color = "red";
	int cc = 1500;
	String name = "아반떼";
	
//	CarSecond(String str) {
//		color = str;
//	}
	
//	CarSecond(String str, int num) {
//		color = str;
//		cc = num;
//	}
	
//	기본생성자
	CarSecond() {

	}
	
	CarSecond(String name) {
		this.name = name;
	}
	
	CarSecond(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	
	
	CarSecond(String car, int num, String carColor) {
		name = car;
		cc = num;
		color = carColor;
	}
	
	CarSecond(int ccvalue) {
		cc = ccvalue;
	}	
	
	CarSecond(int num, String car) {
		name = car;
		cc = num;
	}

}
