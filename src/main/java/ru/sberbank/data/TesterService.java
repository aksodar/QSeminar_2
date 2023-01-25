package ru.sberbank.data;

import java.util.ArrayList;

public class TesterService {
    ArrayList<Tester> list;

    public TesterService(){
        this.list = new ArrayList<>();
    }

    public boolean createTester (int id, String firstName, String secondName){
        if(firstName != null && firstName.isEmpty() == false && secondName != null && secondName.isEmpty() == false){
            Tester NewTester = new Tester(id, firstName, secondName);
            list.add(NewTester);
            return true;
        }
        return false;
    }

    public Tester getTester (String firstName, String secondName){
        for (Tester x: list){
            if(firstName.equalsIgnoreCase(x.firstName) && secondName.equalsIgnoreCase(x.secondName)){
                return x;
            }
        }
        return null;
    }

    public ArrayList getFreeTester (){
        ArrayList<Tester> NewTesterList = new ArrayList<>();
        for(Tester y: list){
            if(y.isFree == false){
                NewTesterList.add(y);
            }
        }
        return NewTesterList;
    }

}

