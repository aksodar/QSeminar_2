package ru.sberbank.data;

import java.util.ArrayList;

public class TesterService {
    ArrayList<Tester> list;

    public TesterService(){
        this.list = new ArrayList<>();
    }

    public boolean createTester(int id, String firstName, String secondName){
        if(firstName != null && firstName.isEmpty() == false && secondName != null && secondName.isEmpty() == false){
            Tester tester = new Tester(id, firstName, secondName);
            list.add(tester);
            return true;
        }
        return false;
    }

    public Tester getTester(String firstName, String secondName){
        for(Tester tester: list){
            if(firstName.equalsIgnoreCase(tester.firstName) && secondName.equalsIgnoreCase(tester.secondName)){
                return tester;
            }
        }
        return null;
    }

    public ArrayList getFreeTesters(){
        ArrayList<Tester> temp = new ArrayList<>();

        for(Tester tester: list){
            if(tester.isFree == true){
                temp.add(tester);
            }
        }
        return temp;
    }
}
