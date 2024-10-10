package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
@Nested
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testShapeCollectorIsEmpty() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        String figures = collector.showFigures();

        //Then
        assertEquals("There are no shapes!", figures);
    }

    @Test
    void testShapeCollectorIsNotEmpty() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(4);
        Shape triangle = new Triangle(4, 2);

        //When
        collector.addShape(square);
        collector.addShape(triangle);

        //Then
        assertEquals("Shapes: Square, Triangle", collector.showFigures());
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(4);

        //When
        collector.addShape(square);

        //Then
        assertEquals(square, collector.getFigure(0));
    }

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(4);
        Shape triangle = new Triangle(4, 2);

        //When
        collector.addShape(square);
        collector.addShape(triangle);
        collector.removeShape(square);

        //Then
        assertEquals("Shapes: Triangle", collector.showFigures());
    }

}
