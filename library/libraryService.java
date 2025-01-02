package library;

import java.util.ArrayList;

//보통 인터페이스 뒤에 Service라는 단어를 붙입니다.
public interface LibrarayService2 {
   void addBook(Book book); //도서 추가
   void searchBook(String keyword); //도서 검색
   void removeBook(String isbn); //도서 삭제
   ArrayList<Book> getAllBooks(); //도서 전체 조회
}