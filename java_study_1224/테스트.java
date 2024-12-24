package java_study_1224;

public class 테스트 {

	public static void main(String[] args) {
		//1. 입금, 출금 테스트하기
		
		//지역변수(접근지정자를 선언할 수 없음)
		//메소드안에 작성된 변수를 '지역변수(로컬변수)'라고 부름
		String 계좌번호 = "174509";
		BasicAccount2 account1 = new BasicAccount2(계좌번호);
		
//		System.out.println("계좌번호 : " + account1.getAccountNumber2());
		double 잔액 = account1.getBalance2();
		String 계좌번호출력 = account1.getAccountNumber2();
		System.out.println("잔액 : " + 잔액);
		System.out.println("계좌번호출력 : " + 계좌번호출력);
		
		account1.deposit2(5000); //5천원 입금
		잔액 = account1.getBalance2();
		System.out.println("잔액 : " + 잔액);
		
		account1.withdraw2(2000); //2천원 출금
		잔액 = account1.getBalance2();
		System.out.println("잔액 : " + 잔액);
		
		String 계좌번호2 = "123123";
		BasicAccount2 account2 = new BasicAccount2(계좌번호2);
		//account2에 만원입금하고 3천원 출금해서 최종 잔액을 출력하시오.
		
		account2.deposit2(10000);
		잔액 = account2.getBalance2();
		System.out.println("잔액 : " + 잔액);
		account2.withdraw2(3000);
		잔액 = account2.getBalance2();
		System.out.println("잔액 : " + 잔액);
		/*
		 * account1 과 account2는 동일한 BasicAccount를 호출했지만
		 * 각각 다른 값을 가진 클래스(객체) 이다.
		*/
		
	}

}
