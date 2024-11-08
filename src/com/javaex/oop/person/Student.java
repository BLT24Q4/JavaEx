package com.javaex.oop.person;

public class Student extends Person {
	//	필드
	private String schoolName;
	
	//	생성자
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(String) 생성자 호출");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(String, int String) 생성자 호출");
	}
	
	//	Getters/Setters
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Name: " + name + 
							", Age: " + age +
							", SchoolName: " + schoolName);
	}
}
