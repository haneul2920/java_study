package java_study_1212;

class Person{
	String name;
	int age;
	
	Person(String name, int age){ // 생성자 : 클래스가 생성될 때(new 불러올때) 초기화를 위해 실행되는 특별한'메소드'
 		this.name = name; // this.name은 필드변수 'name'을 가르킨다.
 		this.age = age;
 		
 		//this.x = 1; // 필드변수에 x 라는 변수가 없으므로 해당 코드는 에러
 		
		/*
		 * 생성자 특정
		 * 1. 생성자 이름과 클래스 이름은 동일 해야한다.
		 * 2. 생성자는 return 타임이 없는 메소드 입니다.
		 * 3. 생성자는 파라미터 타입만 있고, 기본(default) 생성자는 아무것도 받지 않습니다. 
		*/
	}
		
	// void : 리턴(return)타입이 없는 메소드 생성
	public void celebrateBirthday(String name) {
		++age;
		// 메소드에서 필드변수 접근 가능
	}
}



public class 수업2 {

	public static void main(String[] args) {
		Person P = new Person("김철수" , 20);
		P.name = "김철수";
		P.age = 20;
		
		System.out.println(P.name +"\n"+ P.age); // 필드변수 출력
		P.celebrateBirthday("김철수");
		// 파라미터에 값이 있다면, 메소드를 호출할 때 값을 무조건 넣어줘야 합니다.
		
		System.out.println(P.age);
		
		Person P2 = new Person("홍길동" , 30); // 생성자로 필드변수 초기화 하기		
		System.out.println(P2.name);
		System.out.println(P2.age);
		
		
	}

}
