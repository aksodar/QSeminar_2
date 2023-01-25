package ru.sberbank.data;

import java.util.ArrayList;

public class TesterService {
    ArrayList<Tester> list;

    public TesterService() {
        this.list = new ArrayList<>();
    }

    public boolean createTester(int id, String firstName, String secondName) {
        if(firstName != null && secondName != null && firstName.isEmpty() == false && secondName.isEmpty() == false) {
            Tester newTester = new Tester(id, firstName, secondName);
            list.add(newTester);
            return true;
        }
        return false;
    }

    public Tester getTester(String firstName, String secondName) {
        for (Tester t: list)  {
            if(firstName.equalsIgnoreCase(t.firstName) && secondName.equalsIgnoreCase(t.secondName)) {
                return t;
            }
        }
        return null;
    }

    public ArrayList getFreeTesters() {
        ArrayList<Tester> freeTester = new ArrayList<>();
        for (Tester n: list) {
            if(n.isFree == true) {
                freeTester.add(n);
            }
        }
        return freeTester;
    }


}
