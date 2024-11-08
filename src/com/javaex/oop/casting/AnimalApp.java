package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		//	Upcasting : 부모 타입으로 자식 인스턴스를 참조
		Animal dog1 = new Dog("Snoopy");
		dog1.eat();
		dog1.walk();
//		dog1.bark();	//	참조 타입의 설계도에 있는 것만 사용
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		//	Downcasting : 부모 타입으로 참조되던 타입을 
		//					원래대로 되돌리는 것
		((Dog)pet).bark();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
//		((Dog)pet).bark();
		//	캐스팅시 해당 객체가 캐스팅 가능 객체인지 확인
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}

}
