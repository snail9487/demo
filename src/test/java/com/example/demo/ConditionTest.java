package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void ifTest() {
		int a = 5;
		if (a > 5) {
			System.out.println("=========");
		} else {
			System.out.println("++++++++++++++");
		}
	}

	@Test
	public void ifTest1() {
		int a = 5;
		if (a > 5) {
			System.out.println("=========");
		} else if (a > 6) {
			System.out.println("++++++++++++++");
		} else {
			System.out.println("--------------");
		}
	}

	@Test
	public void scannerTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入");
		String a = scan.next();
		System.out.println("輸入為: " + a);
	}
	
	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入");
		String a = scan.next();
		String b = scan.next();
		System.out.println("輸入為: " + a + b );
	}
	
	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入");
		String a = scan.nextLine();
		System.out.println("輸入為: " + a);
	}
	
	@Test
	public void scannerTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int a = scan.nextInt();
		System.out.println("輸入為: " + a);
	}

	@Test
	public void switchTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入score:");
		int score = scan.nextInt();
		switch (score / 10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
//		double a = 95/10.0;
//		System.out.println(a);
		
	}
		
		//假設今天是星起x x國字輸入  y天後星期幾(國字輸出) y數字輸入  
	@Test
	public void switchTest4() {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
//		System.out.println("S: " + s);
		int i = 0;
		int n = scan.nextInt();
			switch(s) {
			case "一":
				i = 1;
				break;
			case "二":
				i = 2;
				break;
			case "三":
				i = 3;
				break;
			case "四":
				i = 4;
				break;
			case "五":
				i = 5;
				break;
			case "六":
				i = 6;
				break;
			case "日":
				i = 7;
				break;
			}
		
		int ans = i + n;
//		System.out.println("ANS: " + ans);
		
			switch(ans % 7) {
			case 1 :
				System.out.println("一");
			break;
			case 2 :
				System.out.println("二");
				break;
			case 3 :
				System.out.println("三");
				break;
			case 4 :
				System.out.println("四");
				break;
			case 5 :
				System.out.println("五");
				break;
			case 6 :
				System.out.println("六");
				break;
			case 0 :
				System.out.println("日");
				break;
			}
		
	}
	
	@Test
	public void switchTest5() {
		Scanner scan = new Scanner(System.in);
		int weekday = scan.nextInt();
		int days = scan.nextInt();			
		System.out.printf("今天星期%s,%d天後星期%s", test(weekday), days, test(weekday+days) );
		
	}
	
	public String test(int i) {
		String output = "";
		switch(i % 7) {
		case 1:
			output = "一";
			break;
		case 2:
			output = "二";
			break;
		case 3:
			output = "三";
			break;
		case 4:
			output = "四";
			break;
		case 5:
			output = "五";
			break;
		case 6:
			output = "六";
			break;
		case 0:
			output = "日";
			break;
		}
		return output;
	}
	
	

}
