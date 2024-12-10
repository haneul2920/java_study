package java_study_1210;

public class java_study_1210_1 {

	public static void main(String[] args) {
		// 복습
		// 연산자
		/*
		 * 가장 많이 사용하는 연산자
		 * 1. 대입 연산자
		 * 2. 사칙 연산자(+,-,/,%,*)
		 * 3. 증감 연산자
		 * 4. 논리 연산자
 		 */
		
		int x = 10; // 초기 선언식
		x = 30;
		System.out.println("x의 최종 값은 : " + x);
		
		
		String s = "123";
		String s2 = "456";
		String result = s + s2; // 문자가 합쳐짐
		System.out.println("결과 : " + result);
		int num = Integer.parseInt(s);
		int num2 = Integer.parseInt(s2);
		int num3 = num2 + num;
		System.out.println(num3);
		
		
		int count = 0;
		++count;
		++count;
		++count;
		System.out.println(count);
		
		// 제어문
		/*
		 * if문
		 * switch문
		 * 
		 * 조건문이란 : 특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행한다.
		 * 
		 * if(조건식){
		 * 		코드 작성(조건이 true 일때 실행 하는 코드)
		 * }
		 * 
		 * if-else문 : 조건이 참일 때와 거짓일 때 각각 다른 코드를 실행
		 * if(조건식){
		 * 		
		 * }else{
		 * 		if 조건식이 false 일때 실행하는 코드
		 * }
		 * 
		 * else-if문 : 여러개의 조건을 평가
		 * if(조건식1){
		 * 		조건식1이 true 일때 실행
		 * }else if(조건식2){		
		 * 		조건식2이 true 일때 실행
		 * }else if(조건식3){
		 * 		조건식3이 true 일때 실행
		 * }else{
		 * 		모든 조건이 false 일때 실행하는 코드
		 * }
		 * 
		 */
		
		// 무엇이 출력되고 그 이유는 무엇인지 작성하기
		// 출력 A
		// boolean 타입 변수는 앞에 'is' 먼저 시작한다(개발자 규칙)
		boolean isData = false;
		if(!isData) {
			System.out.println("출력 A");			
		}else {
			System.out.println("출력 B");
		}
		
		// 두 비밀번호 비교하기
		String password = "123"; // 비밀번호
		String rePassword = "456"; // 비밀번호 재입력
		//==,!= : 비교연산자
		//자바에서는 문자를 비교할땐 비교연산자가 아니라 equals(동등한) 를 사용합니다.
		if(password.equals(rePassword)) { // 문자열 함수로 문자를 비교한다.		
			System.out.println("기존비밀번호와 새로운 비밀번호가 같습니다");			
		}else if (!password.equals(rePassword)){
			System.out.println("비밀번호 변경완료");
		}
		
		int p = 5;
		if(10 != p) {
			System.out.println("A 출력");
		}else {
			System.out.println("B 출력");
		}
		
		// 반복문 복습
		/*
		 * 반복문 : 특정 블록의 코드를 여러 번 반복해서 실행
		 * for : 반복 횟수가 정해져 있을 때 사용
		 * while : 조건이 참인 동안 반복실행
		 * 
		 * for 문 실행순서 : 초기화 -> 조건식 -> 반복할 코드 -> 증감식
		 * for(초기화(1); 조건식(2); 증감식(4)){
		 * 		반복할 코드(3)
		 * }
		 *  
		 * while(조건식){
		 * 		반복할 코드
		 * }
		 *
		 */
		
		// 1부터 10까지의 숫자를 출력 하고자한다.
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i % 2 == 0 ) {
				System.out.println("짝수 : " + i);
			}
		}
		
		// 배열 : 동일한 데이터 타입의 여러 데이터를 하나의 변수로 관리할 수 있게 해주는 자료구조
		//		 쉽게 말해, 같은 종류의 데이터들을 한 줄로 나열해 놓은 것 (for 문 하고 같이 쓰임)
		
		
		//1. 배열 선언 및 초기화
		int array[] = {1,2,3,4,5,6,7,8,9,10}; // 첫번째 방법
		int array2[] = new int[10]; // 두번째 방법 (많이 쓰임)
		//2. 배열 요소(아이템) 접근 및 조작
		System.out.println("0번 index : " + array[0] + " 요소(아이템)");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 배열 요소 값 변경하기
		
		System.out.println("2번 index : " + array[2] + " 요소(아이템)");
		array[2] = 50; // 2번째 요소에 50값 대입(기존에 값은 없어짐)
		System.out.println("2번 index : " + array[2] + " 요소(아이템)");
		
		//같이 풀기 1. score보다 점수 높은 사람 카운트 하기
		int score[] = {50,80,100,100,90}; // 점수 배열
		int myscore = 77; // 나의 점수
		int count2 = 0;
		for(int i = 0; i < score.length; i++){
			if(score[i] > myscore) {
				count2++;
			}
		}
		System.out.println("내 점수보다 높은 사람 수 : " + count2);
		
		
		//같이 풀이 2. 배열에서 최댓값 찾기
		int numbers[] = {12,45,7,23,56,89,34};
		int max = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}		
		System.out.println("가장 큰 값은 : " + max);
		
		//같이 풀기 3. 닉네임 중복체크하기
		String nickNames[] = {"사과","바나나","오렌지","포도","키위"};
		String userNickName = "사과";
		//nickNames 배엘에 입력 박은 닉네임이 있다면 "닉네임이 중복 됩니다" 라는 메세지를 출력하시오
		boolean isFlag = false; // 플래그 값 (1 or 0)
		for(int i = 0; i<nickNames.length; i++) {
			String temp = nickNames[i];
			if(temp.equals(userNickName)) {
				isFlag = true;
			}
		}
		//플래크를 활용한 코딩
		if(isFlag) { // false 엿는데 true로 변했다면 중복된 닉네임이 있다는 것
			System.out.println("닉네임이 중복 됩니다.");
		}
		
		
		for(String i : nickNames) {
			if(i.equals(userNickName)) {
				System.out.println("닉네임이 중복 됩니다.");
			}
		}
		//같이 풀기 4. 배열의 모든 요소의 합 구하기(for-each로 풀기)
		
		int numbers2[] = {5,10,15,20,25};
		int sum = 0;
		
		for(int i : numbers2) {
			sum += i;
		}
		System.out.println("배열의 총 합 : " + sum);
		
		
		
	}

}
