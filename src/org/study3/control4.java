package org.study3;


public class control4 {
public static void main(String[] args) {
	
	String select ="a"; //int select =1 ;도 가능 ex) case 1:
	switch (select) {
	case "aaa" : System.out.println("1 일때 진행");
	break; 
	case "abc": System.out.println("2 일때 진행");
	break; 
	
	default: //그외나머지, 마지막 자리라 break 써도 안써도 상관없음 
		System.out.println("그외 나머지 진행");
	
	//default // 순서 상관없음 
			//대신 중앙에 올 경우 break를 걸어줘야함
	//case 2: System.out.println("2 일때 진행");
	//break; / break를 2칸 뛰고 걸어주면 2개 진행 후 멈춤
	
	}
	
	
	
}
}
