package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		usingString();
		stringFormatEx();
	}
	
	private static void usingString() {
		String str; //	선언 -> null 상태
		str = "Java";	//	할당, Literal
		String str2 = "Java";	//	Literal
		String str3 = new String("Java");	//	새 객체 생성
		
		//	세 변수는 같은 값을 가지고 있다
		//	객체의 경우, ==은 참조 주소를 비교
		System.out.println(str == str2);
		System.out.println(str == str3);
		
		//	객체의 경우, 값의 비교는 equals 메서드
		System.out.println(str.equals(str3));
	}

	private static void stringFormatEx() {
		//	포매팅 문자, %s(문자열), %d(정수), %n(개행)
		//	10개의 사과 중에 3개를 먹었다
		
		int total = 10, eat = 3;
		String fruit = "사과";
		System.out.println(total + "개의 " + fruit + "중에 " +
							eat + "개를 먹었다");
		//	-> formatting
		System.out.printf("%d개의 %s중에 %d개를 먹었다%n", total,
													fruit,
													eat);
		//	String.format 메서드 활용한 것
		String template = "%d개의 %s중에 %d개를 먹었다";
		System.out.println(String.format(template, 
												10, 
												"사과",
												5));
		System.out.println(String.format(template, 
												5,
												"바나나",
												2));
		
		//	천단위에 , 포매팅
		int amount = 123_456_789;
		System.out.printf("현재 잔고는: %d입니다.%n", amount);
		System.out.printf("현재 잔고는: %,d입니다.%n", amount);
		
		//	%f
		float interestRate = 1.2345f;
		System.out.printf("현재 이자율은 %f입니다.%n", interestRate);
		System.out.printf("현재 이자율은 %.2f입니다.%n", interestRate);
	}
}
