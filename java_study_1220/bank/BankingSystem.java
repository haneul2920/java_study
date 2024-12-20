package java_study_1220.bank;

import java.util.Scanner; // 내장 클래스

// 메인 클래스(Console 출력확인)
public class BankingSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true){ //은행 업무 선택
			System.out.println("안녕하세요, 길동은행 입니다. 무엇을 도와드릴까요?");
			System.out.println("[1] 계좌 생성 \n[2] 입금 \n[3] 출금 \n[4] 잔액 조회 \n[5] 종료");

			System.out.print("업무 선택 : ");
			int choice = scan.nextInt(); //스캐너로 업무 입력 받기
			scan.nextLine(); // 버퍼 지우기 
			
			switch(choice) {
				case 1:
					System.out.print("새 계좌 번호 : ");
					String newAccountNumber = scan.next();
					bank.createAccount(newAccountNumber);
					//Bank 클래스에 정의된 createAccount 메소드 호출
					break;
				case 2:
					System.out.print("입금 계좌 번호 입력 : ");
					String depositAccount = scan.next();
					System.out.print("입금액 : ");
					double depositAmount = scan.nextDouble();
					//입금할 계좌가 없다면?
					BasicAccount account = bank.findAccount(depositAccount);//계좌 조회
					if(account != null) {
						account.deposit(depositAmount); //입력ㅂ잗은 입금액 최종 완료						
					}else {
						System.out.println("계좌를 찾을 수 없습니다.");
					}					
					break;
				case 3:
					System.out.print("출금 계좌 번호 입력 : ");
					String withdrawAccount = scan.next(); // 출금할 계좌 번호
					System.out.print("출금액 : ");
					double withdrawAmount = scan.nextDouble();
					
					BasicAccount account2 = bank.findAccount(withdrawAccount);
					if(account2 != null) {
						account2.withdraw(withdrawAmount);
					}else {
						System.out.println("계좌를 찾을 수 없습니다.");
					}
					break;
				case 4:
					System.out.print("잔액 조회 계좌 번호 : ");
					String balanceAccount = scan.next();
					
					BasicAccount account3 = bank.findAccount(balanceAccount);
					if(account3 != null) {
						System.out.println("현재 잔액 : " + account3.getBalance());
					}else {
					}
					
					break;
				case 5:
					System.out.println("종료 합니다.");
//					scan.close(); // 스캐너 종료
//					System.exit(0);
					return;					
				default: // 1~5번 말고 다른 번호를 입력한다면.
					System.out.println("잘못된 선택 입니다.");
			}
		}
	}
}
