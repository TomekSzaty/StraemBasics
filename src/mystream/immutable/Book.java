package mystream.immutable;

import java.util.UUID;

public final class Book {

    private final String title;
    private final String author;
    private final int publishYear;

    private UUID id;


    public Book(final String title, final String author, final int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public Book(String title, String author, int publishYear, UUID id) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.id = UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                '\'' + ", IdNum= " + id +
                '}';
    }
}
