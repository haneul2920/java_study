package java_study_1128;

public class java_study_1128_2 {

	public static void main(String[] args) {
		// 문자열
		String text = "ediya";
		System.out.println("문자열 길이" + text.length());
		
		String userid = "홍길동";
		if(userid.length() >= 10) {
			System.out.println("아이디는 10글자 미만으로 작성해주세요.");
		}else {
			System.out.println("사용가능한 아이디입니다.");
		}
		
		// concat : 두 문자열을 합친다.(실무 빈도수 5%? 가끔 보임)
		String a = "apple";
		String b = "watch";
		System.out.println("문자열 합치기 : " + a.concat(b));
		
		//*substring : 부분 문자열 추출 (실무 빈도수 80~90%)
		String text1 = "Hello, World!";
		System.out.println(text1.substring(0,5));
		// 퀴즈 : wor <- 서브스트링으로 해당 단어 출력하기
		System.out.println(text1.substring(7,10));
		
		//indexOf : 문자열 검색 -> 해당 문자가 몇번 째 위치하는지 조회
		System.out.println(text1.indexOf("l"));
		System.out.println(text1.indexOf("W"));
		
		//***replace : 문자열 대체
		String word = "순대국밥";
		System.out.println(word.replaceAll("순대","돼지"));//순대를 돼지로 변경
		//순대국밥에서 돼지국밥으로 변경
		
		//***toUpper,toLower : 소문자->대문자, 대문자->소문자 변경
		String code = "abcd00";
		System.out.println(code.toUpperCase());
		
		String code2 = "ABCD00";
		System.out.println(code2.toLowerCase());
		
		//**trim : 공백제거
		String word2 = "   안녕하세요?     ";
		System.out.println(word2.trim());
		
		//***split : 문자 분할(코테 단골)
		String word3 = "한화이글스,두산베어스,롯데자이언츠";
		String result[] = word3.split(",");
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		//** contains : 특정 문자열이 포함되어 있는지 여부 확인
		String word4 = "hyunsangwon93@gmail.com";
		System.out.println(word4.contains("@")); //문자열에 @가 있다면 True
		System.out.println(word4.contains("e")); //문자열에 e가 없다면 False
			
		//*** equals : 문자열 비교(*자바 특징)
		String food = "등심돈까스";
		String food2 = "등심돈까스";
		String food3 = "치즈돈까스";
		
		// ==(비교연산자), 자바에서는 문자열 비교는 equals 로 합니다.
		System.out.println(food.equals(food2));
		System.out.println(food.equals(food3));
		
	}

}
