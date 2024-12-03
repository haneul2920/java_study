package java_study_1203;

import java.util.Scanner;

public class java_study_1203_1 {

	public static void main(String[] args) {
		//문제풀이
		Scanner scan = new Scanner(System.in);
		/* 
		 * 2. concat
		 * 3. split	
		*/
		//4. 
		String text = "Hello World";
		System.out.println(text.toUpperCase());
		
		//5.
		String text2 = scan.nextLine();
		String text3 = scan.nextLine();
		if (text2.equals(text3)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		//6.
		String text4 = scan.nextLine();

		System.out.println(text4.substring(0, 1));
		System.out.println(text4.substring(text4.length()-1,text4.length()));
//		System.out.println(text4.charAt(text4.length() - 1));
		
		//7.substring
		
		//8. 위 문자열에서 “a”가 몇 번 나타나는지 세는 프로그램을 작성하세요.
		String word = "aabbacccaaaaa";
		String array[] = word.split(""); // word 의 문자 하나씩 배열로 저장
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("a")) {
				count++;
			}
		}
		System.out.println("a의 갯수 : " + count);
		
		//v2
		for(String i : array) { // 배열의 길이만큼 자동으로 반복한다. (for-each문)
			// i 에 자동으로 배열값이 대입됨
			System.out.println("배열 값 : "+i);
		}
		
		//10.
		String strArr[] = {"and","notad","abdc"};
		for(String i : strArr) {
			if(!i.contains("ad")) { //ad 가 포함되어 있다면? -> 느낌표 -> ad 없다면?
				System.out.println(i);
			}
		}
		
		//11.
		String my_string = "nice to meet you";
		String vow[] = {"a","e","i","o","u"}; // 1. 모음 배열 초기화(선언)
	
		for(String i : vow) {// 2. 모음을 for-each로 반복 돌린다.
			my_string = my_string.replaceAll(i,""); //3. replaceAll로 모음을 ""로 대체
		}
		System.out.println(my_string); // 출력
		
		//12.
		String numbers = "onefourzerosixseven"; //14067
		String matchNumbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i = 0; i < matchNumbers.length; i++) {
			numbers = numbers.replaceAll(matchNumbers[i],Integer.toString(i));
		}
		System.out.println("정답 : " + numbers);
		
		
	}

}
