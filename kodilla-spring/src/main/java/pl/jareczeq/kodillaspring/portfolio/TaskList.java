package pl.jareczeq.kodillaspring.portfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {

    private final List<String> tasksList;

    public TaskList(String... tasks) {
        tasksList = new ArrayList<>();

        tasksList.addAll(List.of(tasks));

    }

    public List<String> getTasksList() {
        return tasksList;
    }
}
