package homework_44.mini_marathon.book.dao;



import homework_44.mini_marathon.book.model.Book;
import homework_44.mini_marathon.book.model.Client;

import java.util.List;

public interface BookSrv {
    void displayAll(List<Book> books);
    List<Book> filterByGenre(List<Book> books, String genre);
    List<Book> filterByAuthor(List<Book> books, String author);
    Book getMostPopularBook(List<Book> books);
    String getMostPopularGenre(List<Book> books);
    Client getMostFrequentClient(List<Client> clients);
}
