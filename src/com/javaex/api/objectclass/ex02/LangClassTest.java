package com.javaex.api.objectclass.ex02;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println(p == p2);
		System.out.println(p.equals(p2));
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
