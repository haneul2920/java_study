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
		String n = scan.next();
		System.out.println("입력 하신 이름은 : " + n + "입니다.");
	}

}
