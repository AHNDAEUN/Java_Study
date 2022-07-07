package org.study2;

public class Var9 {

	
	
	public static void main (String [] args) {
		
		
		System.out.println("Start");
		//편의점 계산 자동화 프로그램
		
		
		// 물건 가격의 총합계
		int price = 34500;
		
		// 손님이 낸 돈
		
		int money = 50000;
		
		// 잔돈 계산
		int jandon= money-price;//15500
		
		//만원짜리 갯수를 담을 변수
		int man = jandon/10000;// int로 수소점을 계산하면 소수점이 아닌 1로 나옴
		jandon= jandon-(10000*man);
		
		
		// 천원짜리 갯수를 담을 변수
		
		//int chon= (jandon-(mam*10000))/1000;
		
		int chon= jandon/1000;
		jandon= jandon-(1000*chon);
		
		// 백원짜리 갯수를 담을 변수
		// int back =(jandon-(man*10000)-(chon*1000))/100;
		int back= jandon/100;
		jandon= jandon-(100*back);
		//int back = jandon%1000/100;
		
		// 십원짜리 갯수를 담을 변수
		int sib= jandon/10;
		jandon= jandon-(10*sib);
			//int sib = jandon%100/10;
		
		
		System.out.println("만원: "+ man+" 장");
		System.out.println("천원:"+chon+"장");
		System.out.println("백원:"+back+"장");
		System.out.println("십원:"+sib+"장");
		
		System.out.println("Finish");

	
	}


}
