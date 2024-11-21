package java_study_1114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
//		1.정수형 변수 age를 선언하고 25를 할당하는 코드를 작성 후 출력 하세요.
		int age = 25;
		System.out.println(age);

//		2.○○은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다.
//		○○은 무엇일까요? 1
//		1.	변수
//		2.	실수
//		3.	상수
//		4.	정수

//		3.사용자로부터 이름과 나이를 입력받아, 
//		"안녕하세요, [이름]님! 당신은 [나이]살입니다."라는 메시지를 출력하세요
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("나이을 입력하세요 : ");
		int age2 = scan.nextInt();
		System.out.println("안녕하세요, " + name + "님! 당신은 " + age + "살입니다.");

//		4.문자열 "Hello, Java!"를 출력하는 코드를 작성하세요.
		System.out.println("Hello, Java!");

//		5.두 개의 정수 a와 b를 더한 결과를 출력하는 코드를 작성하세요.
		System.out.print("a 값 입력");
		int a = scan.nextInt();
		System.out.print("b 값 입력");
		int b = scan.nextInt();
		int sum = a + b;
		System.out.println("a + b = " + sum);

//		6.실수형 변수 height으로 선언하고 180.5를 할당하는 코드를 작성하세요.
		double height = 180.5;
		System.out.println(height);

//		7.다음 각 데이터 타입에 맞는 변수를 선언하고 적절한 값으로 초기화하세요.
//		1.	정수형 (int) int i = 1;
//		2.	실수형 (double) double j = 3.14; 
//		3.	문자형 (char)	char a = 'a';
//		4.	논리형 (boolean) boolean b = true;

//		8.사용자로부터 두 개의 정수를 입력받아, 그 합을 출력하세요.
		System.out.print("a 값 입력");
		int a2 = scan.nextInt();
		System.out.print("b 값 입력");
		int b2 = scan.nextInt();
		int sum2 = a2 + b2;
		System.out.println("a + b = " + sum);

//		9.문자형변수 x를 선언하고 “10”을 할당 후 정수형 변수 y를 선언하고 x의 값을 y에 할당하세요.
//		HINT) Integer.parseInt

		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println(y);

//		10.다음 중 잘못된 식별자(변수이름)는? 3
//		1.	monster3
//		2.	apple_13_pro
//		3.	3apple
//		4.	AaaAAA

//		11.아래와 같이 사용자로부터 정수를 입력받고, 해당 정수의 10%는 몇인지 출력하시오.
//			숫자를 입력하세요 : 800
//			해당 숫자에 10%는 : 80.0입니다.

		System.out.print("숫자를 입력하세요 : ");
		int c = scan.nextInt();
		double d = c * 0.1;
		System.out.println("해당 숫자에 10%는 : " + d + "입니다.");

//		12. 아래와 같이 사용자로부터 3개의 정수를 입력받아, 평균을 출력하세요.(소수점 제외)
//			숫자를 입력하세요 : 100
//			숫자를 입력하세요 : 90
//			숫자를 입력하세요 : 70 
//			입력 받은 숫자의 평균은 86 입니다.

		System.out.println("숫자를 입력하세요 : ");
		int q = scan.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		int w = scan.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		int e = scan.nextInt();
		int avg = (q + w + e) / 3;
		System.out.println("입력받은 숫자의 평균은 : " + avg + "입니다.");

	}

}
