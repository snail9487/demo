package com.example.demo.entity;

public class Bird extends Animal{
	
	public Bird() {
		super();
		System.out.println("Bird 建構方法");
	}
	
	//@Override 覆寫 or 重新定義
	//父子類別有相同方法(名稱+參數個數)，子類別對此方法重新定義自己的實作內容
	@Override	//java8 9 後繼承時可以省略
	public void eat() {
		System.out.println(super.getName() +  " 邊eat邊玩");
	}
	
	@Override
	public void sleep() {
		System.out.println(super.getName() +  " 邊吃邊sleep");
	}
	
	public void flying() {
		System.out.println(super.getName() + "flying");
	}
}
