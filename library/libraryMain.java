package library;

import java.util.Scanner;

public class libraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LibraryServiceImpl library = new LibraryServiceImpl();
		
		while(true) {
			System.out.println("★★★★★★ 도서 관리 프로그램 ★★★★★★");
			System.out.println("[1] 도서 추가 [2] 도서 검색 [3] 도서 삭제 [4] 모든 도서 조회 [5] 종료");
			System.out.print("메뉴를 선택 하세요 : ");
			
			int choice = scan.nextInt();
			scan.nextLine();
			
			if(choice == 1) {
				System.out.print("제목 : ");
				String title = scan.nextLine();
				System.out.println("저자 : ");
				String autor = scan.nextLine();
				System.out.println("ISBN : ");
				String isbn = scan.nextLine();
				library.addBook(new Book(title, autor, isbn));//도서 추가
			}else if (choice == 2) {
				System.out.print("검색어 : ");
				String keyword = scan.nextLine();
				library.searchBook(keyword);
			}else if (choice == 3) {
				System.out.print("삭제할 도서의 ISBN : ");
				String removeIsbn = scan.nextLine();
				library.removeBook(removeIsbn);
			}else if (choice == 4) {
				System.out.println("모든 도서 목록 : ");
				for(Book b : library.getAllBooks()) {
					System.out.println("제목 : " + b.getTitle());
				}
			}else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 선택 입니다.");
			}
		}

	}

}
