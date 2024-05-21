package com.loverikim.exer4;

public class MainClass {
	public static void main(String[] args) {
		//Car car = new Car();// 인터페이스는 new 연산자로 객체생성 불가.
		
		
		//중요!!!!!!!
		Truck truck = new Truck(); // 일반클래스 상속받고 있지만 가능.
	
		
		Car car; // 인터페이스 객체(변수) 선언까지는 됨.(car이름만 만들어짐. 가르킬 주소의 공간만 생성.)
				 // new연산자 역할 -> 메모리에 car라는 객체를 메모리에 만들어줌 -> 인스턴스	
		
		car = truck; // 업캐스팅 가능.
		
		// 업캐스팅의 개념 부모는 자식의 모든것을 받아준다. -> 대입이 가능.
		// Truck은 Car의 자식
		
		
		
		

	}

}
