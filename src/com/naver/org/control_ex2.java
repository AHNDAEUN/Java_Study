package com.naver.org;

import java.util.Scanner;

public class control_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String result = "홀수입니다.";
		System.out.println("숫자");
		
		int num = sc.nextInt();
		
		if (num%2==0) {
			result= "짝수입니다.";
			
		}
		
		
		System.out.println(result);
		System.out.println("끝");
	}

}
