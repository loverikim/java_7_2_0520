package com.loverikim.exer;

public class Cat extends Animal{ //Animal클래스를 상속받음
	String catName;
	
	public void catWorking() {
		System.out.println("고양이가 걷는다.");
	}
	
	// 자식에서 구현해야 하는데 안하면 에러뜸.
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("니야옹~니야옹");		
	}
	
	
}
