package com.mycompany.stduy.ch07.second;

public class Student extends People{

//	public String name;
//	public String ssn;
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
//		this.name = name;
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
//		super();
	}
}
