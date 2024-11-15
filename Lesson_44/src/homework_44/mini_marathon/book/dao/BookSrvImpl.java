package homework_44.mini_marathon.book.dao;

import homework_44.mini_marathon.book.model.Book;
import homework_44.mini_marathon.book.model.Client;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookSrvImpl implements BookSrv {

    @Override
    public void displayAll(List<Book> books) {
        books.forEach(System.out::println);
    }

    @Override
    public List<Book> filterByGenre(List<Book> books, String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> filterByAuthor(List<Book> books, String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    @Override
    public Book getMostPopularBook(List<Book> books) {
        Map<Book, Long> bookCount = books.stream()
                .collect(Collectors.groupingBy(book -> book, Collectors.counting()));
        return bookCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    @Override
    public String getMostPopularGenre(List<Book> books) {
        Map<String, Long> genreCount = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));
        return genreCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Unknown");
    }

    @Override
    public Client getMostFrequentClient(List<Client> clients) {
        return clients.stream()
                .max(Comparator.comparingInt(client -> client.getBorrowedBooks().size()))
                .orElse(null);
    }
}
