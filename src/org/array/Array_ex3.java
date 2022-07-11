package org.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적프로그램
		//프로그램이 시작되면 메세지가 뜸 
		//1. 학생정보 입력
		//  -학생 수 입력
		//  -이름, 번호, 국어, 영어, 수학, 입력 후 계산 총점, 평균 (국수영 입력하고 enter하면 자동으로 총점 평균 생성)
		//2. 학생 정보 조회
		//  -이름, 번호 ,총점, 평균 출력
		//3. 학생 정보 검색
		//  -검색할 학생의 번호를 입력  
		//  -입력한 번호와 일치하는 학생의 모든 정보 출력
		//  -일치하는 번호가 없으면 " 없는 번호입니다." 출력 
		//4. 학생 정보 삭제 
		//  -삭제할 학생의 번호를 출력
		//  -입력한 번호와 일치하는 학생의 정보 삭제 (배열을 한칸 삭제)
		//  -일치하는 번호가 없으면 " 없는 번호입니다." 출력 
		//5. 학생 정보 추가
		//  -학생 정보 입력 추가 (배열 한칸 추가)
		//6. 프로그램 종료
		
		//작업이 종료되기 전까지 다시 프로그램 반복 
		
		Scanner sc = new Scanner(System.in);
		
	
		boolean check =true;
		
		String [] names= null;
		int [] nums = null;
		int [] kor= null;
		int [] engs= null;
		int [] maths= null;
		int [] totals = null;
		int [] avgs = null;
				
		
		while (check) {
		System.out.println( " 1. 학생 정보 입력 " );
		System.out.println( " 2. 학생 정보 조회 " );
		System.out.println( " 3. 학생 정보 검색 " );
		System.out.println( " 4. 학생 정보 삭제 " );
		System.out.println( " 5. 학생 정보 추가 " );
		System.out.println( " 6. 프로그램 종료 " );
		
		int select= sc.nextInt();
		
		if (select==1) { 
			//1. 학생정보 입력
			//  -학생 수 입력
			//  -이름, 번호, 국어, 영어, 수학, 입력 후 계산 총점, 평균 (국수영 입력하고 enter하면 자동으로 총점 평균 생성)	
			
						
		}
		else if(select==2){
			//2. 학생 정보 조회
			//  -이름, 번호 ,총점, 평균 출력
			if(names != null) {
				
			
			
			
			}
		else if(select==3){
			
			//3. 학생 정보 검색
			//  -검색할 학생의 번호를 입력  
			//  -입력한 번호와 일치하는 학생의 모든 정보 출력
			//  -일치하는 번호가 없으면 " 없는 번호입니다." 출력 
			
			
		}
		else if(select==4){
			//4. 학생 정보 삭제 
			//  -삭제할 학생의 번호를 출력
			//  -입력한 번호와 일치하는 학생의 정보 삭제 (배열을 한칸 삭제)
			//  -일치하는 번호가 없으면 " 없는 번호입니다." 출력 
			
			
		}
		
		else if(select==5){
			
			//5. 학생 정보 추가
			//  -학생 정보 입력 추가 (배열 한칸 추가)
			
			
		}
		else {
			
			
		}break;		
		
	}
		
		
		
		
		
	}
	}
}