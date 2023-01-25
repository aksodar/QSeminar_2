package ru.sberbank;

import ru.sberbank.data.TesterService;

public class Homework {

    public static void main(String[] args) {
        TesterService testerService = new TesterService();
        testerService.createTester(1,"Tester", "Testerov");

        System.out.println(testerService.getTester("Tester", "Testerov"));

        System.out.println(testerService.getFreeTesters().toString());
    }

}
