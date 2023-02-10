package ru.sberbank;

import ru.sberbank.data.*;

public class Homework {

    public static void main(String[] args) {
        TesterService testerService = new TesterService();
        System.out.println("Создаём четырёх тестеров");
        testerService.createTester(1, "Иван", "Иванов");
        testerService.createTester(2, "Сидор", "Сидоров");
        testerService.createTester(3, "Андрей", "Андреев");
        testerService.createTester(4, "Роман", "Романов");

        System.out.println("Пробуем создать тестера без SecondName, результат: "
                + testerService.createTester(5, "Иван", "") + "\n");

        System.out.println("Список созданных тестеров:");
        for (Tester tester : testerService.getFreeTesters()) {
            System.out.println(tester);
        }

        System.out.println();
        System.out.println("Создадим задачу и разработчика, и передадим задачу разработчику");
        TaskService taskService = new TaskService();
        taskService.createTask(10, "Задача 1");
        Task task = taskService.getTask("Задача 1");

        Developer developer = new Developer(20, "Кодер", "Прогеров");
        developer.addTask(task);
        System.out.println(task);
        System.out.println(developer + "\n");

        System.out.println("Выполним одну из задач и передадим её тестеру");
        developer.makeTask();
        Tester tester2 = testerService.getTester("Сидор", "Сидоров");
        tester2.addTask(task);
        System.out.println(tester2);
        System.out.println(task + "\n");

        System.out.println("Список cвободных тестеров:");
        for (Tester tester : testerService.getFreeTesters()) {
            System.out.println(tester);
        }


    }

}
