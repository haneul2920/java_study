package java_study_1121;

import java.util.Scanner;

public class java_study_1121_1 {

	public static void main(String[] args) {
		//예제 => 시험 점수가 80점 이상이면 합격 판별을 하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 해주세요 : ");
		int score = scan.nextInt();
		
		if (score >= 80 ) {
			System.out.println("합격 입니다.");
		}else {
			System.out.println("불합격 입니다.");
		}
		/* else는 단독으로 사용 할 수 없습니다.
		 * else는 if 다음에 작성할 수 있습니다.
		*/
		
		//중첩 if 문 : 조건이 여러가지일 때 사용함
		System.out.println("점수2를 입력하세요 : ");
		int score2 = scan.nextInt();
//		&& : and 연산자 두조건이 모두 true 이여야함
		if(score2 >= 90 && score2 <= 100) {
			System.out.println("A등급");
		}else if(score2 < 90 && score2 >= 80) {
			System.out.println("B등급");
		}else if(score2 < 80 && score2 >=70 ){
			System.out.println("C등급");
		}else {
			System.out.println("F등급");
		}

	}

}
