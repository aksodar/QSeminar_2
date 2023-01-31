package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
        Developer one = new Developer(1, "Ivan", "Ivanov");
        Developer two = new Developer(1, "Ivan", "IVANOV");
        Developer three = new Developer(2, "Petr", "Petrov");
        System.out.println(one.equalsDev(one));
        System.out.println(one.equalsDev(two));
        System.out.println(one.equalsDev(three));
    }

}
