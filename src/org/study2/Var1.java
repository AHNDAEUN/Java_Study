package org.study2;

public class Var1 {

	public static void main (String [] args) {
	// 변수 선언 공식
	// 데이터타입명 변수명
		byte  num;
			// 대입 연산자 =: 오른쪽의 결과를 왼쪽에 대입해라
		num= 10;
		System.out.println(num);
		num =35;
		System.out.println(num);
		
		int num2;
		num2= 400000;
		
		long num3;
		num3 = 10000L;
		
	byte num4 = 100+10;
	//num4= num4+10;

	long num5 = 100L; 
 //long num5 = 3ㅣ; 중복선언 에러

	
	//선언
int num6;
num6 = 10; // 제일 처음 값을 넣는 것 = 초기화
			// 모든 변수는 초기화 하지않으면 사용시 에러가 발생
System.out.println(num6);

int num7 =10;// 선언과 초기화를 같이 할 수 있음 
	}

}
