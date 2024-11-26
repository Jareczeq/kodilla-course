package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {
    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 1.5));
    }

    @Test
    void testProbablyIWillNotThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1));
    }

    @Test
    void testEdgeCases() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When and Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0000001, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.999999999, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99999999, 1))
        );
    }

}