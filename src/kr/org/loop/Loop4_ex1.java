package kr.org.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//분과 초 입력받음
		// ex) (분)1, (초)15
		System.out.println("분 입력");
		int min = sc.nextInt();
		
		System.out.println("초 입력");
		int sec = sc.nextInt();
		
		
		boolean flag= false;
		
		
		for (int m=0; m<60; m++) {
			//여기에 if를 쓰면 초가 선언이 안된 상태라 분만 실행됨
			for (int s =0; s<60; s++) {
				
				System.out.println(m+" 분 : "+s+" 초 ");
			//초는 선언된 중괄호 내에서만 사용가능	, 이중 for문 실행하기위해서 안쪽 for문에 작성해야 실행
				if (min==m&&sec==s) {
					flag=!flag; //!반대값 ex) !true =false 
					break; // if 
					
				} // 선언이 종료되는 두가지: break; false가 될때
				
				}
			
			if(flag) {
				break; // 바깥쪽 for문도 종료시키고 싶을때
			}
				//if문이 들어올 수 있지만 초를 인식하지 못함
			} 
			
}
}

//System.out.println("+++++++++++++++++++++++++++++++");
//
//for (int m=0; m<60; m++) {
//	
//	for (int s =0; s<60; s++) {
//		
//		System.out.println(m+" 분 : "+s+" 초 ");
//		
//		if (min==m&&sec==s) {
//			flag=!flag;  
//			m=60; 
//			break;  
//			
//		} 
//	}
//}	

	
