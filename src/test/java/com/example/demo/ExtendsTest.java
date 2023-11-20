package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

import com.example.demo.entity.A1;
import com.example.demo.entity.A2;
import com.example.demo.entity.Animal;
import com.example.demo.entity.Bird;
import com.example.demo.entity.C;
import com.example.demo.entity.Car;
import com.example.demo.entity.Cat;
import com.example.demo.entity.Dog;
import com.example.demo.entity.Human;
import com.example.demo.entity.Person;

public class ExtendsTest {

	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("父類別 Animal name: " + anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		System.out.println("子類別 bird name: " + bird.getName());
		bird.setName("bbbird");
		System.out.println("子類別 bird name: " + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
		
	}
	
	@Test
	public void extendsTest1() {
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
		
	}
	
	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		a1.getC().setCity("tainan");
		System.out.println(a1.getC().getCity());

	}
	
	@Test
	public void extendsTest3() {
		A2 a2 = new A2();
		C c = new C();
		a2.setC(c);
		a2.getC().setCity("taipei");	
		System.out.println(a2.getC().getCity());
	}
	
	@Test
	public void extendsTest4() {
		Animal anim = new Animal();
		anim.eat();
		Bird bird = new Bird();
		bird.eat();
		Cat cat = new Cat();
		cat.eat();
		System.out.println("==================");
		Animal animm = new Animal();
		animm.eat();
		Animal birdd = new Bird();
		birdd.eat();
		Animal catt = new Cat();
		catt.eat();
		
	}
	
	@Test
	public void interfaceTest() {
		Car car = new Car();
		car.run();
		Dog dog = new Dog();
		dog.run();
		Human human = new Human();
		human.run();
		Person person = new Person();
		person.run();
	}
	
}
