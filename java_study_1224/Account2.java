package java_study_1224;
/*
 * interface OR class 명명규칙 '대문자로 시작' (모든 언어 규칙)
*/

public interface Account2 { //계좌의 기본 기능을 정의(선언)합니다.
	//첫번째 순서 인터페이스 만들기
	/*
	 * 인터페이스 특징
	 * 1.구현 불가능, 선언만 가능합니다.
	 * 2.public만 작성할 수 있습니다.
	 */
	void deposit2(double amount);//입금
	boolean withdraw2(double amount);//출급
	double getBalance2();//잔액조회
	String getAccountNumber2();//계좌번호 조회
}
