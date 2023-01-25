package ru.sberbank;

import ru.sberbank.data.TaskService;

public class Task1 {

    public static void main(String[] args) {
    TaskService taskService = new TaskService();
    taskService.createTask (1, "text");
    taskService.getTask("test");
    System.out.println(taskService.getTask("text"));

    System.out.println(taskService.getTaskForDeveloping().toString());
    }

}
