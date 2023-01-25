package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
        Developer one = new Developer(5,"Roman","Chovgun");
        Developer two = new Developer(5,"roman", "Chovgun");
        System.out.println(one.equals2(two));
    }

}
