package org.array;

public class Array_1 {

	public static void main(String[] args) {
		
		
		
		//배열선언
		//*변수선언 공식 
		//*데이터타입명 변수명
		//모을려고하는 데이터타입 [] 변수명
		//String name;
		//Scanner sc;
		//[(배열)I(int)@(구분자)515f550a(메모리주소)	
		
		int [] nums= new int[3]; //Heap영역에 new int 타입을 3개 만들고 num에 담으시오. 
		char [] name = new char[2];
		
		
		nums[1]= 30; //nums의 []번째 칸으로 이동
		nums[2]= 50;
		nums[0]= 10;
		int age= 30;
	name [0] = 'z';
	name [1] = '한';
		System.out.println(age);
	System.out.println(nums);
	System.out.println(nums[1]); //nums의 1번 인덱스값으로 이동
	System.out.println(nums[0]); 
	System.out.println(nums[2]);
	System.out.println(name [0]);
	System.out.println(name [1]);
	}

}