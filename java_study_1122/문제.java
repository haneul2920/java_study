package java_study_1122;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//문제 1.
		//1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//문제 2.
		//1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
		for(int i = 1; i <= 100; i++) {
			if( i % 2 ==0) {
				System.out.println(i);
			}
		}
		
		//문제 3.
		//1부터 100까지의 숫자 중 짝수 개수를 구하는 프로그램을 작성하세요.
		int num = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 ==0) {
				num++;
			}
		}
		System.out.println("1~100까지 짝수의 개수 : " + num);
		
		//문제 4.
		//사용자로부터 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요.
		int dan = scan.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i +" = " + dan * i);
		}
		
		//문제 5.
		//1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100까지 3의 배수의 합은 : " + sum); 
		
		//문제 6.
		//사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램을 작성하세요.
		//팰토리얼 :　5! = 5 * 4 * 3 * 2 * 1
		//예) 5를 입력받으면 5*4*3*2*1 값인 120이 나와야합니다.
		
		int fack = scan.nextInt();
		int a = 1;
		for (int i = fack; i >= 1; i--) {
			a *= i;
		}
		System.out.println(fack + "의 팩토리얼운 : " + a);
		
		//문제 7.
		//1부터 100까지의 숫자 중 3의 배수는 "Fizz", 5의 배수는 "Buzz",
		//3과 5의 공배수는 "FizzBuzz"를 출력하고, 나머지 숫자는 그대로
		//출력하는 프로그램을 작성하세요.
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else if (i % 3 == 0 && i % 5 ==0) {
				System.out.println("FizzBuzz");
			}else{
				System.out.println(i);
			}
		}
		
		
		//문제 8.
		//1부터 10까지의 합을 구하는 프로그램 작성하기
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;			
		}
		System.out.println("1~10까지의 합은 : " + sum2);
		
		//문제 9.
		//다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
//		사용자로부터 줄 수를 입력받습니다.
//		* 
//		**
//		***
//		****
//		*****
		System.out.println("줄 수를 입력해주세요 : ");
		int q = scan.nextInt();
		for (int i = 0; i <= q; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}		
		}
		System.out.println();
		
		
		
		//문제 10.
//		다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
//		사용자로부터 줄 수를 입력받습니다.
//		*****
//		****
//		***
//		**
//		*
		System.out.println("줄 수를 입력해주세요 : ");
		int b = scan.nextInt();
		for (int i = b; i >= 0; i--) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		}
		
		//문제 11.
//		어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
//		처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때 t시간 후
//		세균의 수를 출력하세요.
//		int n = 2;
//		int t = 10;
//		예) 처음엔 2마리, 1시간 후엔 4마리, 2시간 후엔 8마리, ..., 10시간 후엔
//		2048마리가 됩니다. 따라서 2048을 출력합니다.
		int n = 2; // 세균의 수
		int t = 10;// 경과한 시간
		int z = 0;
		for (int i = 1; i <= t; i++) {
			n = n * 2;			
		}
		System.out.println(n);
		
		//문제 12.
//		1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지
//		다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다.
//		작업은 다음과 같습니다.
//		1-1. 입력된 수가 짝수라면 2로 나눕니다.
//		1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//		2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
//		주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//		이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 출력하시오.
//		int n = 6; //주어진 수
		
//		int w = 6;
//		int count = 0;
//		while (true){
//			if (w % 2 == 0) {
//				int e = w / 2 ;
//				if(e % 2 != 0) {
//					int r = e
//					if()
//				}
//			}
//			count++;
//		}
//		System.out.println(count); 문제 풀이중

	}

}
