package org.array;

public class Array2 {

	public static void main(String[] args) {
		
		//배열은 어떤 데이터타입이든 상관 x
		//모을려고하는 데이터타입 [] 변수명 = new 모을려고하는 데이터타입 [갯수] 
		String[] names = new String [3];
		
//		names[0]= "iu";
//		names[1]= "choa";
//		names[2]= "suzy";
//		names[3]= ""; // String 생성은 3칸까지만, 컴파일은 0-3가지 4칸 생성했을 때  
//					 //컴파일하면 에러가 발생하지 않지만 실행하면 에러 발생
		              
// java.lang.Array Index OutOfBounds 영역 벗어남 Exception 예외 Index 2 out of bounds for length(배열의 크기) at org.array.Array2.main(Array2.java:13)

	int[] nums = new int[3];	
		
	System.out.println(nums [0]); //인덱스에 값을 넣지 않아도 별도의 지시가 없으면 자동으로 초기화를 진행 (= 0)
	System.out.println(names [0]);
	Scanner [] sc = new Scanner[2];
	
	
	int [] names2 = {1,4,56}; // 배열 3칸을 만들면서 0번 인덱스=1, 1번 인덱스 =4 2번 인덱스 =56
	int names3 []; 
	
	}
	}
