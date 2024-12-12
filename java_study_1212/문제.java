package java_study_1212;

class Book{
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		
	}
	
}



class Calculator{

	
	public int add(int a, int b) {
		return a + b;
	}
	

}



public class 문제 {

	public static void main(String[] args) {
		
//		클래스 내에서 같은 이름의 메소드를 여러 개 정의하는 것을 무엇이라고 하는가? b
//			a) 오버라이딩
//			b) 오버로딩
//			c) 캡슐화
//			d) 상속
		
		
//		객체의 필드 값을 반환하는 메소드를 일반적으로 무엇이라고 부르는가?  a
//				a) getter
//				b) setter
//				c) constructor
//				d) finalizer
		
		
//		Java에서 메소드의 반환 타입을 지정하지 않을 때 사용하는 키워드는? b
//				a) null
//				b) void
//				c) empty
//				d) none
		
		
		
//		다음 중 올바른 메소드 선언은? b
//				a) public void myMethod();
//				b) public void myMethod() { }
//				c) public myMethod() { }
//				d) void public myMethod() { }
		
		
		
//		메소드 오버로딩(Overloading)에 대한 설명으로 옳은 것은? a
//				a) 같은 이름의 메소드를 여러 개 정의하는 것
//				b) 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것
//				c) 메소드의 접근 제어자를 변경하는 것
//				d) 메소드의 반환 타입을 변경하는 것
		
		
//		다음 중 메소드의 반환 타입을 올바르게 설명한 것은? b
//				a) 메소드가 실행되는 횟수를 나타낸다.
//				b) 메소드가 반환하는 값의 데이터 타입을 나타낸다.
//				c) 메소드의 매개변수 개수를 나타낸다.
//				d) 메소드의 접근 제어자를 나타낸다.
		
		
//		다음 중 메소드의 매개변수 전달 방식에 대한 설명으로 옳은 것은?  c
//				a) 기본 자료형은 참조에 의한 전달(Pass by Reference)이다.
//				b) 참조 자료형은 값에 의한 전달(Pass by Value)이다.
//				c) 기본 자료형은 값에 의한 전달(Pass by Value)이다.
//				d) 모든 자료형은 참조에 의한 전달(Pass by Reference)이다.
		
		
//		[문제8]Calculator 클래스를 생성 후
//		두 정수를 매개변수로 받아 그 합을 반환하는 메소드 add를 작성하세요.
		Calculator a = new Calculator();
		int result = a.add(5, 5);
		System.out.println(result);
		
		
		
//		[문제8]에 생성한 클래스에서
//		정수 배열을 매개변수로 받아 그 배열의 모든 요소의 평균을 계산하여 반환하는
//		메소드 calculateAverage를 작성하세요.
		
		
		
		
//		객체를 생성할 때 사용하는 키워드는? b
//				a) class
//				b) new
//				c) this
//				d) static
		
		
//		클래스의 주요 구성 요소가 아닌 것은? d
//				a) 필드
//				b) 메소드
//				c) 생성자
//				d) 루프
		
		
//		클래스 내에서 데이터를 저장하는 변수를 무엇이라고 하는가? c
//				a) 메소드
//				b) 생성자
//				c) 필드
//				d) 객체
		
		
//		클래스의 인스턴스를 생성할 때 자동으로 호출되는 특별한 메소드는? b
//				a) main 메소드
//				b) 생성자
//				c) getter 메소드
//				d) setter 메소드
		
		
//		[객체 생성하기]
//				"Book" 클래스를 정의하고, 제목(title)과 저자(author)를 속성으로 추가한 후,
//				이 클래스의 객체를 생성하는 코드를 작성하세요.
		Book q = new Book("제목" , "저자");
		System.out.println(q.author);
		System.out.println(q.title);		
		


	}

}
