package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testNoRentedBooks() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Jakub", "Śliwczyński", "01234567890");

        //When
        var rentedBooks = bookLibrary.listBooksInHandsOf(libraryUser1);

        //Then
        assertEquals(0, rentedBooks.size());
    }

    @Test
    void testRentedABook() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Jakub", "Śliwczyński", "01234567890");
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(List.of(book1));

        //When
        var rentedBooks = bookLibrary.listBooksInHandsOf(libraryUser1);

        //Then
        assertEquals(1, rentedBooks.size());
        assertEquals(List.of(book1), rentedBooks);
    }

    @Test
    void testRentedFiveBooks() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Jakub", "Śliwczyński", "01234567890");
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book3 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book4 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book5 = new Book("Secrets of Alamo", "John Smith", 2008);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(List.of(book1, book2, book3, book4, book5));

        //When
        var rentedBooks = bookLibrary.listBooksInHandsOf(libraryUser1);

        //Then
        assertEquals(5, rentedBooks.size());
        assertEquals(List.of(book1, book2, book3, book4, book5), rentedBooks);
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}
