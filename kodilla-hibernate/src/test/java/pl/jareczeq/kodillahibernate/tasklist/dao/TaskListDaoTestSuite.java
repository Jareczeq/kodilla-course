package pl.jareczeq.kodillahibernate.tasklist.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.jareczeq.kodillahibernate.tasklist.TaskList;
import pl.jareczeq.kodillahibernate.tasklist.TaskListDao;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Learn Using Hibernate";
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> taskLists = taskListDao.findByListName(LISTNAME);
        assertEquals(1, taskLists.size());

        //Cleanup
        taskListDao.delete(taskList);
    }

}
