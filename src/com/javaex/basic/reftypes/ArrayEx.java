package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		usingArray();
	}

	private static void usingArray() {
		//	배열의 선언과 초기화, 사용
		//	선언
		String[] names;	//	Type[] 식별자
		int scores[];	//	Type 식별자[]
		
		//	초기화
		names = new String[] {
				"김", "이", "박", "최"
		};	//	초기값이 있을 때
		
		scores = new int[4];	//	빈 배열 만들기
		//	인덱스 접근
		//	0부터 시작
		//	.length - 1까지
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		
		float heights[] = {
			175.3f,
			170.2f,
			173.4f,
			168.5f
		};	//	선언과 동시에 할 때만 가능
		
		//	names, scores, heights -> 같은 인덱스에 접근해서 확인
		for (int i = 0; i < names.length; ++i) {
			System.out.printf("%s (%.2f) : score = %d%n", names[i],
														heights[i],
														scores[i]);
		}
	}
}
