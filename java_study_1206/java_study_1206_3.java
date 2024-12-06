package java_study_1206;

public class java_study_1206_3 {

	public static void main(String[] args) {
		// 문제 : 버블 정렬을 이용해서 아래 배열을 오름차순으로 정렬하시오.
		// 		디버깅을 실행하면서 꼼꼼히 확인해보기
		int array[] = {10,4,3,29,31};
			
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length- i-1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];			
					array[j+1] = temp;
				}					
			}
		}
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
