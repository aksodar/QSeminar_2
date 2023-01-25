package ru.sberbank;

import ru.sberbank.data.TaskService;

public class Task1 {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.createTask(1,"testRoma");
        System.out.println(taskService.getTask("testRoma"));
        System.out.println(taskService.getTaskForDeveloping().toString());
    }

}
