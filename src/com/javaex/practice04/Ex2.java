package com.javaex.practice04;

public class Ex2 {

	public static void main(String[] args) {
		double[] d = { 1.2, 3.3, 6.7 };
		
		//	 뒤에서부터 처음으로
		//	.length == 3
		//	인덱스 범위 0 ~ d.length - 1
		for (int i = d.length - 1; i >=0; i = i - 2) {
			System.out.println(d[i]);
		}
	}

}
