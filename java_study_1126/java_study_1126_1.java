package java_study_1126;

import java.util.Scanner;

public class java_study_1126_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 이중 for 문(중첩 반복)
		// 반복문이 다른 반복문을 내포하는 구조
		// 이론적으로 2~n 중까지 가능하나, 너무 많은 중첩은 프로그램 구조를 복잡하게 한다.
		// 2중 중첩까지가 적당하다
//		for (int i = 0; i < 3; i++) { //아우터 for 문
//			System.out.println("아우터 for 문");
//			for(int j = 0; j<3; j++) {//이너 for 문
//				System.out.println("이너 for 문");
//			}
//		}
		// 아우터 for 문이 먼저 실행 -> 이너 for 문 모두 실행 -> 아우터 for 문 실행
		
		//구구단 (이중 for 문 이용)
		for(int i = 1; i <= 9; i++) {
			System.out.println("====" + i + "단====");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
		
		// 직사각형 출력(이중 for 문)
		int a = 5;
		int b = 3;
		for (int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++){
				System.out.print("■");
			}
			System.out.println();
		}
		
		
		
		
		//문제 9.
//		  다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
//		  사용자로부터 줄 수를 입력받습니다.
//		  * 
//		  **
//		  ***
//	   	  ****
//		  *****
		System.out.println("줄 수를 입력해주세요 : ");
		int q = scan.nextInt();
		for (int i = 0; i <= q; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//문제 10.
//		다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
//		사용자로부터 줄 수를 입력받습니다.
//		*****
//		****
//		***
//		**
//		*
		System.out.println("줄 수를 입력해주세요 : ");
		int c = scan.nextInt();
		for (int i = c; i >= 0; i--) {			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
