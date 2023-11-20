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
		System.out.println("�п�J");
		String a = scan.next();
		System.out.println("��J��: " + a);
	}
	
	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J");
		String a = scan.next();
		String b = scan.next();
		System.out.println("��J��: " + a + b );
	}
	
	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J");
		String a = scan.nextLine();
		System.out.println("��J��: " + a);
	}
	
	@Test
	public void scannerTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�Ʀr:");
		int a = scan.nextInt();
		System.out.println("��J��: " + a);
	}

	@Test
	public void switchTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�Jscore:");
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
		
		//���]���ѬO�P�_x x��r��J  y�ѫ�P���X(��r��X) y�Ʀr��J  
	@Test
	public void switchTest4() {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
//		System.out.println("S: " + s);
		int i = 0;
		int n = scan.nextInt();
			switch(s) {
			case "�@":
				i = 1;
				break;
			case "�G":
				i = 2;
				break;
			case "�T":
				i = 3;
				break;
			case "�|":
				i = 4;
				break;
			case "��":
				i = 5;
				break;
			case "��":
				i = 6;
				break;
			case "��":
				i = 7;
				break;
			}
		
		int ans = i + n;
//		System.out.println("ANS: " + ans);
		
			switch(ans % 7) {
			case 1 :
				System.out.println("�@");
			break;
			case 2 :
				System.out.println("�G");
				break;
			case 3 :
				System.out.println("�T");
				break;
			case 4 :
				System.out.println("�|");
				break;
			case 5 :
				System.out.println("��");
				break;
			case 6 :
				System.out.println("��");
				break;
			case 0 :
				System.out.println("��");
				break;
			}
		
	}
	
	@Test
	public void switchTest5() {
		Scanner scan = new Scanner(System.in);
		int weekday = scan.nextInt();
		int days = scan.nextInt();			
		System.out.printf("���ѬP��%s,%d�ѫ�P��%s", test(weekday), days, test(weekday+days) );
		
	}
	
	public String test(int i) {
		String output = "";
		switch(i % 7) {
		case 1:
			output = "�@";
			break;
		case 2:
			output = "�G";
			break;
		case 3:
			output = "�T";
			break;
		case 4:
			output = "�|";
			break;
		case 5:
			output = "��";
			break;
		case 6:
			output = "��";
			break;
		case 0:
			output = "��";
			break;
		}
		return output;
	}
	
	

}
