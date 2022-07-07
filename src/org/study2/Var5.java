package org.study2;
import java.util.Scanner;

public class Var5 {

	public static void main(String [] args) {
		System.out.println("Strat");
		
		Scanner scanner = new Scanner(System.in);
	// 입력 받은 수를 저장할 변수
		int num = 0;
		int sum = 0;
		// 합계를 저장할 변수
		
		System.out.println("첫번째 숫자 입력");
		num = scanner.nextInt();//3
		sum = sum + num;
		
		System.out.println(" 두번째 숫자 입력 ");
		num = scanner.nextInt();//5
		sum = sum + num;
		
		System.out.println(" 세번째 숫자 입력 ");
		num = scanner.nextInt();//5
		sum = sum + num;
		System.out.println(sum);
		

		
	}
}
