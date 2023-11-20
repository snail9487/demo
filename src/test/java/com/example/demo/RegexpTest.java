package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {

	@Test
	public void regexpTest() {
		String str = "0912-345-678";
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d"; 
									//   "\d"=(0-9)		"\"����Ÿ��ϫ᭱�@�ӲŸ��L�ĤơA�����W�s�b
									//	 "\\"�ϸ���Ÿ��L��
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";  
		String pattern = "\\d{4}(-\\d{3})2";	// () ���ե�
		
		System.out.println(str.matches(pattern));

		
		String pattern1 = "\\(\\d{2}\\)\\d{8}"; //�榡:(00)12345678
		
	}
	
	@Test
	public void regexpTest1() {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String pattern1 = "0\\d{1,3}-\\d{7,8}";
		String pattern2 = "\\(\\d{2,4}\\)\\d{7,8}";
		if(input.matches(pattern1)) {
			System.out.println(input + "�ŦX�榡�@" + pattern1);
		}else if(input.matches(pattern2)){
			System.out.println(input + "�ŦX�榡�G" + pattern2);
		}else {
			System.out.println("���ŦX�榡");
		}
		
	}
	
	@Test 
	public void regexpTest2() {
		Scanner scan = new Scanner(System.in);
		String input;
		String pattern = "[A-Za-z&&[^A-Ha-h&&[^CGcg]]][1-2][0-9]{8}";
		for(;;) {
			input = scan.next();
			System.out.println(input.matches(pattern));
		} 
		
	}
	
}
