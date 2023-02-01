package ru.sberbank;

import ru.sberbank.data.TaskService;
import ru.sberbank.data.TesterService;

public class Homework {

    public static void main(String[] args) {
        TesterService testerService = new TesterService();
        testerService.createTester(1, "Ivan", "Ivanov");
        testerService.createTester(2, "Alex", "Schmidt");
        System.out.println(testerService.getTester("Alex", "Schmidt"));
        System.out.println(testerService.getFreeTesters());
    }

}
