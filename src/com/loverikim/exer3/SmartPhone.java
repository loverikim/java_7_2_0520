package com.loverikim.exer3;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner); // 부모생성자에 입력을 받아서 호출.
		// TODO Auto-generated constructor stub
	
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("터치로 전원켜기");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("터치로 전원끄기");
		
	}
	

}
