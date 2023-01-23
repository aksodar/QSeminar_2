package ru.sberbank;

import ru.sberbank.data.TaskService;

public class Task1 {

    public static void main(String[] args) {
        TaskService t1 = new TaskService();
        t1.createTask(7, "new");
        System.out.println(t1.getTask("old"));
        System.out.println(t1.getTask("new").toString());
        System.out.println(t1.getTasksForDeveloping().toString());
    }
}
