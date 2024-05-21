package com.loverikim.exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat(); // cat 객체 선언(메모리에 cat이라는 객체가 만들어짐)
		
		Animal animal = new Animal(); // 부모객체인 animal 객체 선언
		
		//자동 타입 변환.		
		int a = 1; 
		byte b = 10;
		
		a = b;
//		b = a; //에러발생!
		
		double c = 1.5;
		int d = 10;
		// 파이썬 식으로 하면, d = (int)c;
		
		
		//***************** 업캐스팅 / 다운캐스팅 중요 알아두기 *********************		
		
		animal = cat; //**업 캐스팅** -> 자식클래스의 객체가 부모클래스 타입으로 형변환 되는 것
//		cat = animal; //에러발생!		
		cat = (Cat) animal; // 임시 형변환  -> **다운 캐스팅** 부모클래스의 객체가 자식클래스 타입으로 형변환 되는 것.
		// 부모가 자식을 받아 줄 수 있지만 임시 형변환을 통해 자식이 부모껄 받아 줄 수 있음.
		
		// 자식 객체가 만들어 질 때 본인(cat)은 1층(Cat) , 2층(Animal)은 부모객체 위치. 2층집
		// animal 부모는 1층(Animal) 하나이기 때문에 자식 객체의 Animal을 가르킬 수 있음.
		// 하지만, 반대가 되면 1층, 2층이 부모객체를 가르킬 수 없음. 
		
		// ************** 부모는 자식의 모든 것을 받아준다라고 암기하면 쉬움 ************
		
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Cat cat1 = new Cat();
		
		Animal animal2 = new Dog(); // 업캐스팅
		
		
		Animal animal1 = new Animal(); // 객체를 하나 생성해 놓고 필요할 때 마다 자식 객체를 대입해서 사용.
		//부모로 만든 객체 //자식 객체
		animal1 = new Dog(); //업캐스팅
		animal1 = new Tiger();
		animal1 = new Cat();
		
		
	}

}
