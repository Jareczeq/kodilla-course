package pl.jareczeq.patterns.factory;

import org.junit.jupiter.api.Test;
import pl.jareczeq.patterns.factory.tasks.Task;
import pl.jareczeq.patterns.factory.tasks.TaskFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK, "Buy 4 pieces of tomatos", "Tomatos", "4");
        shoppingTask.executeTask();

        //Then
        assertEquals("Buy 4 pieces of tomatos", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paitingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK, "Paint a wall", "wall", "red");
        paitingTask.executeTask();

        //Then
        assertEquals("Paint a wall", paitingTask.getTaskName());
        assertEquals(true, paitingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK, "Drive to Warsaw", "Warsaw", "car");
        drivingTask.executeTask();

        //Then
        assertEquals("Drive to Warsaw", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }

}
