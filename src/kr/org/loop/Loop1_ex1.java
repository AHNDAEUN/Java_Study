package kr.org.loop;

import java.util.Scanner;//

public class Loop1_ex1 {

	public static void main(String[] args) {
		// 0-9까지 출력하는 반복문
		// 단, 출력은 짝수만 출력
		
		for(int i=0; i<10; i++) {
			if(i%2==0)
			
			System.out.println(i);
		}
		
		//0-9 사이의 짝수만 출력
		//단, if문을 사용하지 않고 출력
		
		/*for (int i= 0; i<10; i+=2) {
			System.out.println(i);*/
			
			for (int i= 0; i<10; i++) {//i=i+1
				System.out.println(i);
				//i++;
		}
				//멍멍 출력
				// 출력하는 횟수를 받아서 그횟수만큼 출력
			
			Scanner sc = new Scanner(System.in);
			System.out.println("횟수를 입력하세요.");
			
			int num = sc.nextInt();
			
			for (int i= 0; i<num; i++ )
			System.out.println("멍멍");
			
			
	}


}
