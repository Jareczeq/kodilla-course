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
    void testCalculations() {
        //Given
        Calculator calculator = new Calculator(display);

        //When
        double result1 = calculator.add(15, 20);
        double result2 = calculator.sub(10, 5);
        double result3 = calculator.mul(10, 10);
        double result4 = calculator.div(20, 5);

        //Then
        assertEquals(35, result1);
        assertEquals(5, result2);
        assertEquals(100, result3);
        assertEquals(4, result4);
    }

}
