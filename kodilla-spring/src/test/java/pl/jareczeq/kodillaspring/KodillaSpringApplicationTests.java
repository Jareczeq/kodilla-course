package pl.jareczeq.kodillaspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.jareczeq.kodillaspring.shape.Circle;
import pl.jareczeq.kodillaspring.shape.Shape;
import pl.jareczeq.kodillaspring.shape.Square;
import pl.jareczeq.kodillaspring.shape.Triangle;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("pl.jareczeq.kodillaspring");
        Shape shape = (Shape) context.getBean("circle");

        //When
        String name = shape.draw();

        //Then
        assertEquals("This is a circle", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("pl.jareczeq.kodillaspring");
        Shape shape = (Shape) context.getBean("triangle");

        //When
        String name = shape.draw();

        //Then
        assertEquals("This is a triangle", name);
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("pl.jareczeq.kodillaspring");
        Shape shape = (Shape) context.getBean("createSquare");

        //When
        String name = shape.draw();

        //Then
        assertEquals("This is a square", name);
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("pl.jareczeq.kodillaspring");
        Shape shape = (Shape) context.getBean("chosenShape");

        //When
        String name = shape.draw();

        //Then
        System.out.println("Chosen shape says: " + name);
    }

}
