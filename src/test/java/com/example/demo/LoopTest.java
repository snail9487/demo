package com.example.demo;

import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {
	@Test
	public void loopTest() {
		a: for (int i = 1; i <= 9; i++) { // �i�H��for�j��@�Ӽ���
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
		// ����:(�϶��W�� - �϶��U�� + 1) + �϶��U����
		// 1~99 :
		double random = Math.random() * (99 - 1 + 1) + 1;
		// 20~50 :
		double random1 = Math.random() * (50 - 20 + 1) + 20;
		System.out.println("=============");
		
		Random ran = new Random();
		//Random ���O�̪� nextInt(���i)�|����:	 0~�p���J���i����
		//���� 1~99
		int a =ran.nextInt(99) + 1;
	}
	
	@Test
	public void guessTest() {
		int answer = (int)(Math.random() * (98 - 2 + 1)) + 2; //(int)����Ƴ���
		System.out.println(answer);
		int max = 99, min = 1;
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			System.out.printf("�п�J�b %d ~ %d �d�򤺪��Ʀr:", min , max);
			input = scan.nextInt();
			if(input <= min || input >= max) {
				continue;
			}
			if(input == answer) {
				System.out.println("����F!");
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
