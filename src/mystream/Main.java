package mystream;

import mystream.immutable.Book;
import mystream.immutable.BookDirectory;
import mystream.person.Person;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //NumbersGenerator.generateOdd(11);

//        Person.getList().stream()
//                .map(x -> x.toUpperCase())
//                //.filter(x -> x.length() < 6)
//                .filter(x -> x.length() > 4)
//                .map(x -> x.substring(0, x.indexOf(' ') + 2) + ".")
//                .filter(x -> x.toLowerCase().startsWith("m"))
//                .forEach(x -> System.out.println("*** " + x + " ***"));

        BookDirectory bookDirectory = new BookDirectory();
        List<Book> resultBookList =  bookDirectory.getBookList().stream()
                .filter(book -> book.getPublishYear() > 1969)
                .collect(Collectors.toList());

        Map<UUID, Book> resultBookMap = bookDirectory.getBookList().stream()
                        .filter(book -> book.getPublishYear() <1969)
                        .collect(Collectors.toMap(Book::getId, book -> book));

        System.out.println("Numbers book after 1969 year: " + resultBookList.size());
        System.out.println("Numbers book before 1969 year: " + resultBookMap.size());

        resultBookMap.entrySet().stream()
                .map(x -> x.getValue().getPublishYear() + " : " +
                        x.getValue().getTitle() + " : " + x.getValue().getId())
                .forEach(x -> System.out.println("|| " + x + " ||"));

        String resultStatment = bookDirectory.getBookList().stream()
                .filter(book -> book.getAuthor().startsWith("T"))
                .map(Book::toString)
                .collect(Collectors.joining("|||", "***", "***"));

        System.out.println(resultStatment);

    }
}