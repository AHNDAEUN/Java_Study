package org.study3;


import java.util.Scanner;

public class control_3 {

	public static void main(String[] args) {
		// main ctrl+spacebar
		int num = 10;  //지역변수는 중괄호가 있으면 존재 없으면 사라짐
					  // 메서드안에서 생성된 것 지역변수
		//(메서드가 실행되면 생성되었다가 영역이 끝나면 같이 사라짐)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-3 숫자 입력");
		int select = sc.nextInt();
		
		
		//int num =1; 한번 더 쓰면 에러: 타입,변수의 중복
		
		
		if (select==1) {
		int count =1;	
			System.out.println("1 선택");
		}
		
		else if(select==2) { 
			int count =1; //중괄호 안에 선언된 conunt도 지역변수 
			//그 영역 안에서만 사용되는 것 
			//영역(중괄호)가 끝나면 같이 삭제됨
			//필요시에만 사용하는 변수는 중괄호 안에 선언
		System.out.println("2 선택");	
		}
		
		else {
			int count =1;
		System.out.println("3 선택");
		}
		
		System.out.println(num);
		//System.out.println(count);
	}

}