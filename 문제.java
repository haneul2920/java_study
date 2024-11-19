package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
//		문제 1. 
		// 용돈 = 10000;
		// 용돈 -= 3000;
		// 간식 구매 용돈 += 5000;
		// 심부름 보상
//		[주관식] 최종 용돈의 값은 얼마일까요? 
		int 용돈 = 10000;
		용돈 -= 3000;
		용돈 += 5000;
		System.out.println("최종 용돈 : " + 용돈);

//		문제 2.
//		int 점수 = 80; 
//		점수 += 5;  
//		보너스 점수 점수 *= 2; 
//		더블 점수 이벤트
//		[주관식] 최종 점수의 값은 얼마일까요?
		int 점수 = 80;
		점수 += 5;
		점수 *= 2;
		System.out.println("최종 점수 : " + 점수);

		// 문제 3.
//		int 나이 = 20; 
//		boolean 면허증소지 = true;
//		boolean 운전가능 = (나이 >= 18) && 면허증소지; 
//		[주관식] 운전가능은 true일까요 false일까요? 
		int 나이 = 20;
		boolean 면허증소지 = true;
		boolean 운전가능 = (나이 >= 18) && 면허증소지;
		System.out.println("운전 가능 : " + 운전가능);

		// 문제 4.
//		boolean 면허증소지 = true; 
//		boolean 운전가능 = !면허증소지;
//		[주관식] 운전가능은 true일까요 false일까요? 
		boolean 면허증소지2 = true;
		boolean 운전가능2 = !면허증소지;
		System.out.println("운전가능 : " + 운전가능2);

		// 문제 5.
//		정수형 변수 a와 b를 선언하고 a에 10을 b에 5를 할당 후 두 개의 정수 a와 b를 곱한 결과를 출력하는 코드를 작성하세요.
		int a = 10;
		int b = 5;
		a *= b;
		System.out.println("a * b = " + a);

		// 문제 6.
//		boolean p = true와 boolean q = false가 있을 때, p && q의 결과는 무엇인지 출력하시오.

		boolean p = true;
		boolean q = false;
		System.out.println(p && q);

		// 문제 7.
//		원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요. 
//		final double PI = 3.14 
//		double radius = 5.0; //원의 반지름 (원의 면적 : PI * 반지름 * 반지름)
		final double PI = 3.14;
		double radius = 5.0;
		double finalPi = PI * radius * radius;
		System.out.println("원의 반지름 : " + finalPi);
		
		//문제 8. 
//		실수형 변수 weight과 height을 선언하고 weight에 70.5를 할당, height에는 1.77를 할당 후 체질량 지수를 계산하는 프로그램을 작성하세요.
//		double weight = 70.5; double height = 1.77; double bmi = 0;
//		*BMI(체질량 지수)공식은 체중(kg) / (신장(m) * 신장(m)) 입니다.
		double weight = 70.5;
		double height = 1.77;
		double bmi = 0;
		bmi = weight / (height * height);
		System.out.printf("BMI : %.2f\n", bmi);
		
		//문제 9.
//		int 대기번호 = 1;
//		System.out.println("다음 번호: " + 대기번호++);  
//		System.out.println("다음 번호: " + 대기번호++);  
//		[주관식] 최종 대기번호는 몇번일까요?
		int 대기번호 = 1;
		System.out.println("다음 번호: " + 대기번호++);  
		System.out.println("다음 번호: " + 대기번호++);  
		
		
		//문제 10.
//		2024년 기준 길동이의 나이 age가 주어질 때, 길동이의 출생 연도를 출력하는 프로그램을 작성하시오. (한국 나이)
//		int age =  32; int year = 2024; int result = 0; 
//		/*
//		코드 구현하기
//		*/
//		System.out.println("출생 연도는: " + result);  
		
		int age =  32;
		int year = 2024; 
		int result = 0; 
		result = year - age;
		System.out.println("출생 연도는: " + result); 
		
		
		//문제 11.
//		주어진 돈을 입력받고 500원,100원 동전으로 거스름돈을 받으려고 한다. 거스름돈 구하는 프로그램을 작성하시오.
//		Scanner scan = new Scanner(System.in); //작성 후 ctrl+shift+o로 임포트 int obak = 500; //500원 int bak = 100; //100원 int change = 0; //남은 돈
//		System.out.print("거스름돈을 입력하세요 : "); int myMoney = scan.nextInt();
//		아래와 같은 결과가 나와야 합니다. 단, 필요시 변수는 더 선언할 수 있습니다.
		Scanner scan = new Scanner(System.in);
		int obak = 500;
		int bak = 100; 
		int change = 0;
		int bakChange = 0;
		System.out.print("거스름돈을 입력하세요 : ");
		int myMoney = scan.nextInt();		
		change = myMoney / obak;		
		System.out.println("오백원 : " + change + "개");
		bakChange = myMoney % obak / bak;
		System.out.println("백원 : " + bakChange + "개");


	}

}
