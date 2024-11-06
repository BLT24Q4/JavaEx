package com.javaex.oop.goods.v2;

//	Goods v2. 접근제한자
class Goods {
	//	필드 선언 -> private
	private String name;
	private int price;
}

//	Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		//	생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
		camera.name = "Nikon";
		camera.price = 400_000;
		
		System.out.printf("%s -> %,d%n", camera.name,
				camera.price);
		
		Goods notebook = new Goods();
		notebook.name = "LG 그램";
		notebook.price = 900_000;
		
		System.out.printf("%s -> %,d%n", notebook.name,
				notebook.price);
		
		Goods mug = new Goods();
		mug.name = "머그컵";
		mug.price = 2_000;
		
		System.out.printf("%s -> %,d%n", mug.name,
				mug.price);
		
		
	}

}
