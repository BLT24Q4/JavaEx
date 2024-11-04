package com.javaex.basic.flow;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		ifEx();
	}

	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
		
//		점수를 입력 받아서 60점 이상이면 합격입니다.
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		//	if ~ else ~
		if (score >= 60) { //	조건 만족시
			System.out.println("합격입니다.");
		} else {
			//	조건 불만족시
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
	}

}
