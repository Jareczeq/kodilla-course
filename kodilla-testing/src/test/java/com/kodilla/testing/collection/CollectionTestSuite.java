package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Checking behavior of the program when list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> evenNumbers = exterminator.exterminate(new ArrayList<>());
        System.out.println(evenNumbers);
    }

    @DisplayName("Checking behavior of the program when list is not empty")
    @Test
    void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = List.of(2, 5, 54, 19, 12, 6, 9);
        List<Integer> evenNumbers = exterminator.exterminate(numbers);
        System.out.println(evenNumbers);
    }

}
