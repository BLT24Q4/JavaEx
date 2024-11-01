package com.javaex.basic.opers;

public class CondOperEx {

	//	3항 연산자
	//	조건에 따라 선택적으로 값을 선택하는 연산자
	public static void main(String[] args) {
		int a = 10;
		//	a가 짝수면 짝수, 홀수면 홀수
		String result;
		
		result = a % 2 == 0 ? "짝수": "홀수";
		System.out.println(a + "는 " + result);
		
		//	점수가 80점 이상이면 Good
		//	점수가 50 ~ 80 사이면 Pass
		//	점수가 50이 안되면 Fail
		String message;
		int score = 70;
		
		message = (score >= 80) ? "Good":
			(score >= 50) ? "Pass":
				"Fail";
		System.out.println("점수:" + score +
				" 결과:" + message);
	}

}
