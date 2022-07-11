package org.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {// 기존에 있던 배열을 꺼내서 생성한 다른 배열에 옮기는 작업 
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		//몬스터 생성 {기본 정보} 
		String [] mn = {"리본뚱땡이", "슬라임", "오크", "주황버섯"};// 데이터타입 [] 변수 ={}; 미리 데이터를 입력하는 방식
		int [] mHps= {5,7,10,15};
		
		//캐릭터는 마법사
		//캐릭터 이름 설정
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼 힘 크기
		int magic =6;
		
		//몬스터 파티 생성
		//몬스터 수 입력 (1- 4까지)후 입력한 수만큼 몬스터를 랜덤하게 뽑고 출력
		//해당 몬스터의 hp를 뽑아서 출력
		
		
		System.out.println("몬수터 수 입력(1-4)");
		int mc =sc.nextInt();
		
		String [] mpn= new String [mc]; //moster party names
		 //이름을 저장하려고 하는 새로운 배열을 만듬
		
		
		int [] mpnph= new int [mpn.length]; //moster party ph
		// 몬스터 hp를 저장하기 위해 새로운 배열 생성
		
		for(int i=0; i<mpn.length; i++) {
			int index = random.nextInt(4);
			mpn[i] = mn[index];
			mpnph[i] = mHps[index];
		}

		
		for(int i=0; i<mpn.length; i++) {
						
		System.out.println(mpn[i]+":"+mpnph[i]);
   }					
		System.out.println("");
	
        System.out.println("++++++++++++++++++++++");
		//일회성
        
       //1.사냥 2.도망 
       //도망가기 전까지 계속 공격 
		//0-6미만 랜덤한 데미지로 몬스터를 공격//3
		
        
        boolean check=true;
     
        
        while(check) {
     
       int death= 0;
        System.out.println("1. 사냥 ");
        System.out.println("2. 도망" );
        int select= sc.nextInt();
        
        if(select==1) {
		
				        	for(int i=0; i<mpn.length; i++) {
						
				        		int damage =random.nextInt(magic);
						
				        		System.out.println(mpn[i]+"에게 "+damage+" 피해를 줌");
						
				        		mpnph[i]=mpnph[i]-damage;
				        		
				        		if (mpnph[i]<1) { // hp가 1보다 작을때 데스 올리기
				        			
				        		death++;
				        		}
							
		}
		
		}else {
			break;
		}
        
        System.out.println("사냥한 몬스터수 :" +death);
        
        }// while 끝
		
	
	}
}
