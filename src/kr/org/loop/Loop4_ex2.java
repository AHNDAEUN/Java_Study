package kr.org.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
	
		// FPS
		// 총알:
		// 탄창:30발 3개
		// 1. 단발 30발 2. 점사 10발
		 
		
		Scanner sc= new Scanner( System.in );
		
	
		for( int b=0; b<3; b++ ) {
					
			System.out.println(" 1. 단발 2. 점사 ");

			int g= sc.nextInt();
			
		if(g==1) {
		
				for(int c=0; c<30; c++) {
					
					System.out.print("탕"); // ln(enter, 줄바꿈) ln x 이어쓰기 
					
			
		}
			
		}else if (g!=1){
			
			for(int c=0; c<10; c++) {
				
				System.out.print("탕탕탕");

		}

	}System.out.println(""); // 


}
}
}

//-------------------------------------------
//**드레그 +alt + 화살표 복사 옮기기


//// (int mag=0; mag <3; mag++){
//system.out.println("1.단발, 2점사");
//int g= sc.nextInt();
////
//IF (select==1){
//	for (int b=0; b<30; b++){
//system.out.println(탄창: "mag+"총알:"+
//}
//else}
// for (int b=0; b<30' b++){
//system.out.println(탄창: "mag+"총알:"+
//}



//--------------------------------------
//(int mag=0; mag <3; mag++){
//System.out.println("1.단발, 2점사");
//int select= sc.nextInt();
//int count=0;
//String sound= "탕탕탕";
//if(select==1){
//	count=30; //1이면 30 1아니면 30x
//	sound= "탕";
//}
//for (int b=0; b<10; b++){
//System.out.println(sound);
//}

		
//------------------------------------
//(int mag=0; mag <3; mag++){
//System.out.println("1.단발, 2점사");
//int select= sc.nextInt();
//int inc=3;
//String sound= "탕탕탕";
//if(select==1){
//	inc=1; 
//	sound= "탕";
//}
//for(int b=0; b<10; b=b+inc){
//System.out.println(sound);
//}