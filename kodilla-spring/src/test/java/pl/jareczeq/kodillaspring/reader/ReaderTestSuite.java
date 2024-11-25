package pl.jareczeq.kodillaspring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ReaderTestSuite {

    @Test
    void testRead() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = applicationContext.getBean(Reader.class);

        //When & Then
        reader.read();
    }

    @Test
    void testConditional() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ReaderConfig.class);

        //When
        boolean book2Exists = applicationContext.containsBean("book2");

        //Then
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }

}
