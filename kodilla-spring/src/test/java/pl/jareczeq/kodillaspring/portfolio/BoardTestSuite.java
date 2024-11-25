package pl.jareczeq.kodillaspring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = applicationContext.getBean(Board.class);

        //When
        board.getToDoList().getTasksList().add("Insert datas to the table");
        board.getInProgressList().getTasksList().add("Create a table");
        board.getDoneList().getTasksList().add("Create a database");

        //Then
        assertEquals("Insert datas to the table", board.getToDoList().getTasksList().get(0));
        assertEquals("Create a table", board.getInProgressList().getTasksList().get(0));
        assertEquals("Create a database", board.getDoneList().getTasksList().get(0));
    }

}
