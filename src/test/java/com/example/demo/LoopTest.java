package com.example.demo;

import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {
	@Test
	public void loopTest() {
		a: for (int i = 1; i <= 9; i++) { // 可以給for迴圈一個標籤
			for (int j = 1; j <= 9; j++) {
				if (j == 2) {
					break a;
				}
				System.out.printf("%d*%d=%2d ", i, j, i * j);
			}
			System.out.println();
		}
	}

	@Test
	public void randomTest() {
		// 公式:(區間上限 - 區間下限 + 1) + 區間下限值
		// 1~99 :
		double random = Math.random() * (99 - 1 + 1) + 1;
		// 20~50 :
		double random1 = Math.random() * (50 - 20 + 1) + 20;
		System.out.println("=============");
		
		Random ran = new Random();
		//Random 類別裡的 nextInt(整數i)會產生:	 0~小於輸入整數i的值
		//產生 1~99
		int a =ran.nextInt(99) + 1;
	}
	
	@Test
	public void guessTest() {
		int answer = (int)(Math.random() * (98 - 2 + 1)) + 2; //(int)取整數部分
		System.out.println(answer);
		int max = 99, min = 1;
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			System.out.printf("請輸入在 %d ~ %d 範圍內的數字:", min , max);
			input = scan.nextInt();
			if(input <= min || input >= max) {
				continue;
			}
			if(input == answer) {
				System.out.println("答對了!");
				break;
			}
			if(input > answer) {
				max = input;
			}
			else if(input < answer) {
				min = input;
			}			
		}
	}
	
	@Test
	public void abab() {
		int[] answer = new int[4];
		for(int i=0;i<4;i++) {
			answer[i] = (int)(Math.random()*10);
			System.out.print(answer[i]);
		}
		Scanner scan = new Scanner(System.in);
		int[] guess = new int[4];
		int a = 0,b = 0;
		for(int i = 0;i<4;i++) {
			guess[i] = scan.nextInt();
		}
	}
	
	
	@Test
	public void test() {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println(input);
	}
}
