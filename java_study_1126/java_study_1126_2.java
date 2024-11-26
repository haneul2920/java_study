package java_study_1126;

public class java_study_1126_2 {

	public static void main(String[] args) {
		// ★배열★
		/*
		 * 배열은 ★★★같은 타입★★★의 데이터들이 순차적으로 저장되는 ★★★★★공간★★★★★
		 * 배열은 0부터 시작합니다.
		 * 왜 0부터 시작 할까?
		 * => 자바(미국) 미국은 숫자를 0부터 세기 때문이다
		*/
		
		
		int [] array = {10,20,30,40}; // 배열 초기화
		//array 라는 int 형 배열에 10,20,30,40 총 4개의 데이터를 저장함.
		
		System.out.println("0번째 배열값 : "+array[0]);
		System.out.println("1번째 배열값 : "+array[1]);
		
		int sum = array[1] + array[3]; //첫반째 배열 값 + 세번째 배열 값
		System.out.println("총 합은 : " + sum);
		
		// 순서? => 인덱스(프로그래밍에서는 순서를 인덱스라고 합니다.)
		
		int [] array2 = {10,20,30,40,10,20,30,40,10,20,30,40};
		//배열에 들어 있는 값이 많아질 때는 인덱스 번호를 이용해서 조회하는게 한계
		//배열안에 있는 값을 효과적으로 가져오기 위해서는 반복문을 사용해야합니다.
		//배열하고 for 문은 친구
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println("배열 값 : " + array2[i]);
		}
		
		
		int [] array3 = {2,3,4,5,6};
		// for 문을 이용해서 array3에 있는 값 중 짝수만 출력하기
		for(int i = 0; i < array3.length; i++) {
			int num = array3[i];
			if (num % 2 == 0) {
				System.out.println("array3 배열값 중에 짝수는 : " + num);
			}
		}
		
		// array3에있는 값 총합과 평균 값을 구하시오.
		int array3Sum = 0;		
		for(int i = 0; i < array3.length; i++) {
			array3Sum += array3[i];			
		}
		double array3Avg = array3Sum / array3.length;
		System.out.println("총합 : " + array3Sum);
		System.out.println("평균 : " + array3Avg);
		
		// 문제 for 문을 이용해서 array4에 있는 3의 배수 총합 출력하기
		int [] array4 = {1,2,3,4,5,6,7,8,9,10};
		int array4Sum = 0;
		for(int i = 0; i < array4.length; i++) {
			if(array4[i] % 3 == 0) {
				array4Sum += array4[i];
			}			
		}
		System.out.println("array4의 3의 배수 합은 : " + array4Sum);
		
		
	}

}
