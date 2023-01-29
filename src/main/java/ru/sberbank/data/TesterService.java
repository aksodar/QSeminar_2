package ru.sberbank.data;

import java.util.ArrayList;

public class TesterService {
    ArrayList<Tester> list;

    public TesterService() {
        this.list = new ArrayList<Tester>();
    }

    public boolean createTester(int id, String firstName, String secondName){
        if (firstName != null && secondName != null && firstName != "" && secondName != ""){
            Tester QA = new Tester(id, firstName, secondName);
            list.add(QA);
            return true;
        }
        return false;
    }
    public Tester getTester(String firstName, String secondName) {
        for (Tester n : list) {
            if (firstName.equalsIgnoreCase(n.firstName) && secondName.equalsIgnoreCase(n.secondName))
            return n;
        }
        return null;
    }


    public ArrayList getFreeTesters() {
        ArrayList<Tester> temp = new ArrayList<>();
        for (Tester n : list) {
            if (n.isFree == true) {
                temp.add(n);
            }
        }
        return temp;
    }
}


