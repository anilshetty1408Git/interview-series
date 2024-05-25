package com.practice.basic.lambda;

import java.util.Arrays;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks = Arrays.asList(new Book(101, "Core java", 400),
            new Book(363, "Hibernate", 180),
            new Book(275, "Spring", 200),
            new Book(893, "WebService", 300),
            new Book(900, "Microservices", 400));
}
