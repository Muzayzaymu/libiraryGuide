public class Book {
    private String title;
    private int yearPublication;
    private Author Author;

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

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
