package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> list;

    public TaskService() {
        this.list = new ArrayList<Task>();
    }

    public boolean createTask(int id, String summary) {
        if (summary != null && summary.isEmpty() == false) {
            Task x = new Task(id, summary);
            list.add(x);
            return true;
        }
        return false;
    }
    public Task getTask(String summary){
        for(Task n: list){
            if(summary.equalsIgnoreCase(n.summary)){
                return n;
            }
        }
        return null;

    }
    public ArrayList getTaskForDeveloping(){
        ArrayList<Task> temp = new ArrayList<>();
        for(Task n: temp){
            if(n.isDeveloped == false){
                temp.add(n);
            }
        }
        return temp;
    }
}