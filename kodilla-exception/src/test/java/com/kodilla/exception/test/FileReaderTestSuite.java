package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(() -> fileReader.readFile("names.txt"));
    }

    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1.5));
    }

}
