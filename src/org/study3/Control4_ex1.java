package org.study3;


import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학
		 // 총점, 평균 계산
		 // 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		//  그 외 F
		 

		 Scanner sc = new Scanner(System.in);
	 
		 
		 System.out.println("점수를 입력하세요");
		 
		/* int kor = sc.nextInt();
		 int mat = sc.nextInt();
		 int eng = sc.nextInt();
		 
		 int total= kor+mat+eng;
		 int avg= total/3; */
		
		 int avg =  100;
		 
		 switch(avg / 10) { 
			case 10:
			case 9:
				System.out.println("A");
			break; 
			case 8:
				System.out.println("B");
			break; 
			case 7: System.out.println("C");
			break; 
			case 6 : System.out.println("D");
			break; 
			
			default: System.out.println("F");
	 }
	}
}
// double float 지정 x

//범위 지정 if-else 같은 것 찾을때 switch