package ru.sberbank.data;

import java.util.ArrayList;

public class TesterService {
    ArrayList<Tester> list;

    public TesterService() { this.list = new ArrayList<>(); }

    public boolean createTester(int id, String firstName, String secondName) {
        if (firstName != null && firstName.isEmpty() == false && secondName != null && secondName.isEmpty() == false) {
            Tester newTester = new Tester(id, firstName, secondName);
            list.add(newTester);
            return true;
        }
        return false;
    }

    public Tester getTester(String firstName, String secondName) {
        for (Tester i: list) {
            if (firstName.equalsIgnoreCase(i.firstName) && secondName.equalsIgnoreCase(i.secondName)) {
                return i;
            }
        }
        return null;
    }

    public ArrayList getFreeTesters() {
        ArrayList<Tester> tempList = new ArrayList<>();
        for (Tester listElement : list) {
            if (listElement.isFree == true) {
                tempList.add(listElement);
            }
        }
        return tempList;
    }
}
