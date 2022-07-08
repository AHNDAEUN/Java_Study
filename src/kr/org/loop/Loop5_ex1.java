package kr.org.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		
//				int yid=1234;
//				int ypw=5678;
//		
//				
//			 boolean check = true;
//			 //while(true)
//			 while(check){
//				
//				 System.out.println("아이디를 입력하세요.");
//				int id=sc.nextInt();
//				
//				System.out.println("비밀번호를 입력하세요.");
//				int pw=sc.nextInt();	
//				
//				if(id==yid&&pw==ypw) {
//					System.out.println("로그인 정상");
//					check=!check;
//					break;
//				}else {
//					
//					System.out.println("로그인 실패");
//					
//
//				}
//				
//				//id입력 pw입력
//				//로그인 판단, 로그인 성공하면 종료
//				//실패하면 다시 입력 
//	}
//
//	}
//}
//--------------------------------------------------------------------------------
		//id입력 pw입력
				//로그인 판단, 로그인 성공하면 종료
				//실패하면 다시 입력 
//		
//		int yid=1234;
//		int ypw=5678;
//
//		
//	 boolean check = true;
//	 //while(true)
//	 while(check){
//		
//		 System.out.println("1. 로그인 시도");
//		 System.out.println("2. 종     료");
//		 int select =sc.nextInt();
//		 
//		 
//		 switch(select) {
//		 
//		 case 1:
//			 System.out.println("아이디를 입력하세요.");
//				int id=sc.nextInt();
//				
//				System.out.println("비밀번호를 입력하세요.");
//				int pw=sc.nextInt();	
//				
//				if(id==yid&&pw==ypw) {
//					System.out.println("로그인 정상");
//					check=!check;
//					break;
//				}else {
//					
//					System.out.println("로그인 실패");
//		 }
//				
//				break;
//				default :
//				check=!check;
//				
//		 } //switch 끝
//	 }  //while 끝
	 
	
	 //--------------------------------------------------------------------------
	 
	 // 로그인을 안했으면 프로그램이 종료
	 // 로그인이 성공했으면 게임시작
	 // 시작 레벨은 1
	 // 만렙은    15
	 // gold : 1000 
	 //조건: 모든 모스터의 경험치는 동일
	 //레벨 1 -> 2 :몬스터 3마리 퇴치
	 //레벨 2 -> 3 :몬스터 6마리 퇴치
	 //레벨 3 -> 4 :몬스터 9마리 퇴치
	 //레벨 4 -> 5 :몬스터 12마리 퇴치
	 //....
	 //레벨 14 -> 15 :
		
	 // 5 렙 달성시 축하금으로 1000gold 지급
	 //10 렙 달성시 축하금으로 2000gold 지급
	 //15 렙 달성시 축하금으로 3000gold 지급
	 
//	 
//		int yid=1234;
//		int ypw=5678;
//		int gold= 1000;
//
//boolean check = true;
//boolean login = true;
////while(true)
//while(check){
//	
//	 System.out.println("1. 로그인 시도");
//	 System.out.println("2. 종     료");
//	 int select =sc.nextInt();
//	 
//	 
//	 switch(select) {
//	 
//	 case 1:
//		 System.out.println("아이디를 입력하세요.");
//			int id=sc.nextInt();
//			
//			System.out.println("비밀번호를 입력하세요.");
//			int pw=sc.nextInt();	
//			
//			if(id==yid&&pw==ypw) {
//				System.out.println("로그인 정상");
//				check=!check;
//				break;
//			}else {
//				
//				System.out.println("로그인 실패");
//				login =! login;
//	 }
//			break;
//		default :
//		check=!check;
//
//	 } //switch 끝
//	 }  //while 끝
//	
//	System.out.println(" 게임 시작 ");
//	System.out.println(" **레벨1** ");
//	
//	while(login) {
//		for (int a= 1; a<=15; a++) {
//			
//			for (int b= 1; b<= ((a-1)*3); b++) {
//				System.out.print("뿅뿅 ");
//			}
//			
//			if(a>1)
//				System.out.print( a +" 뾰로롱 ");
//
//			System.out.println();
//
//			if(a%5==0) { 
//				gold = gold + (a*200);
//				System.out.println("보상 : " + (a*200) + "현재 보유 gold : " +gold );
//			}	
//	}
//		break;
//	}
//	
	//============================================ 강사님 예제 답
	
	
	int yid=1234;
	int ypw=5678;
boolean check = true;
boolean flag= false;
//while(true)
while(check){

 System.out.println("1. 로그인 시도");
 System.out.println("2. 종     료");
 int select =sc.nextInt();
 
 
 switch(select) {
 
 case 1:
	 System.out.println("아이디를 입력하세요.");
		int id=sc.nextInt();
		
		System.out.println("비밀번호를 입력하세요.");
		int pw=sc.nextInt();	
		
		if(id==yid&&pw==ypw) {
			System.out.println("로그인 정상");
			check=!check;//로그인 성공했을때도 f
			flag=!flag;
		}else {
			
			System.out.println("로그인 실패");
			
 
		}
		break;
	default :
	check=!check;

 } //switch 끝
 }  //while 끝

  flag=true;
if (flag) {// ..flag true면 로그인 성공 false면 로그인 실패
	System.out.println(" 게임을 시작합니다. ");
	int level=1;
	int gold=1000;
	
	for(level=1; level<15; level++) {
		//System.out.println(level);
		
		
		if(level%5==0) {
			gold = gold+level/5*1000;
			
		
		for(int mon=0; mon<3*level; mon++) {
			
			System.out.println(mon+1+" *ㅁ* 꾸엑 ");
			// mon+1 하는 이유는 컴퓨터는 0부터 시작하기 때문에 
			
		}
	
		
		System.out.println("======================");
		

			
		}
		gold = gold+3000;
	} 
	System.out.println("최종레벨:"+level);
	System.out.println("최종gold:"+gold);
}
System.out.println(" 프로그램을 종료합니다. ");

	}

	
}