package ru.sberbank;

import ru.sberbank.data.Developer;

public class Task0 {


    public static void main(String[] args) {
        Developer a = new Developer(1, "Ivan", "Ivanov");
        Developer b = new Developer(2, "Alex", "Sergeev");
        System.out.println(a.equals2(b));


        Developer aa = new Developer(1, "Ivan", "Ivanov" );
        Developer bb = new Developer(1, "Ivan", "Ivanov");
        System.out.println(aa.equals2(bb));

        Developer aaa = new Developer(1, "Ivan", "Ivanov" );
        Developer bbb = new Developer(1, "Ivan", "IvanoV");
        System.out.println(aaa.equals2(bbb));

        Developer aaaa = new Developer(1, "Ivan", "Ivanov" );
        Developer bbbb = new Developer(1, "ivan", "ivanov");
        System.out.println(aaaa.equals2(bbbb));

        Developer aaaaa = new Developer(1, "Ivan", "Ivanov" );
        Developer bbbbb = new Developer(1, "ivan", "ivanov");
        System.out.println(aaaaa.equalsIgnoreCase2(bbbbb));



    }

}
