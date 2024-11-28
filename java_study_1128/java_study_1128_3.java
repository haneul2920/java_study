package java_study_1128;

import java.util.Scanner;

public class java_study_1128_3 {

	public static void main(String[] args) {
		// 문자열 문제
		// contains 를 이용해서 특정 이메일 추출하기
		String email[] = { "123@naver.com", "456@gmail.com", "789@naver.com" };
		for (int i = 0; i < email.length; i++) {
			String e = email[i];
			if (e.contains("naver")) {
				System.out.println("네이버 이메일 : " + e);
			}
		}

		// split을 활용하여 특정 문자 개수 구하기
		String food = "돈까스@돈까스@라면@김밥@돈까스";
		String foodArray[] = food.split("@");
		int count = 0;
		for (int i = 0; i < foodArray.length; i++) {
			if (foodArray[i].equals("돈까스")) {
				count++;
			}
		}
		System.out.println("돈까스 개수는 : " + count);

		// 문제1.
		// 사용자로부터 문자열을 입력받아 문자 길이를 출력하세요.
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.length());

		// 문제2.
		// 문자열을 연결하는 함수는 무엇인가? 3
//		① split
//		② substring
//		③ concat
//		④ replace

		// 문제3.
//		"010-1234-5678" 문자열이 주어질 때 "-" 기준으로 문자열을 분할하려면
//		어떤 문자열 함수를 사용해야하는가?  1
//		① split
//		② substring
//		③ concat
//		④ replace

		// 문제4.
//		String text = "Hello World!";
//		위 문자열을 모두 대문자로 변환하여 출력하는 프로그램을 작성하세요
		String text = "Hello World!";
		System.out.println(text.toUpperCase());

		// 문제5.
//		사용자로부터 두 개의 문자열을 입력받아
//		두 문자열이 같으면 “같습니다.” 틀리면 “다릅니다.” 를 출력하는
//		프로그램을 작성하세요.
		String text2 = scan.nextLine();
		String text3 = scan.nextLine();
		if (text2.equals(text3)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

		// 문제6.
//		사용자로부터 문자열을 입력받아 그 문자열의
//		첫 번째와 마지막 문자를 출력하는 프로그램을 작성하세요.
//		예) "안녕하세요" 라는 문자열을 입력했을 때 “안”과 “요”만 출력합니다
		String text4 = scan.nextLine();

		System.out.println(text4.substring(0, 1));
		System.out.println(text4.charAt(text4.length() - 1));

		// 문제7.
//		사용자로부터 문자열과 정수 n을 입력받아,
//		해당 문자열의 앞에서 n개의 문자를 출력하는 프로그램을 작성하세요.
//		예)
//		입력받은 문자열 “아메리카노”
//		입력받은 정수 n이 3이라고 가정
//		해당 문자열의 앞에서 3개의 문자 “아메리”가 출력
		String text5 = scan.nextLine();
		int n = scan.nextInt();
		System.err.println(text5.substring(0, n));

		// 문제8.
//		String word = "aabbacccaaaaa";
//		위 문자열에서 “a”가 몇 번 나타나는지 세는 프로그램을 작성하세요.

		String word = "aabbacccaaaaa";
		int count2 = 0;
		for (int i = 0; i < word.length(); i++) {

			if (word.contains("a")) {
				count2++;
			}
		}
		System.out.println("a의 갯수 : " + count2);

		// 문제9.
//		String email = "user@gmail.com";
//		위 문자열에서 split을 사용하여 gmail.com만 출력하시오.

		String email2 = "user@gmail.com";
		String reulst[] = email2.split("@");
		System.out.println(reulst[1]);

		// 문제10.
//		문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을
//		포함하고 있는 모든 문자열을 제외하고 출력하세요.
//		String[] strArr = {"there","are","no","a","ds"};
//		예)
//		{"and","notad","abcd"} -> {"and","abcd"}
//		1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다.
//		따라서 해당 문자열을 제외한 "and"와"abcd"가 출력됩니다.

		String[] strArr = { "there", "are", "no", "a", "ds" };

		for (int i = 0; i < strArr.length; i++) {			
				String str2 = strArr[i];
				if (!str2.contains("ad")) {
					System.out.println(str2);
				
			}
		}

		// 문제11.
//		영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//		문자열 my_string이 변수로 주어질 때 모음을 제거한 문자열을 출력하세요.
//		String my_string = "nice to meet you";
//		예)
//		"nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를
//		출력합니다.
		String my_string = "nice to meet you";		
		String remove = my_string.replaceAll("[ioeu]","");
		System.out.println(remove);
				
		//문제12.
//		영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
//		문자열 numbers가 변수로 주어질 때, numbers를 정수로 바꿔 출력하세요.
//		String numbers = "onefourzerosixseven"; //14067
//		예) "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼
//		123456789를 출력합니다.
		String numbers = "onefourzerosixseven";
		
		
	}

}
