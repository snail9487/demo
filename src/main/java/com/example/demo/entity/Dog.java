package com.example.demo.entity;

import com.example.demo.service.ifs.Run;

public class Dog implements Run {
	
	private String name = "hehe";
	
	private String color;
	
	private int age;

		
	
	public Dog() {  //�w�]�غc��k  �S���^�ǭȫ��A  �W�ٻP��k�@��
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAttributes(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}



	@Override
	public void run() {
		System.out.println("���b�]");
		// TODO Auto-generated method stub
		
	}
	
//	function�W�r �ѼƭӼ� �Ѽƫ��A���� �ݦ��@�Ӥ��P
//	public void setAttributes(String name, String color, int age) {
//		this.name = name;
//		this.color = color;
//		this.age = age;
//	}
	
}
