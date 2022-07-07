package com.naver.org;

import java.util.Scanner;

public class control3_ex1 {
 public static void main(String[] args) {
	// 국어, 영어, 수학
	 // 총점, 평균 계싼
	 // 평균이 90점 이상이면 A
	// 평균이 80점 이상이면 B
	// 평균이 70점 이상이면 C
	// 평균이 60점 이상이면 D
	//  그 외 F
	 

	 Scanner sc = new Scanner(System.in);
 
	 
	 System.out.println("점수를 입력하세요");
	 
	 int kor = sc.nextInt();
	 int mat = sc.nextInt();
	 int eng = sc.nextInt();
	 
	 int total= kor+mat+eng;
	 int avg= total/3;
	 
	 if(avg>=90) {
		 
		 System.out.println("A");
	 
	 } else if (avg<90 && avg>=80) {
		 
		 System.out.println("B");
	 
	 }else if (avg<80 && avg>=70) {
		 
		 System.out.println("C");
		 
	 
	 }else if (avg<70 && avg>=60) {
		 
		 System.out.println("D");
	 
	 } else{ // 마지막은 조건식이 필요없음 나머지 그외 값에 적용
	   
		 System.out.println("F");
	 }
 }
}
