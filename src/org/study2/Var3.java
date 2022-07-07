package org.study2;
import java.util.Scanner;

public class Var3 {
	public static void main(String [] args) {
		System.out.println("Start");
	Scanner sc = new Scanner(System.in); //키보드와 연결

			int gion=0;
			double cheon=0.0;
			String name =""; // 초기값

				//sysout ctrl+ space  프린트문 자동완성
			
			
						System.out.println("현재 온도를 입력하세요");
						gion = sc.nextInt();// nextInt 정수를 받기 위해서 사용
						System.out.println("현재 온도는 ");	
						System.out.println(gion);
				
				
				System.out.println("현재 체온을 입력하세요");
			cheon = sc.nextDouble(); // 문자열만 받을 수 있음 next char(x)
				System.out.println("현재 체온은 ");	
				System.out.println(cheon);
	
		
		
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
			System.out.println("너의 이름은 ");	
			System.out.println(name);
			System.out.println("Finish");
			
	}
}
             