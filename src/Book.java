public class Book {
   String author;
   String bookTitle;
   int releaseYear;

  public Book(String author, String bookTitle, int releaseYear) {
    this.author = author;
    this.bookTitle = bookTitle;
    this.releaseYear = releaseYear;
  }

  @Override
  public String toString() {
    return author + " : " + bookTitle + " ( " + releaseYear + " ) ";
  }
}
