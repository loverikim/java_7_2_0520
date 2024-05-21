package com.loverikim.exer5;

import com.sun.tools.javac.Main;

public class SoundableExample {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	// 메인 메소드	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
