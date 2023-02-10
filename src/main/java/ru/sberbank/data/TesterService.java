package ru.sberbank.data;

import java.util.ArrayList;

public class TesterService {
    ArrayList<Tester> list;

    public TesterService() {
        this.list = new ArrayList<>();
    }

    public boolean createTester(int id, String firstName, String secondName) {
        if (firstName == null || firstName.isEmpty()
                || secondName == null || secondName.isEmpty()) {
            return false;
        }
        this.list.add(new Tester(id, firstName, secondName));
        return true;
    }

    public Tester getTester(String firstName, String secondName) {
        for (Tester tester : this.list) {
            if (tester.firstName.equalsIgnoreCase(firstName)
                    && tester.secondName.equalsIgnoreCase(secondName)) {
                return tester;
            }
        }
        return null;
    }

    public ArrayList<Tester> getFreeTesters() {
        ArrayList<Tester> freeTesters = new ArrayList<>();
        for (Tester tester : this.list) {
            if (tester.isFree) {
                freeTesters.add(tester);
            }
        }
        return freeTesters;
    }

}
