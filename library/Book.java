package library;

public class Book {
   
   private String title; //제목
   private String author; //저자
   private String isbn; //도서번호
   
   public Book(String title, String author, String isbn) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }

   public String getIsbn() {
      return isbn;
   }
}