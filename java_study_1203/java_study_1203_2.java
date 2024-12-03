package java_study_1203;

import java.util.Scanner;

public class java_study_1203_2 {

	public static void main(String[] args) {
		//지금까지 복습
		
		//1. 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//2. 1부터 10까지의 합을 구하시오
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//3. 배열
		String array[] = {"apple","apple","apple","banana"};
		int count = 0;
		for(String i : array) {
			if(i.equals("apple")) {
				count++;
			}
		}
		System.out.println("사과 갯수 : " + count);
		
		//4. 
		/*옷가게는 10 만원 이상사면 5%, 30만원 이상 사면 10%
		 * 50만원 이상 사면 20%를 할인해준다.
		 * 구매한 옷의 가격 price 변수에 580000 주어질때
		 * 지불해야 할 금액을 출력 하도록 코드를 완석 하시오.
		*/
		double price = 580000;
		
		if(price >= 100000 && price < 300000) {
			price = price-(price * 0.05);
		}else if (price >= 300000 && price < 500000) {
			price = price-(price * 0.1);
		}else if (price >= 500000) {
			price = price-(price * 0.2);
		}
		
		System.out.println(price);
		
		/*
		 * 문자열 my_string에 "hello" 가 주어질 때
		 * my_string에 들어있는 각 문자를 n만큽 반복한 문자열 출력하기
		 * n에 3이 주어짐		
		*/
		
		String my_string = "hello";
		String array2[] = my_string.split("");
		int n = 3;
		
		for(int i = 0; i < my_string.length(); i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(array2[i]);
			}
		}
		System.out.println();

		
//		v2
//		String my_string = "hello";
//	       int n = 3;
//	       //결과 : hhheeellllllooo
//	       //힌트 : for문 -> 이중 for문
//	       String result = "";
//	       for(int i=0; i<my_string.length(); i++) { //문자 길이만큼 반복
//	          String word = my_string.substring(i, i+1);
//	          for(int j=0; j<n; j++) { //이중 for문
//	             //n만큼 반복
//	             result += word;
//	          }
//	       }
//	       System.out.println("결과 : " + result);
		
		
		//v3 repeat 사용해서 풀기
		// repeat : 특정 문자를 반복하다.
		String array3[] = my_string.split("");
		
		String result2 = "";
		for(String i : array3) {
			result2 += i.repeat(n);
		}		
		System.out.println(result2);
		
		
		//[배열] 짝수, 홀수 개수 구하기
		/*
		 * 정수형 배열 num_list가 주어질 때 num_list의 원소 중 짝수와 홀수의 개수를
		 * 담은 정수형 배열 answer_list를 완성하기. 
		*/
		int num_list[]= {1,3,5,7};
		int answer_list[] = new int[2];
		
		int count2 = 0;
		int count3 = 0;
		
		for(int i : num_list) {			
			if(i % 2 == 0) {
				++count2;
				answer_list[0] = count2;
			} else {
				++count3;
				answer_list[1] = count3;
			}
		}		
		/*
		 * 결과 
		 * [0,4] 즉, 0번쨰 인덱스엔 짝수, 1번째 인덱스엔 홀수 개수가 옴 
		 */
		
		//문제
		/*
		 * 상원이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
		 * 양꼬치는 1인분에 12000원, 음료수는 2000원 입니다.
		 * 정수 q과 k가 변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
		 * 총 얼마를 지불해야 하는지 출력하시오.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("양꼬치를 몇인분 먹었습니까?");
		int q = scan.nextInt();
		System.out.println("음료수를 몇개 마셧습니까?");
		int k = scan.nextInt();		
		int 양꼬치 = 12000;
		int 음료수 = 2000;
		int total = (q*양꼬치) + (k*음료수);		
		int 무료음료수 = q / 10;
        int 할인금액 = 무료음료수 * 음료수;
        total -= 할인금액;
        
		System.out.println("총 " + total + "원 입니다.");
		
	}

}
