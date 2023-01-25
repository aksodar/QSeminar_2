package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
       Developer Dev1 = new Developer(1, "Ivan", "Petrov");
       Developer Dev2 = new Developer(2, "Ivan", "Petrov");
       System.out.println(Dev1.equals1(Dev2));
    }

}
