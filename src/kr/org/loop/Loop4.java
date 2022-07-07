package kr.org.loop;

public class Loop4 { // 이중 for문

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {// i 단수
			for(int j =1; j<10; j++) { // j 1-9
				System.out.println(i+" * "+j+" = "+i*j); // 안쪽 for문 상승 반복이 끝나면 바깥 for문이 상승
				
			}// 안쪽 for 끝
			
			
		}//바깥 for 끝

		System.out.println("====================================");
		
		for (int i=0; i<3; i++) {
			
			for(int j=0; j<5; j++) {
				System.out.print(" * ");
			}
			System.out.println();// enter치고 내려가
				
			
		}
		
		System.out.println("====================================");
			for (int i=0; i<5; i++) {
			
			for(int j=i; j<5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			
}	
		
	}// main 끝

}
