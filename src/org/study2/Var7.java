package org.study2;

public class Var7 {

	public static void main(String[] args) {
		int age = 20;
		String name = "iu";
		System.out.println(name+age);
		System.out.println(1+"1"); //11
		System.out.println(1+1+"1");//21
		System.out.println("1"+1+1);//111
		System.out.println(1+'1'); // 형변환이 가능해서 char가 int타입으로 변함
		
		
		
		int count = 32;
		
		int ex = count%5;
		System.out.println(ex);
	
	}

}
