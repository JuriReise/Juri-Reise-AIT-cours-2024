package homework_43.book.dao;

import book.model.Book;
import java.util.List;

public interface BookSrv {
    void displayAll(List<Book> books);
    List<Book> filterByGenre(List<Book> books, String genre);
    List<Book> filterByAuthor(List<Book> books, String author);
    Book getMostPopularBook(List<Book> books);
    String getMostPopularGenre(List<Book> books);
}
