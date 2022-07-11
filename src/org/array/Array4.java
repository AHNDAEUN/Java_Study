package org.array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		int [] nums = new int [1];
//	nums [0] =20;
//	nums [1] = 20;
		
		for (int i=0; i<nums.length; i++) //length 배열의 길이값을 담는 
		{
			System.out.println(i+"번 인데스 값 입력");
			nums[i]=sc.nextInt();
		} // i는 지역변수이고 윗 for문에 선언되었다가 중괄호 속에서만 작동하고 끝나기때문에 아래 포문에 다시 써도됨
		 // 윗 for문 
		
		
			for (int i= 0; i<nums.length; i++) {
				
				System.out.println(nums[i]);
			} //아래 for문
		
		
	
	}
}
