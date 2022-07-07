package org.study2;

public class var6 {

	
	
	
	public static void main(String [] args) {	
System.out.println(" start");
	
	int num1 = 10;
	
	long num2 = 20L;
	
	num2 = num1; // 자동형변환 작은거에서 큰거는 바꿔도 무관함
	num1 = (int)num2; // 강제형변환 큰거에서 작은거로 바꿀때  앞에 ()타입을 넣어야함
	
 // 형변환 (cascading)
	
	
	System.out.println(20+20L);
	
	
	//누가 더 많은 수를 표현하는지 순서-> 자동형변환
	//byte-> short-> int(4)-> long(8)-> float(4)-> double(8)-> char(2)
	
	char ch ='a';
	num1 = ch; 		// 4=2 자동형변환
	num2 = num1;
	float f = num2; // 4=8 강제형변환

	
	int k = 35;
	int m = 35;
	int e = 37;
	int t = k+m+e;
	double v = (double)t/3; 
	
	System.out.println(t);
	
	System.out.println(v);
	
	System.out.println("finish");
	
	
	num1 = 'a'; 
	System.out.println(num1);


	num1 = 'b'; 
	System.out.println(num1);

	
	num1 = 'z'; 
	System.out.println(num1);

	char c = (char)60; 
	System.out.println(c);

	
	
	
}
	
	
}