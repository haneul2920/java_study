package java_study_1114;

import java.util.Scanner; // Scanner의 기능을 사용할때 import 키워드를 이용해서 불러옴

public class javaStudy1114_3 {

	public static void main(String[] args) {
		
		//Scanner를 이용한 키 입력
		Scanner scan = new Scanner(System.in);// 데이터를 입력 받을때 사용
//		//ctrl + shift + o
//		
//		//문제1. 두개의 정수를 입력 받아. 그 합을 출력
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		int i = scan.nextInt();
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		int j = scan.nextInt();
//		int sum = i + j;
//		System.out.println("두 정수의 합은 : " + sum);
//		int mul = i * j;
//		System.out.println("두 정수의 곱은 : " + mul);
//		int div = i / j;
//		System.out.println("두 정수의 나누기는 : " + (double)div);
//		
//		//문제2. 실수형 변수 height을 선언하고 180.7을 할당하는 코드를 작성하기
//		double height = 180.7;
//		
//		//문제3. 입력 받은 두 정수형 평균값 구하기
//		System.out.print("a 값 입력 : ");
//		int a = scan.nextInt();
//		System.out.print("b 값 입력 : ");
//		int b = scan.nextInt();
//		
//		int avg = (a + b) / 2;
//		System.out.println("두 값의 평균 값은 : " + avg);
//		
		//문제4. 사용자로부터 이름(문자열)과 나이(정수형)을 입력 받아, "안녕하세요, [이름]님! 당신의 [나이]살입니다."라는 메시지를 출력하세요
		System.out.print("이름을 입력 해주세요 : ");
		String name = scan.nextLine();
		System.out.print("나이를 입력 해주세요 : ");
		int age = scan.nextInt();
		System.out.println("안녕하세요, "+name+"님! 당신은 " + age + "살 입니다." );

	}

}
