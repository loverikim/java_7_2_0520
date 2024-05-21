package com.loverikim.exer3;

public abstract class Car { //추상클래스
	String model;
	String color;
	int carAge;
	
	//메서드
//	public abstract void drive() { //에러발생
//		System.out.println("운전");
//	}
	
	//수정1 -> Truck에서 에러발생 
	public abstract void drive();// 추상 메소드 -> 내용이 없는 메소드 -> 선언부만 존재
	
	public void horn() { //경적
		System.out.println("빵빵");		
	}
	
	
	
}
