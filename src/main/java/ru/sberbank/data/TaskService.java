package ru.sberbank.data;

import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> arrayList;

    public TaskService() {
        this.arrayList = new ArrayList<>();
    }

    public boolean createTask (int id, String summary) {
        if(summary != null && summary.isEmpty() == false ){
            Task NewTask = new Task(id, summary);
            arrayList.add(NewTask);
            return true;
        }
        return false;
    }

    public Task getTask(String summary){
        for (Task n: arrayList){
            if(summary.equalsIgnoreCase(n.summary)) {
                return n;
            }
        }
        return null;
    }

    public ArrayList getTasksForDeveloping(){
        ArrayList<Task> NewList = new ArrayList<>();
        for (Task n: arrayList){
            if(n.isDeveloped == false){
                NewList.add(n);
            }
        }
        return NewList;
    }
}
