package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    void testGetListFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                        .filter(n -> books.get(n).year() > 2007)
                        .count();

        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

}
