package pl.jareczeq.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1834, Month.JUNE, 28));
        Book book2 = new Book("Wesele", "Stanisław Wyspiański", LocalDate.of(1901, Month.MARCH, 16));
        Book book3 = new Book("Lalka", "Bolesław Prus", LocalDate.of(1890, Month.JULY, 13));
        Library library = new Library("Library nr. 1");
        library.getBooks().addAll(Set.of(book1, book2, book3));

        //When
        Library shallowCopy = null;
        Library deepCopy = null;

        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("Library nr. 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("Library nr. 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }



        //Then
        System.out.println(library);
        library.getBooks().forEach(System.out::println);
        System.out.println(shallowCopy);
        shallowCopy.getBooks().forEach(System.out::println);
        System.out.println(deepCopy);
        deepCopy.getBooks().forEach(System.out::println);

        assertEquals(shallowCopy.getBooks(), deepCopy.getBooks());

    }

}
