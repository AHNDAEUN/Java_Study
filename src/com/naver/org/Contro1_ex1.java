package com.naver.org;

import java.util.Scanner;

public class Contro1_ex1 {

	public static void main(String[] args) {
	
		
		// 키보드로부터 국어 영어 수학 점수를 차례로 입력하세요.
		// 총점과 평균을 계산하시오.
		// 평균이 90점 이상이면 우등상 수상
		// 모든 학생들은 졸업 출력

		// 2. 평균이 90점 이상이면 A 출력
		// 	  평균이 80점 이상이면 B 출력
		//    평균이 70점 이상이면 C 출력
		//	  평균이 60점 이상이면 D 출력
		//	  그외 나머지는 F 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		
		int rnr = 0;
		int tn = 0;
		int dud = 0;
		
		 rnr = sc.nextInt();
		 tn = sc.nextInt();
		 dud = sc.nextInt();
		
		int total = rnr+tn+dud;
		int average = total /3;
		
		System.out.println(average);
		
		
		if (average>=90) {System.out.println("우등생");
			
		}
		
		if(average>=90) {
			System.out.println("A");	
		}
		
		if( average<90 && average >=80) {
			System.out.println("B");	
		}
		
		if(average <80 && average>=70) {
			System.out.println("C");	
		}
		
		if(average<70 && average>=60) {
			System.out.println("D");	
		}
		
		if(average < 60) {
			System.out.println("나가리");	
		}
		
	System.out.println("졸업");
	int sum = 0;
	sum += 2;
	System.out.println(sum);

	}

}
