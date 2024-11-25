package pl.jareczeq.kodillaspring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Display display;

    @Test
    void testCalculatorAdd() {
        //Given
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.add(15, 20);

        //Then
        assertEquals(35, result);
    }

    @Test
    void testCalculatorSub() {
        //Given
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.sub(10, 5);

        //Then
        assertEquals(5, result);
    }

    @Test
    void testCalculatorMul() {
        //Given
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.mul(10, 10);

        //Then
        assertEquals(100, result);
    }

    @Test
    void testCalculatorDiv() {
        //Given
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.div(20, 5);

        //Then
        assertEquals(4, result);
    }

}
