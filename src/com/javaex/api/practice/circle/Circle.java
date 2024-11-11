package com.javaex.api.practice.circle;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	//	radius가 같으면 객체의 값이 같다고 가정
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);
	}
}
