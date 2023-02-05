package ru.sberbank;

import ru.sberbank.data.Developer;
import ru.sberbank.data.Task;
import ru.sberbank.data.Tester;
import ru.sberbank.data.TesterService;

public class Homework {

    public static void main(String[] args) {
        Developer developer = new Developer(1);
        developer.addTask(new Task(1, "Check"));
        developer.makeTask();
        Task toTest = developer.getCurrentTask();
        TesterService testerService = new TesterService();
        System.out.println("Free testers:" +  testerService.getFreeTesters());
        testerService.createTester(1, "Damir", "Iskakov");
        testerService.createTester(2, "John", "Dow");
        System.out.println("Free testers:" +  testerService.getFreeTesters());
        Tester testerJohn = testerService.getTester("John", "Dow");
        testerJohn.addTask(toTest);
        System.out.println("Tester with task: " + testerJohn);
        System.out.println("Find tester Johnny :" + testerService.getTester("Johnny", ""));
        System.out.println("Free testers:" +  testerService.getFreeTesters());

    }

}
