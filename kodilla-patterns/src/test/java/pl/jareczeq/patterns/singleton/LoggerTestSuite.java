package pl.jareczeq.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testLogger() {
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("Jareczeq dołączył do gry!");

        //Then
        assertEquals("Jareczeq dołączył do gry!", logger.getLastLog());
    }

}
