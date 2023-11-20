package com.example.demo.entity;

public class Cat extends Animal{

//	public void eat() {
//		System.out.println(  "cat eat");
//	}
//	
//	public void sleep() {
//		System.out.println(  "cat sleep");
//	}
	
	public void barking() {
		System.out.println("barking");
	}
	
	public void meow() {
		for(int i=0;i<Math.random()*10;i++) {
			System.out.println("meow!");
		}
			
	}
	
}
