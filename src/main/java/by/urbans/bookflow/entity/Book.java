package by.urbans.bookflow.entity;

import java.util.Objects;

public class Book {
    int bookId;
    String bookName;
    String bookAuthor;
    int publicationYear;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, int publicationYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }

    public Book(int bookId, String bookName, String bookAuthor, int publicationYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, bookAuthor, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
               "bookId=" + bookId +
               ", bookName='" + bookName + '\'' +
               ", bookAuthor='" + bookAuthor + '\'' +
               ", publicationYear=" + publicationYear +
               '}';
    }
}
