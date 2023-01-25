package ru.sberbank;

import ru.sberbank.data.TesterService;

public class Homework {

    public static void main(String[] args) {
        TesterService testerService = new TesterService();
        testerService.createTester(666, "Valera", "Sidorov");
        System.out.println(testerService.getTester("Valera", "Sidorov"));
        System.out.println(testerService.getFreeTester().toString());
    }
}
