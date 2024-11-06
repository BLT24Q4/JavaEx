package com.javaex.oop;

public class MethodEx {

	//	메서드 작성 연습
	//	매개 변수 -> 입력, 리턴 -> 출력
	public static void main(String[] args) {
		//	매개변수 x, 리턴 x
//		printMessage();
		//	매개변수 x, 리턴 o
//		String message = getMessage();
//		System.out.println("getMessage: " + message);
		//	매개변수 o, 리턴 x
//		printSum(10, 20);
		//	매개변수 o, 리턴 o
		System.out.println(getSum(10, 20));
		System.out.println(getSum(10, 20, 30));
	}
	
	//	매개변수 x -> 파라미터 없음
	//	리턴 x -> void
	private static void printMessage() {
		System.out.println("매개 변수 없고, 리턴도 없음");
	}
	
	//	매개변수 x -> 파라미터 없음
	//	리턴 o -> 리턴될 데이터의 타입
	private static String getMessage() {
		//	return으로 데이터 반환
		return "입력은 없지만, 출력은 있는 메서드";
	}
	
	//	매개변수 o -> 파라미터 있음
	//	리턴 x -> void
	private static void printSum(double num1, 
								double num2) {
		System.out.println(num1 + num2);
	}
	
	//	매개변수 o -> 파라미터 있음
	//	리턴 o -> 리턴 데이터 타입 명시
	private static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	
	//	메서드 오버로딩 (초과적재) -> 다형성의 일부
	private static double getSum(double num1,
								double num2, 
								double num3) {
		return num1 + num2 + num3;
	}

}
