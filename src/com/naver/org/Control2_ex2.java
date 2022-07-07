package com.naver.org;

import java.util.Scanner;

public class Control2_ex2 {

	private static char a;

	public static void main(String[] args) {
		
		
		//char ch ='b'; // -> a
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1-5사이의 숫자 입력 ");
		int num = sc.nextInt();//1-5;
		System.out.println(" 알파벳을 입력 ");
		char ch = sc.next().charAt(0);
		ch = (char)(ch+num);
		//num:1 ch:a 출력: b
		//num:2 ch:a 출력: c
		//num:1 ch:z 출력: a
		//num:2 ch:z 출력: b
		
		//ch num= a
		int result = ch + num;
		//소문자가 범위를 벗어날을 때 제어해줌
		if(result>'z') {// int영역이지만 primitive영역은 자유롭게 형변환 가능
				result= result-'z'-1;//2
				result= 'a'+result;
					//'a'+result-1;/ 96+result;

		}
		
		//대문자가 범위를 벗어났을 때
		
		if (result>'Z'&& result <'a') {
			result = result-'Z'-1;
			result = 'A'+result;
			}
		
		
		ch= (char)result;
		System.out.println("ch:"+ch);
		//num: 2 ch :z
			
			
		}
			
	
	
	}
