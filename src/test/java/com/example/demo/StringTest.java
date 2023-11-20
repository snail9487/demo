package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {

	@Test
	public void stringTest() {
		// 記憶體位置
		String str = "ABC"; // @123 在字串池存放ABC
		String str1 = new String("ABC"); // @456 有new就會新建記憶體空間
		String str2 = "ABC"; // @123 發現在字串池有ABC
//		str = "AB";                          	//	@789   字串池的字串保存到程式結束
		System.out.println(str == str1); // false
		System.out.println(str == str2); // true
		System.out.println("=================");
		System.out.println(str.equals(str1)); // true
		System.out.println(str.equals(str2)); // true
		String str3 = "aBC";
		System.out.println(str.equals(str3)); // false 字串內容比對
		System.out.println(str.equalsIgnoreCase(str3)); // true

	}

	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "		";
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println("================="); // 判斷字串是否為空字串
		System.out.println(str1.isEmpty()); // true
		System.out.println(str2.isEmpty()); // false
		System.out.println("================="); // 判斷字串是否為空字串或空白
		System.out.println(str1.isBlank()); // true
		System.out.println(str2.isBlank()); // true

	}

	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String name = dog.getName();
		String color = dog.getColor();
		System.out.println(name);
		System.out.println(color); // null
		System.out.println("=============");
		System.out.println(name.length());
		// System.out.println(color.length()); //NullPointerException
		System.out.println(color == null); // true
		System.out.println("=============");
		if (color == null || color.isBlank()) { // 如果color.isBlank()放前面,會NullPointerException
			System.out.println("color 是空字串");
		} else {
			System.out.println("color 不是空字串");
		}
		System.out.println("=============");
		System.out.println(StringUtils.hasLength(" ")); // true
		System.out.println(StringUtils.hasText(" ")); // false
		System.out.println("=============");

	}

	@Test
	public void stringTest3() {
		int count = 0;
		int index = 0;
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String targetStr = "小龍女";
		for(;;) {
			if(str.indexOf(targetStr,index) == -1)
				break;
			index = str.indexOf(targetStr,index) + targetStr.length();
			count++;
		}
		
//		while(str.indexOf(targetStr,index) != -1) {
//			index = str.indexOf(targetStr,index) + targetStr.length();
//			count++;
//		}
		
		System.out.println(count);
	
	}
	
	@Test
	public void stringTest4() {
		String str = " 神鵰俠侶 是 楊過 與 郭襄 的故事 ";
		System.out.println(str);
		String str1 = str.replace(" ","");
		System.out.println(str1);
		String str2 = str.concat(str1);
		System.out.println(str2);
	}
	
	@Test
	public void stringTest5() {
		String str = "ABACADEF";
		String targetStr = "A";
		String str1 = "W";
		int index = str.lastIndexOf(targetStr);
		String str2 = str.substring(0, index) + str1 + str.substring(index + targetStr.length());
		System.out.println(str2);
 	}
	
	@Test
	public void replaceTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		str = str.replace("小龍女","小籠包");
		System.out.println(str);
		str = str.replaceAll("小籠包", "小籠湯包");
		System.out.println(str);
	}
	
	@Test
	public void splitTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String[] array = str.split("小龍女");
		for(String item : array) {
			System.out.println(item);
		}
		System.out.println("==============");
		String str1 = "ABCD";
		String[] array1 = str1.split("");
		for(String item : array1) {
			System.out.println(item);
		}
	}
	
	@Test
	public void trimTest() {	//刪除前後空格
		String str = "ABC DEF ";
		String str1 = " ABC DEF";
		System.out.println(str == str1);		//false
		System.out.println(str.equals(str1));	//false
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);	
		System.out.println(str1);
		System.out.println(str == str1);		//false
		System.out.println(str.equals(str1));	//true
		System.out.println("==========");
		
	}
	
	@Test
	public void substringTest() {	//提取子字串
					//0 1 2 3 4 5 6 7 8 9 10  12
		String str = "神鵰俠侶是楊過與小龍女的故事";
		String subStr = str.substring(5);
		String subStr1 = str.substring(5,11);
		System.out.println(subStr);		//楊過與小龍女的故事
		System.out.println(subStr1);	//楊過與小龍女
	}
	
	@Test
	public void stringBufferTest() {	//stringBuffer
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		sb.append("GGG");
		sb.append("AAA").append("BBB");
		System.out.println("==========");
	}
	
	@Test
	public void stringBufferTest1() {
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb.equals(sb1));	//false
		System.out.println("==========");
		System.out.println(sb.toString().equals(sb1.toString()));
	}
	
	@Test
	public void stringBufferTest2() {
		for(;;) {
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			boolean boo = false;
			if(input.length() < 2) {
				System.out.println(boo);
				continue;
			}
			StringBuffer sb = new StringBuffer(input);
			String str = sb.reverse().toString();
			boo = input.equals(str);
			System.out.println(boo);
		}	
	}
	
	
	
}
