package com.javaex.basic.types;

//	정수형 데이터 타입
//	byte (1) < short (2) < int (4) < long (8)
//	정수형의 기본은 int
public class IntLongEx {
	public static void main(String[] args) {
		//	선언
		int intVar1;
		int intVar2;
		
		//	초기화
		intVar1 = 2024;
//		intVar2 = 1234567890123;//	out of range
		
		System.out.println(intVar1);
		
		long longVar1 = 2024;
		long longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount = 100_000_000_000L;
		
		//	2진수, 8진수, 16진수 표기
		int bin, oct, hex;
		bin = 0b1100;	//	0b -> 2진수 표기
		oct = 072;		//	0 -> 8진수
		hex = 0xFF;		//	0x -> 16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
