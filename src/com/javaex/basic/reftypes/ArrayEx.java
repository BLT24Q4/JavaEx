package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		usingArray();
		multiDimArrayEx();
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
		
		//	scores 배열이 있음
		int scores2[] = scores;	//	참조 복제
		//	참조 복제 -> 객체의 주소를 복사하는 것
		
		System.out.println("scores:" + Arrays.toString(scores));
		System.out.println("scores2:" + Arrays.toString(scores2));
		scores2[2] = 100;
		System.out.println("scores2:" + Arrays.toString(scores2));
		System.out.println("scores:" + Arrays.toString(scores));
		
	}
	
	private static void multiDimArrayEx() {
		//	5행 10열의 2차원 배열
		int[][] twoDimens = new int[5][10];	//	빈 2차원 배열
		
		//	기본 데이터가 있을 경우
		int table[][] = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 },
				{ 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 },
				{ 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 }
		};
		
		System.out.println("table.length: " + table.length);
		//	인덱스 범위: table[0] ~ table[table.length - 1]
		System.out.println("table[0].length: " + table[0].length);
		//	인덱스 범위: table[0][0] ~ table[0][table[0].length - 1]
		
		//	table 배열 내부의 모든 요소의 합을 구하자
		int sum = 0;
		for (int row = 0; row < table.length; ++row) { //	행 루프
			for (int col = 0; col < table[row].length; ++col) { // 열루프
				int val = table[row][col];
				
				System.out.print(val + "\t");
				sum += val;	//	내부 cell 데이터 합산
			}
			System.out.println();
		}
		
		System.out.println("합산 결과:" + sum);
	}
}
