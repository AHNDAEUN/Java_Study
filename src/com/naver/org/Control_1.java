package com.naver.org;

import java.util.Scanner;

public class Control_1 {

	public static void main(String[] args) {
		//제어문
		
		//1. 단일 if문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();

		
		if (num%2 == 0) // 조건식이 TRUE일때 어디까지인지 작성하는 공간 
						// 중괄호 생략가능= 조건식 중괄호가 TRUE일때, 한줄일 경우만 생략가능
			{System.out.println(num+ " 은(는) 짝수입니다. ");
			}	
		
		
		if (num < 10) {System.out.println(num+ " 은(는) 10미만 ");
		
		}
			System.out.println(num+ "Finish"); // 짝수든 홀수든 다 FINISH로 출력이 된다.
	
			
		
	}

}
