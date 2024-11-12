package java_study;

import java.util.Scanner;

public class 자바복습 {

	public static void main(String[] args) {
		int age = 32;
		String name = "김한울";
		String addr = "충북 청주시";
		String mbti = "ISTP";
		String hb = "낚시";

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("MBTI : " + mbti);
		System.out.println("취미 : " + hb);

		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name2 = scan.next();		
		System.out.println("MBTI를 입력해주세요 : ");
		String mbti2 = scan.next();		
		System.out.println("나이를 입력해주세요 : ");
		int age2 = scan.nextInt();		
		System.out.println("취미를 입력해주세요 ");
		String hobby = scan.next();		
		System.out.println("키를 입력해주세요 : ");
		int hiegth = scan.nextInt();
		
		
		System.out.println("이름은 : " + name2 );
		System.out.println("MBTI는 : " + mbti2);
		System.out.println("나이는 : " + age2);
		System.out.println("취미는 : " + hobby);
		System.out.println("키는 : " + hiegth);

	}

}
