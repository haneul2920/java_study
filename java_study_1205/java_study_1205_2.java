package java_study_1205;

import java.util.Random;
import java.util.Scanner;

public class java_study_1205_2 {

	public static void main(String[] args) {
		// 지금까지의 복습 문제
		
		
//		문제 1.
//		○○은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다.
//		○○은 무엇일까요? 3
//		1. 변수
//		2. 실수
//		3. 상수
//		4. 정수

//		문제 2.
//		문자형변수 x를 선언하고 “10”을 할당 후
//		정수형 변수 y를 선언하고 x의 값을 y에 대입하세요.
//		*문자에서 정수형으로 ‘형변환’ 해야합니다.
		String x = "10";
		int y = Integer.valueOf(x);
		System.out.println(y);
		
//		문제 3.
//		다음 중 잘못된 식별자(변수이름)는? 3 
//		1. monster3
//		2. apple_13_pro
//		3. 3apple
//		4. AaaAAA
		
		
//		문제 4.
//		1부터 100까지의 숫자 중 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요.
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println("짝수 : "+ i);
			}
		}
		
//		문제 5.
//		boolean 운전가능 = !면허증소지;
//		최종 운전가능 값은 무엇일까요? false
		
//		문제 6.
//		1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요.
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
		
//		문제 7.
//		길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
//		피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각
//		이상 먹기 위해 필요한 피자의 수를 출력하세요.
//		int n = 15; //사람의 수
//		예) 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
//		n이 15라고 가정하면 피자는 3판이 필요합니다.
		
		int n = 15;
		int pizzaPice = 7;
		int pizza = (n + pizzaPice - 1) / pizzaPice;
		System.out.println("필요한 피자판수는 " + pizza + "개 입니다.");
		
//		문제 8.
//		사용자로부터 정수를 입력받아 팩토리얼을 계산하는 프로그램을 작성하세요.
//		(예: 5! = 5 * 4 * 3 * 2 * 1)
		int w = 1;
		for(int i = 1; i <= 5; i++) {
			w *= i;
		}
		System.out.println(w);
		
//		문제 9.
//		2부터 5까지의 구구단을 출력하는 프로그램을 작성하세요.
		
		for(int i = 2; i <= 5; i++) {
			System.out.println("===" + i + "단===");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i +" X "+ j + " = " + i*j);
			}
		}
		
//		문제 10.
//		다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
//		****
//		***
//		**
//		*
		int b = 4;
		for (int i = b; i >= 0; i--) {		
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
		
//		문제 11.
//		사용자로부터 문자열을 입력받아
//		그 문자열의 길이를 출력하는 프로그램을 작성하세요.
//		단, 길이가 11 이상인 문자열은 “아이디는 10글자 이하로 작성해주세요.”
//		라고 출력할 것.
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		
		if(text.length() <= 10) {
			System.out.println(text);
		}else {
			System.out.println("아이디는 10글자 이하로 작성해주세요.");
		}
		
//		문제 12.
//		배열에 대한 설명 중 다른 것은? 4
//		① 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간이다.
//		② int[] array = new int[10]; 총 10개의 공간이 생성되었다.
//		③ 배열은 항상 0부터 시작한다.
//		④ 반복문을 이용하여 처리하기에 적합하지 않은 자료구조다.
		
//		문제 13.
//		크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
//		배열에서 가장 큰 값을 작성하세요.
		
		int array [] = new int[10];
		Random rand = new Random();
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100)+1;
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
		
//		문제 14.
//		크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
//		배열의 모든 요소의 평균과 합산을 출력하는 프로그램을 작성하세요.
		
		int arraySum = 0;
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		System.out.println("배열의 합은 : " + arraySum );
		
		
//		문제 15.
//		문자열 "Java Programming"에서 'a'의 개수를 세는 코드를 작성하세요.
		
		String text2 = "Java Programming";
		String textArray[] = text2.split("");
		int count = 0;
		for(String i: textArray) {
			if(i.contains("a")) {
				count++;
			}
		}
		System.out.println(count);
		
//		문제 16.
//		아이스 아메리카노는 한잔에 5,500원입니다.
//		money가 변수로 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을
//		출력하시오.
//		int money = 15000;
//		예) 15000원이면 커피 2잔과 4000원이 남습니다.
		
		int money = 15000;
		int 커피 = money / 5500;
		money %= 5500;
		
		System.out.println("커피 " + 커피 + "잔과 " + money+"원이 남습니다");
		
//		문제 17.
//		길동는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
//		길동이네 반 친구들의 키가 담긴 정수 배열 array와 길동이의 키 height가
//		변수로 주어질 때, 길동이보다 키 큰 사람 수를 출력하시오.
//		int[] array = {149, 180, 192, 170};
//		int height = 167;
//		예) 149, 180, 192, 170 중 길동이보다 키가 큰 사람은
//		180, 192, 170으로 세 명입니다.
		
		int[] array2 = {149, 180, 192, 170};
		int height = 167;
		int count2 = 0;
		for(int i = 0; i < array2.length; i++) {
			if(array2[i] >= height) {
				count2++;
			}
		}
		System.out.println("길동이 보다 큰 사람 수 : " + count2);
		
//		문제 18.
//		군 전략가 길동이는 전쟁 중 적군이 다음과 같은
//		암호 체계를 사용한다는 것을 알아냈습니다.
//		1. 암호화된 문자열 cipher를 주고받습니다.
//		2. 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
//		문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을
//		출력하시오.
//		String cipher = "dfjardstddetckdaccccdegk";
//		int code = 4;
//		예) "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째,
//		24번째 글자를 합친 "attack"을 출력합니다.
		
		String cipher = "dfjardstddetckdaccccdegk";
		String total[] = cipher.split("");
		int code = 4;
		int count3 = 0;

		for(int i = 0; i < total.length; i++) {
			count3++;
			if(count3 % code == 0) {
				System.out.print(total[i]);
			}
		}
		System.out.println();
		
//		문제 19.
//		전화번호 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한
//		나머지 숫자를 전부 *으로 가린 문자열을 출력하는 프로그램을 완성해주세요.
//		String phone_number = “0171238888”;
//		예)
//		027778888은 *****8888
//		01033334444은 *******4444가 나와야 합니다.
		
		String phone_number = "0171238888";
		String array4[] = phone_number.split("");
		String pwNumber = phone_number.substring(phone_number.length()-4,phone_number.length());
		
		for(int i = 0; i < array4.length; i++) {
			if (i < array4.length-4) {
				array4[i] = "*";
				System.out.print(array4[i]);
			}
		}
		System.out.println(pwNumber);
		
//		String pwNumber = phone_number.substring(0,phone_number.length()-4);
//				substring(phone_number.length()-4,phone_number.length());
//		System.out.println(pwNumber);
		
		// 문제 20.
//		○○치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
//		쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도
//		쿠폰이 발급됩니다. 시켜먹은 치킨의 수 chicken이 변수로 주어질 때
//		받을 수 있는 최대 서비스 치킨의 수를 출력하세요.
//		int chicken = 100;
//		예)
//		1. 1081마리를 주문하면 쿠폰이 1081장 발급되므로 서비스 치킨 108마리를
//		주문할 수 있습니다. 그리고 쿠폰이 1장 남습니다.
//		2. 108마리를 주문하면 쿠폰이 108장 발급되므로 서비스 치킨 10마리를
//		주문할 수 있습니다. 그리고 쿠폰이 8장 남습니다.
//		3. 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를
//		주문할 수 있습니다.
//		4. 1마리를 주문하면 쿠폰이 1장 발급됩니다.
//		5. 가지고 있는 쿠폰이 총 10장이므로 서비스 치킨 1마리를 추가로
//		주문할 수 있습니다.
//		6. 따라서 108 + 10 + 1 + 1 = 120 을 출력합니다.
		
		int chicken = 100;
		int coupon = 0;
		int Service = 0;
		
		
		while () {
            
        }
		
		// 문제 21.
//		문자열 my_string이 변수로 주어집니다. my_string에서 중복된 문자를 제거하고
//		하나의 문자만 남긴 문자열을 출력하세요.
//		String my_string = "people";
//		예)
//		"people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 출력합니다.
		
		
		
		
		
		//문제 22.
//		개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는
//		병력을 데리고 나가려고 합니다. 장군개미는 5의 공격력을, 병정개미는 3의
//		공격력을 일개미는 1의 공격력을 가지고 있습니다.
//		예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고
//		가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면
//		더 적은 병력으로 사냥할 수 있습니다. 사냥감의 체력 hp가 변수로 주어질 때,
//		사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가
//		필요한지를 출력하시오.
//		int hp = 24;
//		예)
//		1. hp가 24이므로, 장군개미 네마리 병정개미 한마리 일개미 한마리로
//		사냥할 수 있습니다. 따라서 6을 출력합니다.
//		2. hp가 999이므로, 장군개미 199 마리 병정개미 한마리 일개미 한마리로
//		사냥할 수 있습니다. 따라서 201을 출력합니다.
		
		
		
		
	}

}
