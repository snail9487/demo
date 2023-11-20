package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.Test;

public class ArrayTest {

	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a);
		a[0] = 1;
		a[1] = 5;
		System.out.println(a.length);

		int[] b = { 1, 3, 5, 7, 9 };
	}

	@Test
	public void listTest () {
		// String str = "ABC"
		// 			  = new String("ABC")
		// List<資料型態> 變數名稱 = new ArrayList<資料型態(可省略)>();
		// List是Interface無法new List<>()
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("C");
		strList.add("D");
		strList.add("B");
		System.out.println(strList);
		System.out.println("===============");
		System.out.println(strList.size());
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===============");
		List<String> strList1 = List.of("A","S","D","F");
		List<String> strList2 = Arrays.asList("A1","S1","D1","F1");
		//用List.of()產生的List大小固定,無法增刪
		//用Arrays.asList()產生的List大小固定,無法增刪
		//執行.add()皆會報錯
		System.out.println("===============");
		List<String> strList3 = new ArrayList<>(List.of("A","S","D","F"));
		List<String> strList4 = new ArrayList<>(Arrays.asList("A1","S1","D1","F1"));
		//動態List放進固定物件
		
	}
	
	@Test
	public void foreachTest() {
		List<String> strList = new ArrayList<>(List.of("A","S","D","F"));
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===============");
		for(String item : strList) {
			System.out.println(item);
		}
		
		
	}
	
	@Test
	public void listTest1() {
		int[] a = new int[3];
		System.out.println(a.length);
		Integer[] b = new Integer[0];
		System.out.println(b.length);
		String[] c = new String[3];
		List<String> strList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		
	}
}
