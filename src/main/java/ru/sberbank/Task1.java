package ru.sberbank;

import ru.sberbank.data.TaskService;

public class Task1 {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        taskService.createTask(1,"Test task1");

        System.out.println(taskService.getTask("Test task1"));

        System.out.println(taskService.getTasksForDeveloping().toString());

    }

}
