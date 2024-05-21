package com.loverikim.exer;

public abstract class Animal {
	String name;
	int age;
	
	public void working() {
		System.out.println("동물이 걷는다.");
	}
	
	public abstract void cry();
	
}
