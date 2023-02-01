package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
        Developer developer1 = new Developer(1, "Ivan", "Ivanov");
        Developer developer2 = new Developer(2, "Peter", "Petrov");

        System.out.println(developer1.equals2(developer2));
    }

}
