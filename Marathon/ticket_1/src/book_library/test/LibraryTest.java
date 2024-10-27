
package book_library.test;

import book_library.controller.Library;
import book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new Library(5);
        books = new Book[5];
        books[0] = new Book("1984", "Orwell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2005);

        // Add initial books to library
        for (int i = 0; i < books.length - 1; i++) {
            library.addBook(books[i]);
        }
    }

    @Test
    void testAddBookWithDuplicateISBN() {
        Book duplicateBook = new Book("Duplicate", "Author", 1_111_111_111_110L, 2015);
        assertFalse(library.addBook(duplicateBook), "Should not add book with duplicate ISBN.");
    }

    @Test
    void testLibraryCapacityLimit() {
        library.addBook(new Book("Extra Book", "Extra Author", 1_111_111_111_114L, 2020));
        assertFalse(library.addBook(new Book("Over Capacity", "Author", 1_111_111_111_115L, 2021)), 
                    "Should not add book beyond library capacity.");
    }

    @Test
    void testInvalidISBNThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Book("Invalid ISBN Book", "Author", 123456L, 2019));
        assertEquals("ISBN must be exactly 13 digits long.", exception.getMessage());
    }

    @Test
    void testRemoveBookWithNonexistentISBN() {
        assertFalse(library.removeBook(1_999_999_999_999L), "Should not remove book with non-existent ISBN.");
    }
}
