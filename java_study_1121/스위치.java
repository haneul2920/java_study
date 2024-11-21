package java_study_1121;

import java.util.Scanner;

public class 스위치 {

	public static void main(String[] args) {
		// 스위치문 : 중첩 else문이랑 비슷한 기능

		char grade = 'a';

		switch (grade) {
		case 'a': // grade가 a랑 같다면?
			System.out.println("A학점 입니다.");
			break; // 멈추다
		case 'b':
			System.out.println("B학점 입니다.");
			break;
		default:
			System.out.println("잘못된 학점 입니다.");
			break;
		}
		// 문제1. 1부터 5까지 숫자를 입력 받아 해당하는 과일 출력
		// 1: 사과 2: 바나나 3: 오렌지 4: 포도 5: 복숭아

		Scanner scan = new Scanner(System.in);

		System.out.println("1: 사과\n2: 바나나\n3: 오렌지\n4: 포도\n5: 복숭아");
		int i = scan.nextInt();

		switch (i) {
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
			System.out.println("1~5 까지만 입력해주세요");
			break;
		}

	}

}
