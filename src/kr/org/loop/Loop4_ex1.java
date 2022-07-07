package kr.org.loop;

public class Loop4_ex1 {

	public static void main(String[] args) {
		
		//분과 초 입력받음
		// ex) (분)1, (초)15
		
		for (int m=0; m<60; m++) {
			
			for (int s =0; s<60; s++) {
				
				System.out.println(m+" 분 : "+s+" 초 ");
			}
		}

	}

}
