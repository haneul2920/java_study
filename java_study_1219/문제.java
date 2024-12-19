package java_study_1219;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("The dog barks");
	}
}



public class 문제 {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
		
	}
}




//		1.자바에서 상속을 구현할 때 사용하는 키워드는? a
//				a) extends
//				b) implements
//				c) inherit
//				d) super

//		2.자바에서 모든 클래스의 최상위 클래스는? c
//				a) Main
//				b) Super
//				c) Object
//				d) Base

//		3.상속의 주요 장점이 아닌 것은? c
//				a) 코드 재사용
//				b) 다형성 구현
//				c) 다중 상속 지원
//				d) 계층 구조 형성

//		4.자식 클래스가 부모 클래스의 메소드를 재정의하는 것을 무엇이라고 하는가? b
//				a) 오버로딩
//				b) 오버라이딩
//				c) 캐스팅
//				d) 추상화

//		5.자바에서 클래스가 여러 클래스를 동시에 상속받는 것을 허용하는가? b
//				a) 허용한다
//				b) 허용하지 않는다
//				c) 특정 조건에서만 허용한다
//				d) 컴파일러 설정에 따라 다르다

//		6.상속을 통해 얻을 수 없는 이점은? d
//				a) 코드의 재사용성 
//				b) 다형성의 구현
//				c) 캡슐화의 향상
//				d) 구조적 설계의 용이성

//		7.상속 관계에서 자식 클래스의 객체를 생성할 때 가장 먼저 호출되는 생성자는? b
//				a) 자식 클래스의 생성자
//				b) 부모 클래스의 생성자
//				c) Object 클래스의 생성자
//				d) 매개변수가 없는 기본 생성자

//		8.다음과 같은 Animal 클래스가 주어졌을 때, 이를 상속받는 Dog 클래스를
//		작성하세요. 
//		class Animal {
//			public void makeSound() {
//				System.out.println("The animal makes a sound");
//			}
//		}
//		Dog 클래스는 makeSound() 메서드를 오버라이드하여
//		"The dog barks"를 출력해야 합니다.
		

		
//		9.class Vehicle {
//			 protected String brand = "Ford";
//			 public void honk() {
//			 System.out.println("Tuut, tuut!");
//			 }
//			}
//			class Car extends Vehicle {
//			 private String modelName = "Mustang";
//
//			 public Car() {
//			 System.out.println("Car constructor called");
//			 }
//
//			 @Override
//			 public void honk() {
//			 System.out.println("Beep, beep!");
//			 }
//
//			 public void printInfo() {
//			 System.out.println(brand + " " + modelName);
//			 }
//			}
//			public class Main {
//			 public static void main(String[] args) {
//			 Car myCar = new Car();
//			 myCar.honk();
//			 myCar.printInfo();
//
//			 Vehicle myVehicle = new Car();
//			 myVehicle.honk();
//			 }
//			}
//			문제. 이 코드의 실행 결과는 무엇인가요?
