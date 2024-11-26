package java_study_1126;

import java.util.Random;

public class java_study_1126_3 {

	public static void main(String[] args) {
		// 자바에서 배열을 만드는 방법은 총 2가지
		// 첫번째
		int [] array = {2,3}; // 값이 배열생성시 정해줌
		
		// 두번째
		int [] array2 = new int[2]; // 길이만 생성 안에 값은 없다.
		System.out.println("배열 길이는 : " + array2.length);
		
		// 값 넣기
		array2[0] = 10;
		array2[1] = 20;
//		array2[2] = 20; // 배열길이는 2인데 3번째에 20을 넣으려고 하니 에러 발생
//		System.out.println(array2[2]); // 에러
		System.out.println(array2[1]);
		
		// 배열에 랜덤한 값 넣기
		int [] numbers = new int[10]; // 10개 공간을 가진 배열 생성!
		
		// 자바에서는 랜덤값을 Random 이라는 클래스를 이용합니다.
		Random ran = new Random(); // 랜덤클래스 생성 => ctrl + shift + o
		numbers[0] = ran.nextInt(100)+1; // 1부터 100까지의 랜덤값을 0번째 인덱스에 대입함.
		
		
		// 문제.
		// 0~9번째 인덱스에 랜덤 값 넣기
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(100)+1;
			System.out.println(i + "번째 인덱스 값은 : " + numbers[i]);
		}
//		1번)
//        10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
//        2번째 인덱스와 5번째 인덱스를 곱한 값을 출력하시오.
		int [] num1 = {1,2,3,4,5,6,7,8,9,10};
		int a = num1[1] * num1[4];
		System.out.println("num1 배열중 2번째와 5번째 인덱스의 곱 : " + a);
		
        
//        2번)
//        1번 문항 이어서
//        배열에 저장된 값을 모두 더하는 프로그램을 작성하세요.
		int num1Sum = 0;
		for(int i = 0; i < num1.length; i++) {
			num1Sum += num1[i];
		}
		System.out.println("num1 배열의 총합 : " + num1Sum);
        
//        3번)
//        크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 배
//        열의 요소들 중 짝수만 출력하는 프로그램을 작성하세요.
		int [] num2 = new int[10];
		for(int i = 0; i < num2.length; i++) {
			num2[i] = ran.nextInt(100)+1;
			if(num2[i] % 2 == 0) {
				System.out.println("num2 배열의 짝수는 : " + num2[i]);
			}
		}
		
        
//        4번)
//        크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
//        최댓값을 구하는 프로그램을 작성하세요.
		int max = 0;
		for(int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
			if(num2[i] > max) {
				max = num2[i];
			}
		}
		
		System.out.println("num2 배열의 최대값은 : " + max);
		
	}

}
