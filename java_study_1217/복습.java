package java_study_1217;

/*
 * 객체지향 개념
 * 
 */
class 자동차{
	/*
	 * 클래스는 
	 * 필드변수(전역변수), 메소드(리턴타입이 없는 메소드), 생성자로 구분됨
	 * 
	*/
	/*
	 * 필드변수
	 * 1.default 초기값이 존재(ex.String은 null값이 자동 대입, int값은 0이 자동 대입)
	 * 2.필드변수 == 속성(attribute)(실무에서는 속성)
	*/
	String 브랜드명; // 필드변수(전역변수)
	String 자동차타입;
	
	public 자동차(){ //기본(default) 생성자
		/*
		 * 기본생성자 특징
		 * 1. 메소드 이름이 클래스이름과 동일
		 * 2. 리턴 타입이 없습니다.
		 * 3. 필드변수 값을 초기화 하기위해 사용
		*/
	}
	
	/*
	 * public : 접근지정자(*public, *private, protected, default)
	 * int : 리턴 데이터 타입
	 * getNumber : 메소드 이름(동사)
	 * (int x, int y) : 파라미터 or 인자 or 인수
	*/
	public int getNumber(int x,int y) {
		int result = x + y;
		return result; // return 을 선언햇으면 리턴 데이터타입에 맞는 값을 return 해야함
	}
	
	/*
	 * 구매한 옷의 가격 int price 가 파라미터로 주어졋을 때
	 * 지불해야 할 금액을 return하도록 getMoney 함수(메소드) 로직완성하기
	 */
	public int getMoney(int price) {
		// price금액이 50만원 이상이면 20%할인, 30만원 이상이면 10%할인, 10만원 이상이면 5% 할인
		if(price >= 500000) {
			price *= 0.8;
		}else if(price >= 300000) {
			price *= 0.9;
		}else if(price >= 100000) {
			price *= 0.95;
		}		
		return price;
	}
	/*
	 * 정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때
	 * arr의 평균값을 return 하는 함수 getAvg를 완성해 보시오.
	 * 1. 메소드 만들어 보기
	 * 2. 로직 구현
	*/
	
	public double getAvg(int arr[]){
		// 지역변수는 초기화를 해줘야함
		double avg = 0; // 메소드 안에 있는 지역변수 
		double sum = 0; // 총합
		
		for(int i : arr) {
			sum += i;
		}
		avg = sum / arr.length; // 평균값 구하기
		
		return avg;
	}
	/*
	 * 정수를 담고있는 배열 arr가 파라미터로 주어졌을 때
	 * 배열 값 중 원소가 짝수면 2로 나누고 다시 배열에 대입
	 * 최종 배열 arr를 return함수 getArr를 완성해 보시오.
	*/
	public double[] getArr(double arr[]) {
		for(int i = 0; i < arr.length; i++) {
			double index = arr[i];
			if(index % 2 == 0) {
				arr[i] = index / 2;			
			}
		}		
		return arr;
	}
	
	/*
	 * 정수를 담고있는 배열 arr가 파라미터로 주어졋을 때
	 * 배열 arr에 총합을 return 하는 getArrSum을 만들어 보시오.
	*/
	public int getArrSum(int arr[]) {
		int sum = 0;		
		for(int i : arr) {
			sum += i;
		}		
		return sum;
	}
	
	
}

public class 복습 {

	public static void main(String[] args) {
		
		자동차 car1 = new 자동차(); //new : 클래스 호출(인스턴스화)
		// 자동차() : default 생성자 
		
		int 리턴값 = car1.getNumber(10, 20);
		System.out.println("리턴 결과 : " + 리턴값);
		
		int 최종값 = car1.getMoney(340000);
		System.out.println("결과 : " + 최종값);
		
		int array[] = {80,90,100,100};
		double 평균값 = car1.getAvg(array); //배열 파라미터에 넘겨주기
		System.out.println("배열 평균값 : " + 평균값);
		
		int 배열합 = car1.getArrSum(array);
		System.out.println("배열의 총합 : " + 배열합);
	}

}
