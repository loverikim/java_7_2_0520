package com.loverikim.exer2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.name = "홍길동";
		
		
		company.human = new Human(); //필드
		company.human = new Student(); //가능 부모는 자식객체를 받아준다.
		
		// 필드의 다형성
		company.human1 = new Student(); //업캐스팅
		company.human2 = new Worker(); //업캐스팅
		company.human3 = new Soldier(); //업캐스팅
		
		Human human = new Worker(); //업캐스팅
		
		company.work(human);
	}

}
