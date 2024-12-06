package java_study_1206;

import java.util.Random;
import java.util.Scanner;

public class java_study_1206_1 {

	public static void main(String[] args) {
		// 12_05 수업 문제 풀이
		
		// 7번
		int n = 15;
		// 7조각 주는 이상한 피자가게
		// 상수 변수명은 대문자로
		final int SLICE = 7;
		
		int x = n % SLICE;
		int result =  n / SLICE;
		if (x > 0 ) {// 못먹은 사람이 있다면 
			++result; // 증감 연산자로 한판 더
		}
		System.out.println(result);
		Scanner can = new Scanner(System.in);
		
		// 8번 팩토리얼
		System.out.println("정수 입력받기 : ");
		int num = can.nextInt();
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		
		// 10번
		
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 17번
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= height) {
				count++;
			}
		}
		System.out.println("길동이 보다 큰 사람 수 : " + count);
		
		
		// 18번
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = "";
		
		for(int i = 0; i < cipher.length(); i++) {
			if ((i +1) % code == 0) {
				answer += cipher.substring(i,i+1);
			}
		}
		System.out.println("해독한 단어는 : " + answer);
		
		// 19번 -전화번호
		
		// v1
		String phone_number = "0171238888";
		
		int temp = phone_number.length() - 4; // 4자리를 제외한
		String star = "";
		for(int i = 0; i < temp; i++) {
			star += "*";
		}
		String lastNumber = phone_number.substring(temp);;
		System.out.println("lastNumber : "+ lastNumber);
		phone_number = star + lastNumber;
		System.out.println("phone_number : " + phone_number);
		
		// v2

		System.out.println(phone_number);
		String phone[] = phone_number.split(""); // split 으로 한글자씩 배열에 담기
		String result2 = "";
		for(int i = 0; i < phone.length; i++) {
			if(i < (phone_number.length() -4)) {
				result2 += "*";
			}else {
				result2 += phone[i];
			}
		}
		System.out.println(result2);
		
		
		
		
		// 20번 - 치킨 문제
		int chicken = 1081;
		int chickenCount = 0;
		// 1. 반복을 하면서 쿠폰이 있는지 없는지 체크
		// 2. 10번 반복할지 5번 반복할지 모름 => while
		while(chicken >= 10) {
			int coupon = chicken % 10; // 나머지 값을 쿠폰에 대입
			chickenCount += chicken / 10;
			chicken = coupon + chicken / 10;
		}
		System.out.println("최대 서비스 치킨 수 : " + chickenCount);
		
		
		 //[문제21 - 난이도 Up] [contains 활용하기]
	      String my_string = "people"; //p와 e가 중복됨
	      String[] strArray = my_string.split("");
	      String result3 = ""; //최종 결과 변수
	      for(int i=0; i<strArray.length; i++) {
	         if(!result3.contains(strArray[i])) {
	            result3 += strArray[i];
	         }
	      }
	      System.out.println("정답 : " + result3);
	      
	      //[문제22 - 난이도 Up] 개미 군단 -> 그리드(탐욕) 알고리즘
	      int hp = 24; //여치 HP
	      int count2 = 0;
	      
	      count2 += hp / 5; //장군개미
	      hp %= 5;
	      
	      count2 += hp / 3; //병정개미
	      hp %= 3;
	      
	      count2 += hp;
	      System.out.println(count2);
	      
	      int hp2 = 24;
	      int count3 = 0;
	      int count4 = 0;
	      
	      while(hp2 >= 0 ) {
	    	  
	    	  if(hp2 >= 5) {
	    		  hp2 -= 5;
	    		  count3++;
	    	  }else{
	    		  hp2 -= 3;
	    		  count4++;
	    	  }
	      }
	      System.out.println(count3);
	      System.out.println(count4);

		
		
	}

}