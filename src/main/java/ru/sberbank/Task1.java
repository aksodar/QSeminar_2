package ru.sberbank;

import ru.sberbank.data.Task;
import ru.sberbank.data.TaskService;

public class Task1 {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.createTask(1, "test");
        System.out.println(taskService.getTask("test"));
        System.out.println(taskService.getTask("teeeest"));
        System.out.println(taskService.getTasksForDeveloping());
    }

}
