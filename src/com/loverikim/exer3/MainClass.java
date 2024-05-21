package com.loverikim.exer3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car car = new Car(); // ********* 추상클래스는 객체를 만들 수 없다!! *********
		
		// 클래스는 설계도 객체를 만들어서 그 인스턴스를 가지고 실행
		// 추상클래스는 객체의 기본 설계도 역할만 함 -> 상속용도로만 사용
		// 반드시 존재해야할 필드와 메소드의 선언 (실체 클래스의 설계 규격 - 객체 생성용이 아님)
		// 실체 클래스에는 공통된 내용은 빠르게 물려받고, 다른점만 선언하면 되므로 시간 절약
		
		
		// Phone phone = new Phone(); // 추상클래스는 객체를 선언할 수 없다.
		SmartPhone smartPhone = new SmartPhone("박서준");
		
		smartPhone.turnOff();
		smartPhone.turnOn();
		smartPhone.internetSearch();
	}

}
