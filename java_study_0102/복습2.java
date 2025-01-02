package java_study_0102;

import java.util.ArrayList;

class Book{
	private String title;
	private String autor;

	public Book(String title, String autor) {
		this.title = title;
		this.autor = autor;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAutor() {
		return autor;
	}
}

public class 복습2 {

	public static void main(String[] args) {
		
		//Book 객체를 저장할 ArrayList 생성
		ArrayList<Book> library = new ArrayList<>();
		
		//도서관에 책을 넣어볼께요
		library.add(new Book("자바의 정석","남궁성"));
		library.add(new Book("데이터 구조와 알고리즘","홍길동"));
		library.add(new Book("AI","박길동"));
		
		//퀴즈(for-each문으로 저장된 도서를 하나씩 출력해보세요.
		for(Book i : library) {
			System.out.println("제목 : " + i.getTitle() + ", 저자 : " + i.getAutor());
		}
		
		//ArrayList 크기 확인
		System.out.println("도서관에 있는 책의 수 : " + library.size());
		
		//특정 인덱스의 책 정보 가져오기
		Book book2 = library.get(1); //1번 index 요소 가져오기
		System.out.println("책 이름 : " + book2.getTitle());
		
		//퀴즈) 0번째 요소 삭제 후 사이즈 출력하기
		library.remove(0);
		System.out.println("책 삭제후 책의 수 : " + library.size());
	}

}
