package java_study_1206;

public class java_study_1206_2 {

	public static void main(String[] args) {
		/*
		 *  정렬 알고리즘
		 *  
		 *  버블, 삽입, 선택
		 *  
		 *  버블 정렬은 : 인접한 두 원소를 비교하여 큰 값을 뒤로 보내는 과정을 반복
		 *  만들기가 쉽고 직관적일 뿐이지 알고리즘적 관점에서 보면 비효율 적인 정렬 방식
		 *  
		 */
		
		int array[] = {7,4,5,1,3};
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("i의 값 : " + i);
			for(int j = 0; j < array.length-i-1; j++) {
				//인접한 두 원소 비교하기
				int x = array[j];
				int y = array[j+1];
				if(x > y) {
					// swap
					int temp = x;
					array[j] = y;
					array[j+1] = temp;
				}				
			}
		}
		

	}

}
