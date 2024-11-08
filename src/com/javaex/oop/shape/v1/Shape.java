package com.javaex.oop.shape.v1;

//	구체적 도형들의 공통점을 추출한 추상 클래스
//	직접 객체화는 불가, 다른 클래스의 부모로만 존재
public abstract class Shape {
	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	추상 클래스 내에는 한 개 이상의 추상메서드가 있어야 한다.
	public abstract void draw();
	public abstract double area();
}
