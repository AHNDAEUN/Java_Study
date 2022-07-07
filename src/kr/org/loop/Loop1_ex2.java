package kr.org.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		//1. 1번 대문자 2번 소문자 
		// 	 1번이면 대문자 A-Z
		//	 2번이면 소문자a-z
		
				
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 대문자 2번 소문자 입력하시오."); 
		int eng = sc.nextInt();
		
		/* 2번째 방법 int i=97;
		int j=123;
		
		if(eng==1) {
			i=65;
			j=91;
		}
		for (int c=i;c<j; c++) {
			System.out.println((char)c);
		}*/
		
		
		
		
		//주석 단축키 드레그 , ctrl+/
		/* A= 65 Z:90
		 * a= 97 z=122
		 * 1. if(eng==1) { 
			for( int i= 65; i <=91; i++ ) {
				System.out.println((char)i);
				
				else {
			for (int i = 97; i<=123; i++) {
				System.out.println((char)i);
		 */
		
		if(eng==1) { 
			for( char i= 'A'; i <='Z'; i++ ) {
				System.out.println(i);
		}
		}else {
			for (char i = 'a'; i<='z'; i++) {
				System.out.println(i);
			}

		//---------------------------------------------
			
			//2. 1-10까지 합 구하기
			//sum=0;
			//sum=sum+1;
			//sum=sum+2;
			//sum=sum+3;
			//.....
			//sum=sum+10;
			
		int sum =0; // 합을 담을 변수
		for (int start =1; start<=10; start++) {
			sum = sum+start;
			
		}
		
		System.out.println(sum);
		}
		
		//3. id. pw를 입력해서 로그인 판단 
				//	 최대 5번까지만 시도 가능
				// 	 로그인이 성공하면 그즉시 종료 (조건식이 false여야 종료)
				int yid = 1234; // 회원가입시 입력한 id
				int ypw = 5678;// 회원가입시 입력한 pw
				
				boolean  check =false;
				int count =0;
				for(count =0; count<5; count++) {
					System.out.println("id 입력");
					int id = sc.nextInt();
					System.out.println("pw 입력");
					int pw = sc.nextInt();
					
					if(id==yid&&pw==ypw) {
						System.out.println("로그인 성공");
						check =! check; //! ~ 같지 않음 반대  
						count=1000;
						break;
						
					}else {
						System.out.println("로그인 실패");
					}
				}//for 끝
				
				
				//1.로그인이 성공
				//2.로그인이 5번 전부 실패
				
				
				//if(count==5) {
				//	System.out.println("은행 방문");
				//}else{
					//System.out.println("게임 시작");
				//}
				
				if(check) {
					System.out.println("게임 시작");
				}else {
					
					System.out.println("은행 방문");
				}
					
					
				System.out.println("Finish");
				}
}