package org.study2;

public class Var2 {
	public static void main(String [] args) {
		
		float num4;
		num4 = 2.1234f;  //타입이 다르면 안들어가진다 선언한 변수에는 선언한 타입만 들어갈 수 있음
							//ex) float= 4.2; (x), float 4.2f;
		double num = 2.1234;
		float num2 = 2.1234f;
		//float num3 = num
				//num 값을 넣었을때 에러가 뜨는 이유는 float 선언타입이 아닌 더블타입이기때문
		System.out.println(num4);
		System.out.println(567788);
		System.out.println(2.3423432F);
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = kor + math + eng;
		System.out.println(kor);
				
		kor= 50;
		math=50;
		eng=50;
		System.out.println(total);
	
	char ch= '울'; //한글자만 담을 수 있음 영문 absd, 한글 아, 에 이,오 
	System.out.println(ch);
	
	// 변수타입 초기값
	char ch2 = ' '; //스페이스 한번
	double de = 0.0;
	float d2 = 0.0f;
	
	//프로그램의 최소 단위는 1byte	
	
	
	boolean check = true;
	
	check = false;
	
	System.out.println(check);
	
	//boolean check2 = false; //초기값
	
	//
	//String name = "야옹";
	//String name2 = new String ();
	
	System.out.println('b'); //char타입
	System.out.println('1');//char타입
	System.out.println("멍멍");//Spring타입
	
	}

}
