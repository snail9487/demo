package com.example.demo.entity;

public class Bird extends Animal{
	
	public Bird() {
		super();
		System.out.println("Bird �غc��k");
	}
	
	//@Override �мg or ���s�w�q
	//���l���O���ۦP��k(�W��+�ѼƭӼ�)�A�l���O�惡��k���s�w�q�ۤv����@���e
	@Override	//java8 9 ���~�Ӯɥi�H�ٲ�
	public void eat() {
		System.out.println(super.getName() +  " ��eat�䪱");
	}
	
	@Override
	public void sleep() {
		System.out.println(super.getName() +  " ��Y��sleep");
	}
	
	public void flying() {
		System.out.println(super.getName() + "flying");
	}
}
