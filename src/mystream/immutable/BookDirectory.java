package mystream.immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookDirectory {

    private final List<Book> bookList = new ArrayList<>();

    public BookDirectory() {
        bookList.add(new Book("One Book", "One Author", 1949, UUID.randomUUID()));
        bookList.add(new Book("Two Book", "Two Author", 1950, UUID.randomUUID()));
        bookList.add(new Book("Three Book", "Three Author", 1959,UUID.randomUUID()));
        bookList.add(new Book("Four Book", "Four Author", 1960, UUID.randomUUID()));
        bookList.add(new Book("Five Book", "Five Author", 1969, UUID.randomUUID()));
        bookList.add(new Book("Six Book", "Six Author", 1970, UUID.randomUUID()));
        bookList.add(new Book("Seven Book", "Seven Author", 1979, UUID.randomUUID()));
        bookList.add(new Book("Eight Book", "Eight Author", 1980, UUID.randomUUID()));
        bookList.add(new Book("Nine0 Book", "Nine Author", 1989, UUID.randomUUID()));
        bookList.add(new Book("Ten Book", "Ten Author", 1990, UUID.randomUUID()));
    }


        public List<Book> getBookList() {
        return bookList;
        }

}
