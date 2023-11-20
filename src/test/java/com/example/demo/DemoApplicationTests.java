package com.example.demo;

import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class DemoApplicationTests {

	//@可以單獨執行
	@Test
	//public權限  void/int/String/...回傳值型態
	public void firstTest() {
		int c = 1231231111;
		System.out.println(c);
		String s1 = "a";
		String s2 = "b";
		String s3 = s1 + s2;
		System.out.println(s3);
	}
	
}
