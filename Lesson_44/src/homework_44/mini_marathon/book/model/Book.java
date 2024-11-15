package homework_44.mini_marathon.book.model;

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
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", specialCode='").append(specialCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
