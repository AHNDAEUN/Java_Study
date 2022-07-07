package org.study2;
import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("나이를 입력 하세요");
		//1. 나이를 입력받아서 10대 유무를 판단 
		
		int age = sc.nextInt();
		String result = age>=10 &&  age<20 ?" 10대 " : " 10대 아님 ";
			
		System.out.println(result);
		
			
		System.out.println("물건의 가격을 입력 하세요");
		//2. 물건의 가격이 30000 이상이면 배송료 무료
		//	 아니면 배송료가 가격의 10%로 책정
		// 	 최종 지불비용을 출력하세요
	
		
		
		
		int pro= sc.nextInt();
		
		pro = pro >=30000? pro:pro+(int) (pro*0.1);
	
		//int check = pro >= 30000 ?  0  : (int)(pro* 0.1);
	
	// pro = pro+check
		
	System.out.println(pro);
	
	
	}

}
