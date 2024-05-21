package com.loverikim.exer3;

public abstract class Phone { // 스스로 객체는 못만들지만 상속받는 공통적인 기능들은 제공.
	// 의미기능 부여 필수로 가지고 있어야 하는 것들을 선언
	// 본인 스스로 객체를 생성할 수 없다. -> 설계목적. 필수요소만 넣는 것.
	// 이 클래스를 상속받는 애들은 기본기능은 베이스로 깔고 디테일 요소만 수정.
	
	// 필수 요소는 가지고 시작	
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	//*************************************************************************
	// 필수 기능들을 추상 클래스로 선언해 놓으면 -> 상속받는 클래스에서 오버라이딩은 필수.
	
	public abstract void turnOn(); // 추상 메소드
	public abstract void turnOff();

}
