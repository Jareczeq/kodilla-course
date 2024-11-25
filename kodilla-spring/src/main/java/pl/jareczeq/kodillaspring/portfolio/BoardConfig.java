package pl.jareczeq.kodillaspring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskList1;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskList2;

    @Autowired
    @Qualifier("doneList")
    TaskList taskList3;

    @Bean
    public Board board() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList doneList() {
        return new TaskList();
    }

}
