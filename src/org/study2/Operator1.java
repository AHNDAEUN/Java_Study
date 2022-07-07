package org.study2;

public class Operator1 {

	
	public static void main (String [] args) {
		
		
		//누적
		int count = 0;
		count = count+1; //1
		count = count+1; //2
		
		count = 0;
		
		++count;// count 자신을 1씩 증가 count+1 (선행)
		count++; // (후행) count+1
		
		
		System.out.println(++count);//3 conut를 먼저 1씩 증가시키고 프린트
		System.out.println(count++);// 프린트를 하고 count 1씩 증가 3
		System.out.println(count);//4
		
		count = 0;
		
		int result = ++count;
		System.out.println(count);//1
		System.out.println(result);//1
		
		
		result = count++;
		System.out.println(count); // 2
		System.out.println(result); // 1 count를 result에 담고 1증가
		
		count = 0;
		
		result = --count;
		System.out.println(count);//-1
		System.out.println(result);//-1
		
		result = count--;
		System.out.println(count); // -2
		System.out.println(result); //-1
		
		
		result = result-=4;
		
		
		
		

		
		
		
	}
}
