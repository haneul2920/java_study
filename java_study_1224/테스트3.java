package java_study_1224;

public class 테스트3 {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); // Bank 호출
		
		//계좌 생성
		String 계좌번호1 = "123456";
		bank.createAccount(계좌번호1);
		String 계좌번호2 = "777777";
		bank.createAccount(계좌번호2);
		
		//계좌번호 777777찾기
		BasicAccount2 basicAccount2 = bank.findAccount(계좌번호2);
		
		basicAccount2.deposit2(50000); //찾은 계좌에 50000원 입금
		
		System.out.println("계좌번호 : " + basicAccount2.getAccountNumber2());
		System.out.println("잔액 : " + basicAccount2.getBalance2());
		
		/*
		 * 퀴즈
		 * 계좌번호가 9999인 계좌번호3을 생성하고
		 * 계좌번호3에 10만원 입금
		 * 계좌번호3에 5만원 출금
		 * 계좌번호3에 최종 잔액 출력
		*/
		
		String 계좌번호3 = "9999";
		bank.createAccount(계좌번호3);
		BasicAccount2 basicAccount3 = bank.findAccount(계좌번호3);
		basicAccount3.deposit2(100000);
		basicAccount3.withdraw2(50000);
		System.out.println("계좌번호 : " + basicAccount3.getAccountNumber2() + "\n잔액 : " + basicAccount3.getBalance2());

	}

}
