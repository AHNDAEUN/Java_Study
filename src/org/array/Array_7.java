package org.array;

public class Array_7 {

	public static void main(String[] args) {
		// 정렬하는 방법

		int [] ar = {4,1,7,10,3}; //내림차순= 낮은 숫자에서 높은 숫자로 올라가는 순서
		
		// 1,3을 비교 후 높은 숫자를 앞으로 보내고 첫번째 숫자와 3,4,번째 숫자를 비교해서 높은 숫자를 앞으로 자리를 바꾸는 방법
		//첫번째는 4번 비교하여 반복
		//두번째는 3번 비교하여 반복
		//세번째는 2번 비교하여 반복
		//네번째는 1번 비교하여 반복
		
		
		for (int i=0; i<ar.length-1; i++) {//비교하기위해 배열의 크기보다 1개 적게 돈다
			//i=0일떄, 1,2,3,4번쨰와 비교
			//i=1일때, 2,3,4번째와 비교
			//i=2일때, 3,4번째와 비교
			//i=3일때, 4번째와 비교
			
			for (int j=i+1; j<ar.length;j++) { //반복문이 크게 돌때마다 1씩 증가하는 i를 넣어줘야 하나를 뺴고 나머지와 비교가 가능함 
				if(ar[i]<ar[j]) {// ar에 들어있는 j 인덱스보다 ar에 들어있는 a가 작다면 
					
					int tmp= ar[j]; //tmp 임시저장값
					
						ar[j] =ar[i]; // i=0 일떄 j=0 i=1
					    ar[i] =tmp; // ㅁㅁㅁㅁㅁㅁ 5개의 칸을 비교하며 자리를 옮기기 위해 비어있는 자리가 필요함 
					    			//1,2,3,4,5의 숫자 중 1,2를 비교하여 값이 큰 2을 앞으로 넣었을 때 j=i 바뀐 칸과 기존 칸에 2만 들어가게 되고 1을 넣을 자리가 부족함
					    			// 그래서 임시저장값 tmp로 자리를 만들어 2,1이 순서가 바껴도 둘다 들어갈 수 있게 함 
					
				
	}
}
				
              
				
}
			for (int i=0; i<ar.length; i++) {
			
			System.out.println(ar[i]);
			
			
		}
		
		
		
	}

}
