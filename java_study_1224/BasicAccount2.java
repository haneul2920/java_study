package java_study_1224;
/*
 * 인터페이스를 구현한 클래스는 '재정의'를 무조건 해야합니다.(계약)
 * extends 보다 implements 를 더많이 사용함(실무)
*/

public class BasicAccount2 implements Account2{//인터페이스를 구현(implements)한 기본 계좌 클래스
	//두 번째 순서- "BasicAccount" 클래스 만들기
	
	//필드변수에는 접근지정자(public, private)를 사용할 수 있음
	private String accountNumber; // 계좌번호
	private double balance; // 잔액
	
	/*
	 * 생성자 특징 2가지만 알면 끝
	 * 1. 생성자 이름과 클래스 이름은 동일해야함
	 * 2. 생성자는 리턴타입이 없음
	*/
	public BasicAccount2(String accountNumber) { //생성자
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	@Override
	public void deposit2(double amount) { //입금
		if(amount > 0) {
			this.balance += amount;
			System.out.println("입금 완료 : " + amount);
		}else {
			System.out.println("유효하지 않는 금액");
		}
		
	}

	@Override
	public boolean withdraw2(double amount) {//출금
		if(amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			System.out.println("출금 완료 : " + amount);
			return true;
		}else {
			System.out.println("출금실패 : 잔액 부족 또는 유효하지 않는 금액");
			return false;
		}		
	}

	@Override
	public double getBalance2() { // 필드변수가 private 이기 때문에 메소드로 필드변수를 호출할 수 있게 된다.		
		return this.balance;
	}

	@Override
	public String getAccountNumber2() {// 필드변수가 private 이기 때문에 메소드로 필드변수를 호출할 수 있게 된다.		
		return this.accountNumber;
	}
	

	
}
