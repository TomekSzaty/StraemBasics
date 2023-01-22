package mystream;

import mystream.person.Person;

public class Main {
    public static void main(String[] args) {

        //NumbersGenerator.generateOdd(11);

        Person.getList().stream()
                .map(x -> x.toUpperCase())
                //.filter(x -> x.length() < 6)
                .filter(x -> x.length() > 4)
                .map(x -> x.substring(0, x.indexOf(' ') + 2) + ".")
                .filter(x -> x.toLowerCase().startsWith("m"))
                .forEach(x -> System.out.println("*** " + x + " ***"));
    }
}