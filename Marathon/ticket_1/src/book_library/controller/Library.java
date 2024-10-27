
package book_library.controller;

import book_library.model.Book;

public class Library {

    // fields
    private Book[] books;
    private int size; // current count of books

    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // Add book with validation
    public boolean addBook(Book book) {
        if (book == null || size >= books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size++] = book;
        return true;
    }

    // Print all books
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    // Find book by author
    public Book findByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;
    }

    // Find book by ISBN
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    // Remove book by ISBN
    public boolean removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                books[i] = books[--size];
                books[size] = null;
                return true;
            }
        }
        return false;
    }

    // Return current size of the library
    public int size() {
        return size;
    }
}
