package ru.sberbank;

import ru.sberbank.data.TesterService;
import ru.sberbank.data.Tester;

public class Homework {

    public static void main(String[] args) {
        TesterService testerService = new TesterService();
        testerService.createTester(1,"Roman", "Chovgun");
        System.out.println(testerService.getTester("Roman", "Chovgun"));
        System.out.println(testerService.getFreeTesters().toString());
    }

}
