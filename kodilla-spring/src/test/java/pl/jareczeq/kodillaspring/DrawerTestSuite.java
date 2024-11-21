package pl.jareczeq.kodillaspring;

import org.junit.jupiter.api.Test;
import pl.jareczeq.kodillaspring.shape.Circle;
import pl.jareczeq.kodillaspring.shape.Drawer;
import pl.jareczeq.kodillaspring.shape.Triangle;

import static org.junit.jupiter.api.Assertions.*;

public class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle() {
        //Given
        Circle circle = new Circle();

        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();

        assertEquals("This is a circle", result);
    }

    @Test
    void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();

        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        assertEquals("This is a triangle", result);
    }

}
