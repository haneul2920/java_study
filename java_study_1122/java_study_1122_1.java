package java_study_1122;

public class java_study_1122_1 {

	public static void main(String[] args) {

//		for (int i = 0; i <= 10000000; i++) {
//			if (i < 10000000) {
//				System.out.println(i + "번째 반복");
//			} else if (i == 10000000) {
//				System.out.println("반복 끝!");
//			}
//
//		}
//		for(int j = 1; j <= 20; j++) {
//			System.out.println("안녕하세요");
//		}
//		for(int i = 0; i < 9; i++) {
//			System.out.println("i : " + i);
//		}
		/* for문은 이것만 알아두자
		 * 1. for문 실행순서 초기식 -> 조건식 -> 코드 실행 -> 증감식
		 * 2. 조건식이 만족할 때 까지 반복함
		*/
		
		// 1~10 까지 총 합구하기
		System.out.println("1~10 까지 총 합구하기");
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i; 
		}
		System.out.println(sum+"\n");
		
		//1부터 20까지의 숫자중 짝수만 출력하기
		System.out.println("1부터 20까지의 숫자중 짝수만 출력하기");
		for(int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//1부터 30까지의 숫자중 5의 배수만 출력하기
		System.out.println("1부터 30까지의 5의 배수구하기");
		for(int i = 1; i <= 30; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("구구단 출력 하기");
		for(int i = 1; i <= 9; i++) {
			System.out.println("======" + i + "단 " + "======");
			for(int j = 1; j <= 9; j++) {
				int dan = i * j;
				System.out.println(i + " X " + j + " = " + dan);
			}
		}
		
		//break;
		for(int i = 1; i <= 5; i++) {
			if( i == 2) {
				System.out.println(i);
				break; // i가 2라면, break -> for문 탈출				
			}
			System.out.println(i);
		}
		
		System.out.println("while 문은 조건이 참인 동안 코드 블록을 반복적으로 실행하는 반복문");
		int i = 1;
		while ( i <= 5) {  //while문 시작
			System.out.println("while문 i : " + i);
			i++; // 코드구현 + 증감식
		}
		
		System.out.println("커피 자판기 예제");
		int coffee = 10; // 커피 10잔
		while(coffee > 0) {
			System.out.println("커피를 판매 합니다.\n남은 커피 : " + coffee);
			coffee--;
			if (coffee == 0 ) {
				System.out.println("커피가 다 팔렷습니다.");
				break; //for문과 마찬가지로 break문을 사용 할수 있습니다.
			}
		}
	}
}
