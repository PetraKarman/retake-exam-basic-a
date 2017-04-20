import java.util.*;
import java.util.List;

public class BookShelf {
  List<Book> bookList = new ArrayList<>();

  public void put(Book newBook) {
    this.bookList.add(newBook);
  }

  public void remove(Book bookToRead) {
    this.bookList.remove(bookToRead);
  }

  public String favouriteAuthor(List<Book> myList) {
    HashMap<String, Integer> names = new HashMap<>();
    for (int i = 0; i < myList.size(); i++) {
      if (!names.containsKey(myList.get(i))) {
        names.put(myList.get(i).author, 1);
      } else {
        names.put(myList.get(i).author, +1);
      }
    }
    int maxValue = (Collections.max(names.values()));
    for (String s : names.keySet()) {
      if (names.get(s) == maxValue) {
        return s;
      }
    }
    return null;
  }

  public Book earliestPublished(List<Book> myList) {
    int earliestTime = myList.get(0).releaseYear;
    Book oldestBook = null;
    for (Book actual : myList) {
      if (actual.releaseYear < earliestTime) {
        earliestTime = actual.releaseYear;
        oldestBook = actual;
      }
    }
    return oldestBook;
  }

  public Book latestPublished(List<Book> myList) {
    int latestTime = myList.get(0).releaseYear;
    Book newestBook = null;
    for (Book actual : myList) {
      if (actual.releaseYear > latestTime) {
        latestTime = actual.releaseYear;
        newestBook = actual;
      }
    }
    return newestBook;
  }

  @Override
  public String toString() {
    return "You have " + bookList.size() + "books." + "\n" +
            "Earliest released: " + earliestPublished(bookList) + "\n" +
            "Latest released: " + latestPublished(bookList) + "\n" +
            "Favourite author: " + favouriteAuthor(bookList);
  }
}

