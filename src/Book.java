import java.util.Objects;

public class Book {
    private final Author authorName;
    private int publishingYear;
    private final String bookTitle;

    public Book(String bookTitle, int publishingYear, Author authorName) {
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(authorName, book.authorName) && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, publishingYear, bookTitle);
    }

    @Override
    public String toString() {
        return "Book {" +
                "Book title: " + bookTitle +
                ". Author's name: " + authorName +
                ". Publication year: " + publishingYear +
                ".}";
    }
}
