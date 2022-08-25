package com.mycompany.stduy.test.ch07.second;

public class StudentExample {
	
	public static void main(String[] args) {

		Student student = new Student("Tony", "1234-1234", 21);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		
		Student student2 = new Student("Crystal", "4321-4321");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
	}
}
