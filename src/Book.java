import java.util.Objects;

public class Book {
    private final String title;
    private int yearPublication;
    private final Author Author;

    public Book (String title, int yearPublication, Author Author) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.Author = Author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return Author;
    }

    public void setYearPublication (int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublication, Author);
    }

    @Override
    public String toString() {
        return "Book: Title - " + title + ", author - " + Author + ", year publication - " + yearPublication + '.';
    }
}
