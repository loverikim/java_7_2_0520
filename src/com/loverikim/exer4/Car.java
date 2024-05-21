package com.loverikim.exer4;

public interface Car { // 인터페이스 선언 new -> interface
	
	String modelName = "galaxy"; //상수만 선언가능	
	
	// 인터페이스 사용하기
	// 1) 인터페이스 선언
	// 2) 인터페이스 안에는 추상 메소드만
	// 3) 필드는 상수필드만 가능.
	// **** 상수와 추상 메소드만 사용가능 하다.*****
	// DB와 연결할때 인터페이스 사용.
	
	public void frontDrive();// 인터페이스 내에서는 추상메소드만 선언 가능
	// 인터페이스 내의 모든 메소드는 추상메소드로 사용됨 -> 즉, 바디를 만들 수 없음.
	
	public void rearDrive();
	public void stopDrive();
	public void horn();
	
	
//	public void frontDrive() { // 에러
	// 일반메소드로 선언해도 추상메소드로 사용됨.
//		
//	}
	
	

	
	
}
