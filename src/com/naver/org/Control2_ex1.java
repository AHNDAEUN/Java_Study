package com.naver.org;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// 월급입력
		// 1. 정규직 2. 계약직
		//정규직이면 국민연금 1%, 건강보험 1,4% 고용보험 0.5% 산재보험 0,7%
		// 계약직 3.3%
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여 입력");
			int sal = sc.nextInt();

			System.out.println("1. 정규직 2. 계약직");
			int select = sc.nextInt();
			
			
				if (select==1) {
					
					
					/*sal = (int) (sal*0.99);
					sal = (int) (sal*0.986);*/
					
					int tax1= (int) (sal*0.01);
					int tax2=(int) (sal*0.014);
					int tax3=(int) (sal*0.005);
					int tax4=(int) (sal*0.007);
		
					sal = sal - tax1-tax2-tax3-tax4;
				}
				
				else { 	
					
					sal= sal - (int)(sal*0.033);
				
				}
				
				System.out.println(" 실급여: " +sal );
	}

}
