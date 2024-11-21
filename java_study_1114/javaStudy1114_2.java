package java_study_1114;

import java.util.Scanner;

public class javaStudy1114_2 {

	public static void main(String[] args) {
		int num = 10;
		/* int : 정수형 데이터 타입
		 * num : 식별자(변수명)
		 * = : 대입
		 * 10 : 정수형 데이터
		 * ; : 문단 종료		
		*/
		System.out.println("num 안에 있는 숫자는 ?" + num);
		/*
		 * 자바는 기본 데이터타입 8 개와 레퍼런스 타입 1개 총 9개의 데이터타입을 가지고 있다.
		 * String은 레퍼런스 타입.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력 해주세요 : " );
		String name = scan.nextLine();
		System.out.println("입력하신 이름은 " + name + " 입니다.");
		
		int x = 10;
		System.out.println("정수형 데이터 타입 : " + x);
		double y = 10.55;
		System.out.println("실수형 데이터 타입 : " + y);
		boolean z = true;
		System.out.println("논리형 데이터 타입 : " + z);
		char a = 'a';
		System.out.println("문자 데이터 타입 : " + a);
		String str = "Hello World";
		System.out.println("문자열 데이터 타입 : " + str);
		
		final double PI = 3.14; //원주율은 3.14 고정된 값을 상수라 함
//				상수는 데이터타입 앞에 'final' 이라는 키워드를 작성합니다.
//				상수에 식별자(변수명)은 대문자로 입력합니다.
//		형 변환
		int num2 = 10; // int는 4바이트
		double num3 = num2; // double은 8바이트
//		위에 코드 설명 : 정수형 변수 num2에 10을 대입함.
//		실수형 변수 num3에 num2를 대입함
//		작은 바이트크기에서  큰 바이트크기로 대입할 때 자동으로 형변환이 됩니다.
//		즉,int num2가 double로 변환됨
		System.out.println("최종 값 : "+num3);
		
//		큰 바이트크기에서 작은 바이트 크기로 변환할 때는 개발자가 의도적으로 타입을 변환 해야 한다.
		double num4 = 100.45;
		int num5 = (int)num4; //정수형 변수 num5에 num4를 대입함.(강제 타입변환)
		System.out.println("최종 값 : " + num5); // 뒤에 소수점이 없어짐
		
//		그외 변환
//		1. 문자형을 숫자로 변환
		String s1 = "123";
		int i = Integer.parseInt(s1); // 문자 "123"을 숫자 123으로 변환
		System.out.println("최종 값 : " + i);
		int j = 8000;
		String s2 = Integer.toString(j); //숫자 8000을 문자 "8000"으로 변환
//		문자형태인 숫자 "123"과 숫자 123차이
//		문자형태인 숫자는 사칙연산이 불가능
		
		
		
		
		
		
		
		
		
		
	}

}
