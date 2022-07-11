package kr.org.loop;

import java.util.Scanner;

public class Loop5 {
public static void main(String[] args) { // =>단축키 main+ ctrl +spacebar
	
	Scanner sc= new Scanner(System.in);
	
	
//	int i =0;
//	while ( i<5) { //
//		System.out.println( " Hello World ");		
//		i++;
//	
//}
	
		boolean check= true;
		while(check){
		System.out.println( " 1. 성적입력 ");
		System.out.println( " 2. 총점계산 ");
		System.out.println( " 3. 평균계산 ");
		System.out.println( " 4. 종   료 ");
	int select = sc.nextInt();
	if (select ==1) {
		System.out.println( " 성적입력 선택 ");
	}else if(select==2){
		System.out.println( " 총점계산 선택 ");
	} else if(select==3){
		System.out.println( " 평균계산 선택 ");
	} else if(select==4){
		System.out.println( " 종료 선택 "); // 종료방법 break or false (check=false; check!=check; break;)
		//check=false;
		check=!check;
		break;
	} else {
		System.out.println( "1-4까지만 가능 ");
		
	}
		
	}
	
}
}
