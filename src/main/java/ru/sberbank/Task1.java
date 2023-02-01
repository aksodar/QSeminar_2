package ru.sberbank;

import ru.sberbank.data.TaskService;

public class Task1 {

    public static void main(String[] args) {
        TaskService taskService= new TaskService();
        taskService.createTask(1,"first task");
        taskService.createTask(2,"second task");
        System.out.println(taskService.getTask("second task"));
        System.out.println(taskService.getTasksForDeveloping().toString());
    }

}
