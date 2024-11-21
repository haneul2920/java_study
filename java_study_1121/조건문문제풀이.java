package java_study_1121;

import java.util.Scanner;

public class 조건문문제풀이 {

	public static void main(String[] args) {
		// 1번. 3의 배수 판단
		int x = 15;
		// == : 같다 
		// % : 나머지
		if (x % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		// 2번. 변수 y가 5의 배수 인지 판단하는 프로그램 작성
		
		int y = 5;
		
		if(y % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		// 3번. 두 정수를 입력받아 큰 수 출력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("a의 값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("b의 값을 입력하세요.");
		int b = scan.nextInt();
		
		if( a > b ) {
			System.out.println("a값이 더 큽니다.");
		}else if (b > a ) {
			System.out.println("b값이 더 큽니다.");
		}else {
			System.out.println("a와 b의 값이 같습니다.");
		}
		
		// 4번. 짝수 구하기
		int 짝수 = 4;
		if(짝수 % 2 == 0 ) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
		
				
		// 5번. 홀수 수하기
		int 홀수 = 9 ;
		if(홀수 % 2 != 0) {
			System.out.println("홀수 입니다.");
		}else {
			System.out.println("짝수 입니다.");
		}
		
		// 6번. 3과 5의 공배수 판단
		// 공배수란 해당 숫자가 3의 배수, 5의 배수
		int number = 15;
		
		if( number % 3 == 0 && number % 5 == 0) {
			System.out.println(number +"는 공배수 입니다.");
		}else {
			System.out.println("공배수가 아닙니다.");
		}
		
		
		
	}

}
