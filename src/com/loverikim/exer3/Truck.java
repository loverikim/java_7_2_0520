package com.loverikim.exer3;

public class Truck extends Car{

	// 추상메소드를 상속을 받으면 자식 클래스에서 반드시 구현하여 사용해야함.
	// 부모클래스의 추상메소드는 반드시 오버라이딩해서 자식클래스에서 사용해야함!!!!
	@Override
	public void drive() { // Car 클래스의 추상메소드인  drive메소드를 오버라이딩 함 
		System.out.println("트럭운전");		
	}
	
	
}
