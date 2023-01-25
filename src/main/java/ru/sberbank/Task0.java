package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
        Developer Dev1 = new Developer(1, "Ivan", "Ivanov");
        Developer Dev2 = new Developer(1, "Ivan", "IvanoV");
        System.out.println(Dev1.equals2(Dev2));

    }

}
