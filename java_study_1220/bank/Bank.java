package java_study_1220.bank;

// 계좌를 생성하고 관리하는 클래스입니다.
public class Bank {
	// 계좌를 n개 생성
	// '클래스;도 데이터 타입(레퍼런스 타입)이다.
	private BasicAccount[] account;//BasicAccount를 담는 배열
	private int accountCount;
	
	public Bank() { // 기본생성자로 필드변수 초기화 하기
		account = new BasicAccount[10]; // 최대 10개 계좌 생성 가능
		accountCount = 0;
	}
	
	//계좌 생성
	public void createAccount(String accountNumber) {
		
		if(accountCount < account.length) {
			account[accountCount] = new BasicAccount(accountNumber); // 클래스 생성 후 배열에 대입
			++accountCount;// 계좌 생성 수 증가시키기
			System.out.println("계좌 생성 완료 : " + accountNumber);
		}else {
			System.out.println("더 이상 계좌를 생성할 수 없습니다.");
		}
	}
	
	//계좌 조회
	//클래스도 데이터 타입이기 때문에 리턴 타입으로 사용할 수 있음
	public BasicAccount findAccount(String accountNumber) {
		for(int i = 0; i < accountCount; i++) {
			//equals : 문자를 비교 할 때 사용하는 문자열 메소드
			String myAccountNumber = account[i].getAccountNumber();
			if(myAccountNumber.equals(accountNumber)) { // 파라미터로 받은 계좌 번호랑 일치하는지 조회
				//account[i].getAccountNumber() : i 번째에 저장된 BasicAccount의
				//getAccountNumber() 메소드 호출
				return account[i]; // i번재에 있는 원소(BasicAccount)리턴
			}
		}
		return null;
	}
}
