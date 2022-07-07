package kr.org.loop;

public class Loop1 {

	public static void main(String[] args) {
	System.out.println("Start");
	
	
	//for (초기식; 조건식; 증감식){}
	//for (int i =0; i<5;i=i+1) // for문에서만 선언되는 지역변수 다른 for문에서 또 선언 가능
		for (int i =0; i<1000;i++){ //i++ => i=i+1
		System.out.println("hello world");
	}
			int count =0;
			
		for (int i =0; i<10;i++)
	
			System.out.println(count);
			count++; //증가
	}

}
