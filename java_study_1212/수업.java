package java_study_1212;

class 학생 {
	String 이름; // 필드변수(전역변수), 초기화 생략가능
	int 학년;	
	/*
	 * 클래스 구조(객체지향 프로그램에 있는 공통 개념)
	 * 1. 필드 변수
	 * 2. 메소드 : 특정 작업을 수행하는 코드의 집합
	 * 			->능력있는 개발자는 메소드를 여러개 만들어서 코드를 분리함.
	 * 3. 생성자
	*/
//	메소드의 기본구조
//	public : 접근 제어자
//	int : 반환 데이터타입(리턴값)
//	add : 메소드 이름(보통 동사로 작성을 합니다.)
//	(int a, int b) : 인자값 or 매개변수 or 파라미터 (메소드가 작업을 수행하는 데 필요한 데이터)
//	return : 데이터 타입에 맞는 반환값(메소드의 결과를 반환)
	
	public int add(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	
	//퀴즈) 곱하는 메소드, 나누는 메소드를 만들어주세요
	public int 곱하기(int a, int b) {
		// 반환 데이터타입하고 리턴 타입은 동일해야 합니다
		return a*b;
	}
	
	public int 나누기(int a, int b) {
		return a/b;
	}
	
	//반환 데이터 타입이 String
	//반환 데이터 타입에 총 9가지가 올 수 있음.+ void
	public String 취미() {
		String 취미 = "등산";
		return 취미; // 리턴타입과 반환 데이터 타입은 항상 일치 해야한다.
	}
	
	public void 취미2() {
		// void는 '리턴 없음'을 의미한다
		System.out.println("취미는 운동입니다.");
	}
	
}

// 클래스 파일 하나에 public 한번만 작성 가능
// public class 이름은 파일 이름과 동일 해야함
public class 수업 {
		
	public static void main(String[] args) {
		/*
		 * Java 메모리 : Heap 이라는 영역에 저장(인스턴스 변수)		
		 */
		
		학생 s1 = new 학생(); // new : 클래스를 불러오다.(클래스를 인스턴스화(객체) 하다)
		s1.이름 = "홍길동";
		s1.학년 = 3;
		System.out.println("이름은 :" + s1.이름+ "\n학년 : " + s1.학년);
		System.out.println(s1); // Heap에 저장된 위치(메모리 주소) 조회
		
		//동일한 클래스 한번 더 호출하기
		학생 s2 = new 학생();
		System.out.println(s2);
		s2.이름 = "김길동";
		s2.학년 = 1;
		System.out.println("이름은 :" + s2.이름+ "\n학년 : " + s2.학년);
		
		s1.학년 = 1; // 홍길동 학년 수정
		System.out.println("이름은 :" + s1.이름+ "\n학년 : " + s1.학년);
		
		학생 s3 = new 학생();
		System.out.println(s3);// 새로운 heap 영역에 저장
		int result = s3.add(10, 20);
		System.out.println("결과 : " + result);
		
		int result2 = s3.minus(20, 10);
		System.out.println("결과 : " + result2);
		
		int result3 = s3.곱하기(3, 5);
		System.out.println("결과 : " + result3);
		
		int result4 = s3.나누기(9, 3);
		System.out.println("결과 : " + result4);
		
		String 취미 = s3.취미();
		System.out.println("취미는 " + 취미);
		s3.취미2();
		
	}

}
