package ru.sberbank;

import ru.sberbank.data.Tester;
import ru.sberbank.data.TesterService;

public class Homework {

    public static void main(String[] args) {
        Tester tester1 = new Tester(1, "Ivan", "Ivanov");
        Tester tester2 = new Tester(1, "IVAN", "IVANOV");
        Tester tester3 = new Tester(2, "Petr", "Petrov");

        System.out.println(tester1.equalsTesters(tester1));
        System.out.println(tester1.equalsTesters(tester2));
        System.out.println(tester2.equalsTesters(tester3));

        TesterService tester = new TesterService();
        tester.createTester(1, "Ivan", "Ivanov");

        System.out.println(tester.getTester("Ivan", "Ivanov"));
        System.out.println(tester.getTester("Ivvvvvvvvvvan", "Ivanov")); //проверка несуществующего тестера
        System.out.println(tester.getFreeTesters());
    }

}
