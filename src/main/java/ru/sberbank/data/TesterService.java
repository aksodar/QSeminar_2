package ru.sberbank.data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesterService {

    ArrayList<Tester> list;

    public TesterService() {
        this.list = new ArrayList<>();
    }

    public boolean createTester(int id, String firstName, String secondName) {
        if ((firstName != null) && (secondName != null) && (!firstName.isEmpty()) && (!secondName.isEmpty())) {
            Tester tester = new Tester(id, firstName, secondName);
            list.add(tester);
            return true;
        }
        return false;
    }

    public Tester getTester(String firstName, String secondName) {
        for (Tester s: list) {
            if ((firstName.equalsIgnoreCase(s.firstName)) && (secondName.equalsIgnoreCase(s.secondName))) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Tester> getFreeTesters() {
        ArrayList<Tester> temp = new ArrayList<>();
        for (Tester s: list) {
            if (s.isFree == true) {
                temp.add(s);
            }
        }
        return temp;
    }
}
