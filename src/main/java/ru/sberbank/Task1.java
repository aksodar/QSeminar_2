package ru.sberbank;

import ru.sberbank.data.Developer;
import ru.sberbank.data.Task;
import ru.sberbank.data.TaskService;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        System.out.println(taskService.createTask(1, "Task 1"));
        System.out.println(taskService.createTask(2, "Task 2"));
        System.out.println(taskService.createTask(3, "Task 3"));
        System.out.println(taskService.createTask(4, "Task 4"));
        System.out.println(taskService.createTask(5, "Task 5"));
        System.out.println(taskService.createTask(3, "Task 6"));

        Task task_to_develop1 = taskService.getTask("Task 1");
        Task task_to_develop4 = taskService.getTask("Task 4");

        Developer developer = new Developer(1);
        System.out.println("Передаём задачу 1 разработчику, рузультат: " + developer.addTask(task_to_develop1));
        System.out.println("Выполняем задачу 1, рузультат: " + developer.makeTask());


        Developer developer2 = new Developer(2);
        System.out.println("Передаём задачу 4 разработчику, рузультат: " + developer2.addTask(task_to_develop4));
        System.out.println("Выполняем задачу 4, рузультат: " + developer2.makeTask());


        System.out.println();
        System.out.println("Список задач, для разработки");
        for (Task task : taskService.getTasksForDeveloping()) {
            System.out.println(task);
        }


    }

}
