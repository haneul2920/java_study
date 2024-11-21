package java_study_1121;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {

		// 문제 1.
//			if의 설명 중 다른 하나는? 3
//			①	조건문은 프로그램에서 특정 조건에 따라 다른 행동을 한다.
//			②	false의 경우 if문을 빠져나온다.
//			③	if-else문에서 else는 항상 작성해야한다.
//			④	중첩 if문 마지막에는 else를 작성해야한다

		// 문제 2.
//		int 용돈 = 3000; boolean 편의점오픈여부 = true;
//		if(용돈 >= 3000 &&　편의점오픈여부){
//		  //A코드 실행  
//		}else{
//		  //B코드 실행
//		}
//		[객관식] 위 코드를 해석하고 if와 else 둘 중 어느 구문이 실행될까요? 1
//		①	A 코드
//		②	B 코드
//		③	오류 발생

		// 문제 3.
//		두 정수를 입력받아 큰 수를 출력하는 프로그램을 작성하세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("a값 입력");
		int a = scan.nextInt();
		System.out.println("b값 입력");
		int b = scan.nextInt();
		if (a > b) {
			System.out.println("a가 더크다");
		} else if (b > a) {
			System.out.println("b가 더크다");
		}

		// 문제 4.
//		입력된 수가 5의 배수인지 판별하는 프로그램을 작성해주세요.
		System.out.println("5의 배수를 입력해주세요");
		int num1 = scan.nextInt();

		if (num1 % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}

		// 문제 5.
//		숫자를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요
		System.out.println("짝수 홀수를 판별하기위해 숫자를 입력해주세요");
		int num2 = scan.nextInt();

		if (num2 % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

		// 문제 6.
//		숫자를 입력받아 3의 배수, 5의 배수, 3과 5의 공배수, 또는 해당 없음을 출력하는 프로그램을 작성하세요.

		System.out.println("3의 배수, 5의 배수, 3과 5의 공배수, 또는 해당 없음을 출력 하기위해 숫자를 입력해주세요.");
		int num3 = scan.nextInt();

		if (num3 % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else if (num3 % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		} else if (num3 % 3 == 0 && num3 % 5 == 0) {
			System.out.println("3과 5의 공배수 입니다.");
		} else {
			System.out.println("해당 없음");
		}

		// 문제 7.
//		사용자의 나이를 입력받아 미성년자(19세 미만)인지 성인인지 판별하는 프로그램을 작성하세요.
		System.out.println("나이를 입력해주세요");
		int age = scan.nextInt();

		if (age >= 19) {
			System.out.println("성인 입니다.");
		} else if (age < 19 && age >= 0) {
			System.out.println("미성년자 입니다.");
		}

		// 문제 8.
//		세 과목(국어,수학,영어)의 점수를 입력받아 평균을 계산하고, 평균이 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C", 
//		60점 이상이면 "D", 그 미만이면 "F"를 출력하는 프로그램을 작성하세요.
		System.out.println("국어 점수를 입력해주세요 : ");
		int 국어 = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요 : ");
		int 수학 = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요 : ");
		int 영어 = scan.nextInt();

		int avg = (영어 + 수학 + 국어) * 3;

		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80 && avg < 90) {
			System.out.println("B");
		} else if (avg >= 70 && avg < 80) {
			System.out.println("C");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		// 문제 9.
//		두 정수를 입력받아 둘 중 하나라도 음수이면 "음수가 포함되어 있습니다.", 둘 다 양수이면 "모두 양수입니다."를 출력하는 프로그램을 작성하세요.

		System.out.println("문제 9 : a숫자를 입력해주세요 : ");
		int num4 = scan.nextInt();
		System.out.println("문제 9 : b숫자를 입력해주세요 : ");
		int num5 = scan.nextInt();

		if (num4 < 0 || num5 < 0) {
			System.out.println("음수가 포함되어 있습니다.");
		} else if (num4 > 0 && num5 > 0) {
			System.out.println("모두 양수입니다.");
		}

		// 문제 10.
//		사용자로부터 1부터 5까지의 숫자를 입력받아 해당하는 과일 이름을 출력하는 프로그램을 작성하세요. 
//		(1: 사과, 2: 바나나, 3: 오렌지, 4: 포도, 5: 복숭아)
//		*switch 이용해서 풀 것
		System.out.println("1: 사과, 2: 바나나, 3: 오렌지, 4: 포도, 5: 복숭아");
		System.out.println("숫자를 입력해주세요 : ");
		int num6 = scan.nextInt();

		switch (num6) {
		case 1:
			System.out.println("사과");
			break;
		case 2:
			System.out.println("바나나");
			break;
		case 3:
			System.out.println("오렌지");
			break;
		case 4:
			System.out.println("포도");
			break;
		case 5:
			System.out.println("복숭아");
			break;
		default:
			System.out.println("1~5 까지의 숫자만 입력해주세요");
			break;
		}

		// 문제 11.
//		길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
//		피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 출력하세요.
//		int n = 15; //사람의 수
//		예) 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
//		n이 15라고 가정하면 피자는 3판이 필요합니다.
		
		int pizzaPiece = 7;
		System.out.println("피자를 먹을 인원수를 정해주세요 : ");
		int person = scan.nextInt();

		int n = (person + pizzaPiece -1) / pizzaPiece;
		System.out.println("필요한 피자판수는 "+n+"개 입니다.");
		
		//문제 12.
//		길동이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다. 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 출력하세요.
//		Scanner scan = new Scanner(System.in); System.out.print("금액을 입력하세요 : "); int price = scan.nextInt();
//		예) 
//		580000원에서 20%를 할인한 464000원을 출력합니다.
//		150,000원에서 5%를 할인한 142500원을 출력합니다.
		System.out.println(" 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.");
		System.out.println("금액을 입력해주세요 : ");
		int price = scan.nextInt();
		
		if (price >= 100000 && price < 300000) {
			System.out.println("5% 할인된 금액 : " + (price-(price*0.05)) + "원 입니다." );
		}else if (price >= 300000 && price < 500000) {
			System.out.println("10% 할인된 금액 " + (price-(price * 0.1)) + "원 입니다.");
		}else if (price >= 500000) {
			System.out.println("20% 할인된 금액 " + (price-(price * 0.2)) + "원 입니다.");
		}else {
			System.out.println("할인되지 않은 금액 : " + price + "입니다.");
		}
		



	}

}
