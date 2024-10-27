
package book_library.model;

import java.util.Objects;

public class Book {
    public static final int ISBN_LENGTH = 13;

    // fields
    private String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    // constructor
    public Book(String title, String author, long isbn, int yearOfPublishing) {
        if (String.valueOf(isbn).length() != ISBN_LENGTH) {
            throw new IllegalArgumentException("ISBN must be exactly " + ISBN_LENGTH + " digits long.");
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearOfPublishing = yearOfPublishing;
    }

    // getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public long getIsbn() { return isbn; }
    public int getYearOfPublishing() { return yearOfPublishing; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
