package homework_43.book;

import book.dao.BookSrv;
import book.dao.BookSrvImpl;
import book.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookAppl {
    public static void main(String[] args) {
        BookSrv bookService = new BookSrvImpl();

        // Create a list of books
        List<Book> books = Arrays.asList(
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "F001"),
                new Book("1984", "George Orwell", "Dystopian", "D001"),
                new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "F002"),
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "F001"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "F003")
        );

        // Display all books
        System.out.println("All books:");
        bookService.displayAll(books);

        // Filter books by genre
        System.out.println("\nBooks in the Fantasy genre:");
        bookService.filterByGenre(books, "Fantasy").forEach(System.out::println);

        // Filter books by author
        System.out.println("\nBooks by J.R.R. Tolkien:");
        bookService.filterByAuthor(books, "J.R.R. Tolkien").forEach(System.out::println);

        // Get the most popular book
        System.out.println("\nMost popular book:");
        System.out.println(bookService.getMostPopularBook(books));

        // Get the most popular genre
        System.out.println("\nMost popular genre:");
        System.out.println(bookService.getMostPopularGenre(books));
    }
}
