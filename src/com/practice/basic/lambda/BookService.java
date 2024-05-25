package com.practice.basic.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBookingSort() {
        List<Book> books = new BookDAO().getBooks;
//        OLd comparator
//         Collections.sort(books,new MyComparator());
//         Java 8
        /*Collections.sort(books, (o1, o2) ->
                o1.getName().compareTo(o2.getName())
        );*/
        Collections.sort(books, Comparator.comparing(Book::getName));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookingSort());
    }
}

class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
