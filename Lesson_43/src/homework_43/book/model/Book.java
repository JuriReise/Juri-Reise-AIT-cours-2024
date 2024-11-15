package homework_43.book.model;

public class Book {
    private String title;
    private String author;
    private String genre;
    private String specialCode;

    public Book(String title, String author, String genre, String specialCode) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.specialCode = specialCode;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + ''' +
                ", author='" + author + ''' +
                ", genre='" + genre + ''' +
                ", specialCode='" + specialCode + ''' +
                '}';
    }
}
