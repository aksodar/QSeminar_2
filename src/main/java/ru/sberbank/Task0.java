package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {

    public static void main(String[] args) {
        Developer d1 = new Developer(1, "Roman", "Chovgun");
        Developer d2 = new Developer(1, "Roman", "Chovgun");
        System.out.println(d1.equals(d2));
    }
}
