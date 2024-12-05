package java_study_1205;

import java.util.Scanner;

public class java_study_1205_1 {

	public static void main(String[] args) {
		// 1. 사칙연산 - 거스름돈
		Scanner scan = new Scanner(System.in);
		int money = 74900;
		// EX) 결과 - > 오만원 1장 , 만원 2장, 천원 4장 5백원 1개 100원 4개
		
		int 오만원 = money / 50000; 
        money %= 50000;
        int 만원 = money / 10000; 
        money %= 10000;
        int 천원 = money / 1000; 
        money %= 1000;
        int 오백원 = money / 500; 
        money %= 500;
        int 백원 = money / 100; 
        money %= 100;
        
        System.out.println("오만원: " + 오만원 + "장");
        System.out.println("만원: " + 만원 + "장");
        System.out.println("천원: " + 천원 + "장");
        System.out.println("오백원: " + 오백원 + "개");
        System.out.println("백원: " + 백원 + "개");
        
		/*
		 * 그리드(탐욕) 알고리즘
		 * => 선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫒아 최종 답에
		 * 도달하는 방법
		 * ex) 거스름돈 문제 		
		 */
        
        // 상수 : 변경 불가능
        // 프로그래밍에서 상수표현은 데이터타입 앞에 'final' 키워드가 온다.
        // 상수를 표현할 땐 변수 이름을 대문자로 적어야 한다.(개발자 약속)
        final double PI = 3.14;
        double radius = 5.0;
		/*
		 * 문제) 원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요.
		 * double radius = 5.0; //원의 반지름
		 * 원의 면적은 PI * 반지름 * 반지름 입니다.
		*/
        
        double 면적 = PI * radius * radius;
        System.out.println(면적);
        
		/*
		 * 문제)
		 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가
		 * 변수로 주어질 때, 다른 한 변의 길이의 제곱, b를 출력하시오.
		*/
        
        int a = 3;
        int c = 5;
        int b = 0; //b 구하기
        
        b = (c*c) - (a*a);
        
        System.out.println(b);
        
        int array[] = {1,3,5}; // 배열 선언
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        // 마지막 인덱스 출력하기
//        System.out.println(array[2]);
        System.out.println(array[array.length-1]);
        
		/*
		 * 문제)
		 * 1번 인덱스 값과 2번 인덱스값 서로 교환하기
		 */
        int temp = array[1]; // temp (임시공간)에 3대입
        array[1] = array[2]; // 1번 인덱스에 5대입
        array[2] = temp; // 2번 인덱스에 temp 대입
        System.out.println(array[1]);
        System.out.println(array[2]);
        // swap
        
        // 배열 문제가 나오면 무조건 for문
        for(int i : array) { // for each (배열 길이만큼 자동으로 반복)
        	System.out.println("i : " + i);
        }
        
        
        
	}

}
