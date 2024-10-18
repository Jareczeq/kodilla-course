package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {8, 4, 6};

        //When
        OptionalDouble average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(6, average.getAsDouble());
    }

}
