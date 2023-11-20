package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

public class ClassTest {
	@Test
	public void classTest() {
		Dog yourDog = new Dog();
		Dog myDog = new Dog();
		System.out.println(yourDog.getName());
		System.out.println(myDog.getName());
		yourDog.setName("¤Ú");
		myDog.setName("­}");
		System.out.println(yourDog.getName());
		System.out.println(myDog.getName());
		System.out.println("===================");
	}
	
	@Test
	public void classTest1() {
		Dog dog = new Dog();
		dog.setAttributes(null, null, 0);
	}
	
	@Test
	public void classTest2() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance());
		Assert.isTrue(bank.getBalance()==1000, "xxxxxxxxxxxxx");
		bank.saving(-500);
		System.out.println(bank.getBalance());
		bank.saving(500);
		System.out.println(bank.getBalance());
		
		
	}
	
	@Test
	public void classTest3() {
		
	}
	
	@Test
	public void classTest4() {
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		System.out.println("==================");
		Integer a1 = 10;
		Integer b1 = 10;
		System.out.println(a1 == b1);
		System.out.println("================");
		Integer a2 = new Integer(10);
		Integer b2 = new Integer(10);
		System.out.println(a2 == b2);
		System.out.println("=====================");
		
	}
	
	@Test
	public void classTest5() {
		Dog dog = new Dog();
		dog.setName("aaa");
		dog.setColor("blue");
		dog.setAge(2);
		System.out.println("===========");
		Dog dogg = new Dog("qqq","aa",3);
		System.out.println("======================");
		
	}
	
	@Test
	public void classTest6() {
		Dog dog = new Dog();
		dog.setAttributes(null, null, 0);
		
		//¥kÁärefactor§ï¦WºÙrename
		
	}
}
