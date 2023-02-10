package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
        Developer developer1 = new Developer(1, "Иван", "Ивановович");
        Developer developer2 = new Developer(2, "Сергей", "Ивановович");
        Developer developer3 = new Developer(1, "Иван", "Ивановович");

        System.out.println(developer1.equals2(developer2));
        System.out.println(developer1.equals2(developer3));
        System.out.println(developer3.equals2(developer2));
        System.out.println(developer3.equals2(developer1));

    }

}
