package homework_44.mini_marathon.book.model;

import java.util.List;

public class Client {
    private String name;
    private List<Book> borrowedBooks;

    public Client(String name, List<Book> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("name='").append(name).append('\'');
        sb.append(", borrowedBooks=").append(borrowedBooks);
        sb.append('}');
        return sb.toString();
    }
}
